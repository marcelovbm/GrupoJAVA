package com.magrinelli.marcelo;

public class Exercicio25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		double soma = 0;
		for (int i = 1; i <= array.length; i++) {
			soma += i * array[i-1];
		}
		System.out.println(soma);
	}
}