package com.mbafullstack.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mbafullstack.entity.Cliente;
import com.mbafullstack.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	ClienteRepository clienteRepository;
	
	public Cliente find(Long id) {
		Optional<Cliente> obj = clienteRepository.findById(id);
		return obj.orElse(null);
	}
	
	public List<Cliente> findAll(){
		return clienteRepository.findAll();
	}
	
	public void save(Cliente cliente) {
		clienteRepository.save(cliente);
	}
}
