package br.com.estudo;


import br.com.estudo.br.com.estudo.model.Cart;
import br.com.estudo.br.com.estudo.model.Client;
import br.com.estudo.br.com.estudo.model.br.com.estudo.repository.CartRepositoy;
import br.com.estudo.br.com.estudo.model.br.com.estudo.repository.ClientRepositoy;
import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class VendasApplication {

    @Autowired
    ClientRepositoy clientRepositoy;

    @Autowired
    CartRepositoy cartRepositoy;

    @Bean
    public CommandLineRunner init(){
        return args ->{

            Client c = new Client();
            c.setName("Paulo");

            clientRepositoy.save(c);

            Cart cart = new Cart();
            cart.setClient(c);
            cart.setValue(BigDecimal.valueOf(100));
            cart.setCartDate(LocalDate.now());

            cartRepositoy.save(cart);

            c = clientRepositoy.findClientFetchCart(c.getId());

            System.out.println(c);

            System.out.println(c.getCarts());


        };
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}
