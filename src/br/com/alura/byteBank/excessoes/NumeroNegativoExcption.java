package br.com.alura.byteBank.excessoes;

public class NumeroNegativoExcption extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NumeroNegativoExcption(String msg) {
		super(msg);
	}

}
