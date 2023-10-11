package com.generador.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generador.model.Codigo;

@Repository
public interface CodigoRepository extends JpaRepository<Codigo, Long>{
	Optional<Codigo> findById(int id);
}
