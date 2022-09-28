package br.com.estudo.br.com.estudo.model.br.com.estudo.repository;

import br.com.estudo.br.com.estudo.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

public interface ClientRepositoy extends JpaRepository<Client,Integer> {

    @Query(" select c from Client c where c.name like :name")
    List<Client> encontrarPorNome(@Param("name") String name);

    @Modifying
    @Transactional
    void deleteByNameLike(String name);

    List<Client> findByNameLike(String name);

    @Query(" select c from Client c left join fetch c.carts where c.id =:id ")
    Client findClientFetchCart(@Param("id") Integer id);


}
