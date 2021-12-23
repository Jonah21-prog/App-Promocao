package com.engenhariasoftware.apipromocoes.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.engenhariasoftware.apipromocoes.domain.Categoria;
import com.engenhariasoftware.apipromocoes.domain.Cidade;
import com.engenhariasoftware.apipromocoes.domain.Endereco;
import com.engenhariasoftware.apipromocoes.domain.Estado;
import com.engenhariasoftware.apipromocoes.repositories.CategoriaRepository;
import com.engenhariasoftware.apipromocoes.repositories.CidadeRepository;
import com.engenhariasoftware.apipromocoes.repositories.EnderecoRepository;
import com.engenhariasoftware.apipromocoes.repositories.EstadoRepository;

@Configuration
@Profile("local")
public class LocalConfig {

	@Autowired
	private EstadoRepository repository;
	
	@Autowired
	private CidadeRepository cidadeRepository;

	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Bean
	public void startDB() {
		Estado e1 = new Estado(null, "Pernambuco");
		Estado e2 = new Estado(null, "Alagoas");
		
		repository.saveAll(List.of(e1,e2));
		
		Cidade c1 = new Cidade(null, "Garanhuns", e1); 
		Cidade c2 = new Cidade(null, "Palmeiras dos Indios", e2);
		cidadeRepository.saveAll(List.of(c1, c2));
	
		Endereco end1 = new Endereco(null, "Rua São Jorge", "23", "Casa", "Magano", "55294-560", c1);
		Endereco end2 = new Endereco(null, "Travessa Baixa Fria", "67", "Ap1", "Palmeira de Fora", "57608-380", c2);
		enderecoRepository.saveAll(List.of(end1, end2));

		Categoria cat1 = new Categoria(null, "Frios");
		Categoria cat2 = new Categoria(null, "Bebidas");
		categoriaRepository.saveAll(List.of(cat1, cat2));
		
	}
	
}
