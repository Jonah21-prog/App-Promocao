package com.engenhariasoftware.apipromocoes.domain.dtos;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import com.engenhariasoftware.apipromocoes.domain.Loja;

public class LojaDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;

	@NotNull(message = "O campo NOME DA LOJA é requerido")
	private String nome;

	@NotNull(message = "O campo ENDERECO é requerido")
	private Integer endereco;

	@NotNull(message = "O campo NOME DA OFERTA é requerido")
	private Integer oferta;

	private Integer cliente;

	public LojaDTO() {
		super();
	}

	public LojaDTO(Loja obj) {
		super();
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.endereco = obj.getEndereco().getId();
		this.oferta = obj.getOferta().getId();
		this.cliente = obj.getCliente().getId();
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

	public Integer getEndereco() {
		return endereco;
	}

	public void setEndereco(Integer endereco) {
		this.endereco = endereco;
	}

	public Integer getOferta() {
		return oferta;
	}

	public void setOferta(Integer oferta) {
		this.oferta = oferta;
	}

	public Integer getCliente() {
		return cliente;
	}

	public void setCliente(Integer cliente) {
		this.cliente = cliente;
	}

}
