package com.magrinelli.marcelo;

import java.util.*;
public class Exercicio33 {

	public static int media(int[] array){
		int soma = soma(array);
		
		return soma/array.length;
	}
	
	public static int soma(int[] array){
		int soma = 0;
		for (int i = 0; i < array.length; i++) {
			soma += array[i];
		}
		return soma;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[5];
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Voce precisa digitar 5 numeros");
		for (int i = 0; i < array.length; i++) {
			System.out.print("Digite um numero: ");
			array[i] = scanner.nextInt();
		}
		System.out.println("Media " + media(array));
		System.out.println("Soma " + soma(array));
	}
}