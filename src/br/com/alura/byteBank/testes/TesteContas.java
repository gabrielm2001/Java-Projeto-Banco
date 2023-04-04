package br.com.alura.byteBank.testes;

import br.com.alura.byteBank.conta.*;

public class TesteContas {

	public static void main(String[] args) {
			
		Conta cc1 = new ContaCorrente(123, 234);
			
		cc1.deposita(-400);
		
		System.out.println(cc1.getSaldo());
			
	}

}
