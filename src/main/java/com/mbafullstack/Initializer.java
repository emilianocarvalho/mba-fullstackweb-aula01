package com.mbafullstack;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.mbafullstack.entity.Atendente;
import com.mbafullstack.entity.Cliente;
import com.mbafullstack.entity.Tecnico;
import com.mbafullstack.repository.AtendenteRepository;
import com.mbafullstack.repository.ClienteRepository;
import com.mbafullstack.repository.TecnicoRepository;

@Component
public class Initializer implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private AtendenteRepository atendenteRepository;

	@Autowired
	private TecnicoRepository tecnicoRepository;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {

		Cliente cliente = new Cliente("ACME", 1212121, "123456","", "8399692-3678", "acme@email.com");

//		cliente.setNome("ACME");
//		cliente.setDoc("123456");
//		cliente.setRg(122121);
//		cliente.setTelefone("8399692-3678");
//		cliente.setEmail("acme@email.com");

		this.clienteRepository.saveAll(Arrays.asList(cliente));

		Atendente atendente = new Atendente("Antonio", 121212, "12344", "", 1);

		this.atendenteRepository.saveAll(Arrays.asList(atendente));

		Tecnico tecnico = new Tecnico("Paulo", 112121, "12355", "", 2);

		this.tecnicoRepository.saveAll(Arrays.asList(tecnico));

	}

}
