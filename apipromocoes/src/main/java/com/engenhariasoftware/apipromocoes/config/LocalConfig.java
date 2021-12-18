package com.engenhariasoftware.apipromocoes.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.engenhariasoftware.apipromocoes.domain.Estado;
import com.engenhariasoftware.apipromocoes.repositories.EstadoRepository;

@Configuration
@Profile("local")
public class LocalConfig {

	@Autowired
	private EstadoRepository repository;
	
	@Bean
	public void startDB() {
		Estado e1 = new Estado(null, "Pernambuco");
		Estado e2 = new Estado(null, "Alagoas");
		
		repository.saveAll(List.of(e1,e2));
	}
	
}
