package com.engenhariasoftware.apipromocoes.domain;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {

	private List<Loja> lojas = new ArrayList<>();

	public Cliente() {
		super();
	}

	public Cliente(Integer id, String nome, String cpf, String email, String senha, Endereco endereco) {
		super(id, nome, cpf, email, senha, endereco);
	}

	public List<Loja> getLojas() {
		return lojas;
	}

	public void setLojas(List<Loja> lojas) {
		this.lojas = lojas;
	}

}
