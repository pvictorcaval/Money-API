package com.moneyapi.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moneyapi.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
