package com.magrinelli.marcelo;

public class Aluno extends Pessoa implements Cloneable{

	private int notaFinal;
	private int quantidadeDeFaltas;
	
	public int getNotaFinal() {
		return notaFinal;
	}
	
	public void setNotaFinal(int notaFinal) {
		this.notaFinal = notaFinal;
	}
	
	public int getQuantidadeDeFaltas() {
		return quantidadeDeFaltas;
	}
	
	public void setQuantidadeDeFaltas(int quantidadeDeFaltas) {
		this.quantidadeDeFaltas = quantidadeDeFaltas;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}