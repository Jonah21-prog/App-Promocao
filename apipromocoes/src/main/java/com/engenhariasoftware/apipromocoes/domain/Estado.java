package com.engenhariasoftware.apipromocoes.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Estado implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nome;

	private List<Cidade> cidades = new ArrayList<>();

	public Estado() {
		super();
	}

	public Estado(Integer id, String nome, List<Cidade> cidades) {
		super();
		this.id = id;
		this.nome = nome;
		this.cidades = cidades;
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

	public List<Cidade> getCidades() {
		return cidades;
	}

	public void setCidades(List<Cidade> cidades) {
		this.cidades = cidades;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estado other = (Estado) obj;
		return Objects.equals(id, other.id);
	}

}
