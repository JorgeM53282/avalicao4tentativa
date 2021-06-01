package com.avalia.o4tentativa.avaliacao4tentativa.DTO;

import com.avalia.o4tentativa.avaliacao4tentativa.Entity.Carro;

public class CarroDto {

	private Long id;
	private String chassi;
	private String nome;
	private String cor;
	private double valor;

	public CarroDto() {
		super();
	}

	public CarroDto(Long id, String chassi, String nome, String cor, double valor) {
		super();
		this.id = id;
		this.chassi = chassi;
		this.nome = nome;
		this.cor = cor;
		this.valor = valor;
	}

	public CarroDto(Carro carro) {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
