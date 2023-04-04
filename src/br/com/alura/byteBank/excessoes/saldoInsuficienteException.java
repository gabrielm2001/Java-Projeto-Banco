package br.com.alura.byteBank.excessoes;

public class saldoInsuficienteException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public saldoInsuficienteException(String msg) {
		super(msg);
	}

}
