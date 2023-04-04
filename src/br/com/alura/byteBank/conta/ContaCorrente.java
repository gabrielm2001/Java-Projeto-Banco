package br.com.alura.byteBank.conta;

public class ContaCorrente extends Conta {

	public ContaCorrente(int numero, int agencia) {
		super(numero, agencia);
	}

	@Override
	public void deposita(double valorDepositar) {
		double novoValor = valorDepositar - 5;
		super.deposita(novoValor);
	}
}
