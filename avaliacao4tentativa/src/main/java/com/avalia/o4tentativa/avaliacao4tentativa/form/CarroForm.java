package com.avalia.o4tentativa.avaliacao4tentativa.form;

import com.sun.istack.NotNull;

public class CarroForm {

	@NotNull
	private String chassi;

	@NotNull
	private String nome;

	@NotNull
	private String cor;

	@NotNull
	private double valor;

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}



}
