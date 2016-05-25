package com.magrinelli.marcelo;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char caracter1 = 'o', caracter2  = 'o';
		float pontoFlutuante1 = 12, pontoFlutuante2 = 12;
		String string1 = "marcelo", string2 = "marcelo";
		
		if(caracter1 == caracter2){
			System.out.println("Os caracteres são iguais!");
		} else {
			System.out.println("Os caracteres não são iguais!");
		}
		if(pontoFlutuante1 == pontoFlutuante2){
			System.out.println("Os pontos flutuantes são iguais!");
		} else {
			System.out.println("Os pontos flutuantes não são iguais!");
		}
		if(string1.equals(string2)){
			System.out.println("As strings são iguais!");
		} else {
			System.out.println("As strings não são iguais!");
		}
	}
}