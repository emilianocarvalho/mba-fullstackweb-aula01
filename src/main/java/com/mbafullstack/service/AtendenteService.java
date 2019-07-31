package com.mbafullstack.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mbafullstack.entity.Atendente;
import com.mbafullstack.repository.AtendenteRepository;

@Service
public class AtendenteService {

	@Autowired
	AtendenteRepository atendenteRepository;
	
	public Atendente find(Long id) {
		Optional<Atendente> obj = atendenteRepository.findById(id);
		return obj.orElse(null);
	}
	
	public List<Atendente> findAll(){
		return atendenteRepository.findAll();
	}
	
	public void save(Atendente atendente) {
		atendenteRepository.saveAll(Arrays.asList(atendente));
	}
}
