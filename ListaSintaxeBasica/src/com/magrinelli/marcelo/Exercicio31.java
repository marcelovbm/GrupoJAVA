package com.magrinelli.marcelo;

public class Exercicio31 {
	public static void imprimeArray(int[] array){
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,5};
		imprimeArray(array);
	}
}