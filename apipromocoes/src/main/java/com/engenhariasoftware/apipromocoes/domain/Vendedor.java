package com.engenhariasoftware.apipromocoes.domain;

public class Vendedor extends Pessoa {

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
