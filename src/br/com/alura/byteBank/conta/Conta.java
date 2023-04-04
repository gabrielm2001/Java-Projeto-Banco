package br.com.alura.byteBank.conta;

import br.com.alura.byteBank.excessoes.*;

public abstract class Conta {

	/**
	 * Atributos da Conta
	 */
//	<Atributos>
	private int agencia;
	private int numero;
	private double saldo;
//	<Atributos/>
	
	
	
//	<Contrutor>
	public Conta(int numero, int agencia) {
		this.agencia = agencia;
		this.numero = numero;
	}
//	<Contrutor/>
	
	
	
//	<Métodos>
	public void saca(double valorSacar) {
		if (valorSacar > this.saldo) {
			throw new saldoInsuficienteException("Saldo Insuficiente para sacar");
		}
		this.saldo -= valorSacar;
	}
	
	public void deposita(double valorDepositar) {
		this.saldo += valorDepositar;
	}
	
	public void tranferir(double valorTransferir, Conta receptor) {
		if (valorTransferir > this.saldo) {
			throw new saldoInsuficienteException("Saldo insuficiente para transferir");
		}
		this.saldo -= valorTransferir;
		receptor.deposita(valorTransferir);
	}
//	<Métodos/>
	
	
//	<Getters>
	public int getNumero() {
		return numero;
	}
	public int getAgencia() {
		return agencia;
	}
	public double getSaldo() {
		return saldo;
	}
//	<Getters>
	
	
	
	
//	<Setters>
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
//	<Setters/>

}

