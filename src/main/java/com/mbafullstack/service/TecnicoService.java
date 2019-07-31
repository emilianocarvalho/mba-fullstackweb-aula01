package com.mbafullstack.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mbafullstack.entity.Tecnico;
import com.mbafullstack.repository.TecnicoRepository;

@Service
public class TecnicoService {

	@Autowired
	TecnicoRepository tecnicoRepository;
	
	public Tecnico find(Long id) {
		Optional<Tecnico> obj = tecnicoRepository.findById(id);
		return obj.orElse(null);
	}
	
	public List<Tecnico> findAll(){
		return tecnicoRepository.findAll();
	}
	
	public void save(Tecnico tecnico) {
		tecnicoRepository.save(tecnico);
	}
}
