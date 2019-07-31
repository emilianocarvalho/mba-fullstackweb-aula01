package com.mbafullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mbafullstack.entity.Atendente;

@Repository
public interface AtendenteRepository extends JpaRepository<Atendente, Long> {

}
