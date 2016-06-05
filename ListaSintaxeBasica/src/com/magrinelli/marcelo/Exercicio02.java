package com.magrinelli.marcelo;

import java.util.*;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int tamanhoArray;
		
		System.out.println("Digite um numero inteiro para o tamanho do array:");
		tamanhoArray = scanner.nextInt();
		
		String[] array = new String[tamanhoArray];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Digite um valor para o array:");
			array[i] = scanner.next();
		}
		for (String i : array) {
			System.out.print(i);
		}
		
		scanner.close();
	}

}
