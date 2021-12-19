package com.engenhariasoftware.apipromocoes.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.engenhariasoftware.apipromocoes.domain.Estado;
import com.engenhariasoftware.apipromocoes.domain.dtos.EstadoDTO;
import com.engenhariasoftware.apipromocoes.services.EstadoService;

@RestController
@RequestMapping(value = "/estados")
public class EstadoResources {

	@Autowired
	private ModelMapper mapper;
	
	@Autowired
	private EstadoService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<EstadoDTO> findById(@PathVariable Integer id) {
		return ResponseEntity.ok().body(mapper.map(service.findById(id), EstadoDTO.class));
	}
	
	@GetMapping
	public ResponseEntity<List<EstadoDTO>> findAll() {
		return ResponseEntity.ok()
				.body(service.findAll()
						.stream().map(x -> mapper.map(x, EstadoDTO.class)).collect(Collectors.toList()));
	}
	
}
