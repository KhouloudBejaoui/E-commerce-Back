package com.server.server.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.server.server.Entity.ShoppingCart;

import java.util.Optional;

import javax.transaction.Transactional;

@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart,Long> {

    Optional<ShoppingCart> findByClientId(long id_client);

    @Transactional
    @Modifying
    @Query("delete from ShoppingCart sc where sc.product.id=:#{#id_product} AND sc.client.id=:#{#id_client}")
    void deleteProductInShoppingCartByProductAndClient(@Param("id_product") long id_product, @Param("id_client") long id_client);



}
