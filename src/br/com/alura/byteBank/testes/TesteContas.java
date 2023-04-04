package br.com.alura.byteBank.testes;

import br.com.alura.byteBank.conta.*;

public class TesteContas {

	public static void main(String[] args) {
			
		Conta cc1 = new ContaCorrente(123, 234);
		Conta cc2 = new ContaCorrente(123, 34);	
		
		cc1.deposita(19000);
		cc1.tranferir(500, cc2);
		
		cc1.calculaImpostos();
		
		System.out.println(cc1.getImposto());
	}

}
