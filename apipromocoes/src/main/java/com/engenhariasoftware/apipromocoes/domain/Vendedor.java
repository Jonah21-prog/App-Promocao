package com.engenhariasoftware.apipromocoes.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Vendedor extends Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "loja")
	private Loja loja;

	public Vendedor() {
		super();
	}

	public Vendedor(Integer id, String nome, String cpf, String email, String senha, Endereco endereco) {
		super(id, nome, cpf, email, senha, endereco);
	}

	public Loja getLoja() {
		return loja;
	}

	public void setLoja(Loja loja) {
		this.loja = loja;
	}

}
