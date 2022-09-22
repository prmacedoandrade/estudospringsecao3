package br.com.estudo.br.com.estudo.model.br.com.estudo.repository;

import br.com.estudo.br.com.estudo.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepositoy extends JpaRepository<Cart, Integer> {
}
