package com.mbafullstack.entity;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Tecnico extends Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;

	private int matricula;

	public Tecnico() {
	}


	public Tecnico(String nome, int rg, String doc, String tipo, int matricula) {
		super(nome, rg, doc, tipo);
		this.matricula = matricula;
	}


	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Tecnico [matricula=" + matricula + "]";
	}

}
