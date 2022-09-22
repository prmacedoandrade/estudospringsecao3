package br.com.estudo.br.com.estudo.model.br.com.estudo.repository;

import br.com.estudo.br.com.estudo.model.Client;
import br.com.estudo.br.com.estudo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {



}
