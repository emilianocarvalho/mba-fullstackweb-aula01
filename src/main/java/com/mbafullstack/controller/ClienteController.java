package com.mbafullstack.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mbafullstack.entity.Cliente;
import com.mbafullstack.repository.ClienteRepository;

@RestController
@RequestMapping("/servicedesk")
public class ClienteController {

	@Autowired
	ClienteRepository clienteRepository;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Optional<Cliente>> find(@PathVariable("id") Long id) {
		Optional<Cliente> cliente = clienteRepository.findById(id);

		HttpHeaders headers = new HttpHeaders();
		headers.add("Responded", "ClienteController");

		return ResponseEntity.ok().headers(headers).body(cliente);
	}

}
