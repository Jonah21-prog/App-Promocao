package com.engenhariasoftware.apipromocoes.domain.dtos;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import com.engenhariasoftware.apipromocoes.domain.Oferta;

public class OfertaDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;

	@NotNull(message = "O campo NOME DA OFERTA é requerido")
	private String nome;

	@NotNull(message = "O campo PREÇO DA OFERTA é requerido")
	private double precoOferta;

	public OfertaDTO() {
		super();
	}

	public OfertaDTO(Oferta obj) {
		super();
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.precoOferta = obj.getPrecoOferta();
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

	public double getPrecoOferta() {
		return precoOferta;
	}

	public void setPrecoOferta(double precoOferta) {
		this.precoOferta = precoOferta;
	}

}
