package com.mbafullstack.entity;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Cliente extends Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;

	private String email;
	
	private String telefone;
	
	public Cliente() {
		
	}

	public Cliente(String nome, int rg, String doc, String tipo, String email, String telefone) {
		super(nome, rg, doc, tipo);
		this.email = email;
		this.telefone = telefone;
		
	}



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Cliente [email=" + email + ", telefone=" + telefone + "]";
	}

	

}
