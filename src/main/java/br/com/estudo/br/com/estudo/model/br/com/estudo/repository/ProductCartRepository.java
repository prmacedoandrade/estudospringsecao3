package br.com.estudo.br.com.estudo.model.br.com.estudo.repository;

import br.com.estudo.br.com.estudo.model.ProductCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCartRepository extends JpaRepository<ProductCart, Integer> {
}
