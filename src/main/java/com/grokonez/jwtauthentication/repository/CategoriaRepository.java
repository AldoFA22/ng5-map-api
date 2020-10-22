package com.grokonez.jwtauthentication.repository;
import java.util.List;

import com.grokonez.jwtauthentication.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    @Query(value = "select NEW com.grokonez.jwtauthentication.model.Categoria(c.tipo, c.descripcion) from Categoria c")
    List<Categoria> findAll();
}