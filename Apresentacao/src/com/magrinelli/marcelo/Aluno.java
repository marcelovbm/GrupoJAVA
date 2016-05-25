package com.magrinelli.marcelo;

public class Aluno extends Pessoa{

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
	
	public Object clone(){
		return this;
	}
}