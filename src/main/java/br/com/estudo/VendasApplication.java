package br.com.estudo;


import br.com.estudo.br.com.estudo.model.Client;
import br.com.estudo.br.com.estudo.model.br.com.estudo.repository.ClientRepositoy;
import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootApplication
public class VendasApplication {

    @Autowired
    ClientRepositoy clientRepositoy;

    @Bean
    public CommandLineRunner init(){
        return args ->{

            Client c = new Client();
            c.setName("Paulo");

            Client c1 = new Client();
            c1.setName("Renato");

            clientRepositoy.save(c);
            clientRepositoy.save(c1);

            List<Client> listClient = clientRepositoy.findAll();
            listClient.forEach(System.out::println);

            clientRepositoy.deleteByNameLike("%Paul%");

            System.out.println("AFTER DELETE");

            clientRepositoy.findAll().forEach(System.out::println);


        };
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}
