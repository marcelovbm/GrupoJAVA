package com.magrinelli.marcelo;



public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bhaskara bhaskara = new Bhaskara(1, 3, -4);
		double[] raizes = bhaskara.retornaRaizes();
		if(raizes[0] < 0){
			System.out.println("Não tem raiz");
		} else {
			System.out.println(raizes[0] + " " + raizes[1]);
		}
	}
}