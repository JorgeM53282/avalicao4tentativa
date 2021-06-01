package com.avalia.o4tentativa.avaliacao4tentativa.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Carro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "chassi")
	private String chassi;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "cor")
	private String cor;
	
	@Column(name = "valor")
	private double valor;
	
	

	public Carro(String chassi, String nome, String cor, double valor) {
		super();
		this.chassi = chassi;
		this.nome = nome;
		this.cor = cor;
		this.valor = valor;
	}

	public Carro() {
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
