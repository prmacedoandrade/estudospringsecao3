package br.com.estudo.br.com.estudo.model.br.com.estudo.repository;

import br.com.estudo.br.com.estudo.model.Cart;
import br.com.estudo.br.com.estudo.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepositoy extends JpaRepository<Cart, Integer> {

    List<Cart> findByClient(Client client);

}
