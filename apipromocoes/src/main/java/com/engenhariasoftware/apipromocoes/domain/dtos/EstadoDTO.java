package com.engenhariasoftware.apipromocoes.domain.dtos;

import com.engenhariasoftware.apipromocoes.domain.Estado;

public class EstadoDTO {

	private Integer id;
	private String nome;

	public EstadoDTO() {
		super();
	}

	public EstadoDTO(Estado obj) {
		super();
		this.id = obj.getId();
		this.nome = obj.getNome();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
