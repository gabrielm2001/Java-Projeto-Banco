package br.com.alura.byteBank.conta;

public class ContaCorrente extends Conta {
	
	private double valorImposto;

	public ContaCorrente(int numero, int agencia) {
		super(numero, agencia);
	}

	@Override
	public void deposita(double valorDepositar) {
		double novoValor = valorDepositar - 5;
		super.deposita(novoValor);
	}

	
	
	@Override
	public void calculaImpostos() {
		double valor = super.getSaldo() * 0.1;
		this.valorImposto = valor;
		super.subtrairImpostos(valorImposto);
 	}

	@Override
	public double getImposto() {
		return this.valorImposto;
	}
}
