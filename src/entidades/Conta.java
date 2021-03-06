package entidades;

import entidades.erro.Tratamento;

public class Conta {
	
	private Integer numero;
	private String nome;
	private Double balanco;
	private Double limiteSaque;
	
	public Conta() {
		super();
	}
	
	public Conta(Integer numero, String nome, Double balanco, Double limiteSaque) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.balanco = balanco;
		this.limiteSaque = limiteSaque;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public Double getBalanco() {
		return balanco;
	}
	
	public void deposito (Double montante) throws Tratamento {
		if (montante<0) {
			throw new Tratamento("Não é possivel depositar saldo negativo");
		}else {
			balanco+=montante;
		}
	}
	
	public void saque(Double montante) throws Tratamento {
		if (montante>limiteSaque) {
			throw new Tratamento("Saque erro: O montante exedeu o limite de saque");
		}else if (montante>balanco) {
			throw new Tratamento("Saque erro: Balanço insuficiente");
		}else {
			balanco-=montante;
		}
	}
	
}
