package com.mbafullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mbafullstack.entity.Tecnico;

@Repository
public interface TecnicoRepository extends JpaRepository<Tecnico, Long> {

}
