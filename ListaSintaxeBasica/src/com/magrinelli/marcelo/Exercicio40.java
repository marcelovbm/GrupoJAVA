package com.magrinelli.marcelo;

import java.util.Scanner;

public class Exercicio40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int numero;
		int divisores = 0;
		System.out.print("Digite um numero: ");
		numero = scanner.nextInt();
		
		for (int i = 1; i < numero; i++) {
			if(numero%i == 0){
				divisores += i;
			}
		}
		
		if(divisores == numero){
			System.out.println("O numero " + numero + " e um numero perfeito.");
		} else{
			System.out.println("O numero " + numero + " nao e um numero perfeito.");
		}
	}

}
