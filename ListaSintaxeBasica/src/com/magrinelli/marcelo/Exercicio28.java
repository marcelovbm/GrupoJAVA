package com.magrinelli.marcelo;

public class Exercicio28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,5,6};
		int soma = 0;
		
		for (int i = 1; i <= array.length; i++) {
			soma += i;
		}
		
		System.out.println("Tamanho do array: " + array.length + ", soma dos valores: " + soma + ", media aritmetica e: " + soma/array.length);
		
	}

}
