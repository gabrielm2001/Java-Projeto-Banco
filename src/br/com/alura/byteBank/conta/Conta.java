package br.com.alura.byteBank.conta;

import br.com.alura.byteBank.excessoes.*;
import br.com.alura.byteBank.interfaces.*;

public abstract class Conta implements CalculoDeImposto{

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
		if (valorSacar < 0) {
			throw new NumeroNegativoExcption("Não pode depositar valor negativo");
		}
		if (valorSacar > this.saldo) {
			throw new saldoInsuficienteException("Saldo Insuficiente para sacar");
		}
		this.saldo -= valorSacar;
	}
	
	public void deposita(double valorDepositar) {
		if (valorDepositar < 0) {
			throw new NumeroNegativoExcption("Não pode depositar valor negativo");
		}
		this.saldo += valorDepositar;
	}
	
	public void tranferir(double valorTransferir, Conta receptor) {
		if (valorTransferir < 0) {
			throw new NumeroNegativoExcption("Não pode depositar valor negativo");
		}
		if (valorTransferir > this.saldo) {
			throw new saldoInsuficienteException("Saldo insuficiente para transferir");
		}
		this.saldo -= valorTransferir;
		receptor.deposita(valorTransferir);
	}
	
	public double subtrairImpostos(double valorSubtrair) {
		return this.saldo -= valorSubtrair;
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

