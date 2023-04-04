package br.com.alura.byteBank.conta;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int numero, int agencia) {
		super(numero, agencia);
	}
	
	@Override
	public void deposita(double valorDepositar) {
		double novoValor = valorDepositar - 2;

		super.deposita(novoValor);
	}

}
