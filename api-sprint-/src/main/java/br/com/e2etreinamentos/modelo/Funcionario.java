package br.com.e2etreinamentos.modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Funcionario {

	private int id;
	private String nome;
	private String cargo;
	private LocalDateTime dataCriacao = LocalDateTime.now();
	private String tipoContratacao = "clt";
	private double salario;
	private String projeto = "Semana da pirâmide de teste";

	public Funcionario(String nome, String cargo, double salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}

	public int getId() {
		if (this.nome == "Stefanny") {
			id = 10;
		} else if (this.nome == "Anderson") {
			id = 11;
		} else if (this.nome == "Lorenzo") {
			id = 12;
		} else if (this.nome == "Isadora") {
			id = 13;
		}
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getCargo() {
		return cargo;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public String getContratacao() {
		return tipoContratacao;
	}

	public double getSalario() {
		return salario;
	}

	public String getProjeto() {
		return projeto;
	}

}
