package com.magrinelli.marcelo;

import java.util.Scanner;

public class Exercicio39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int numero;
		int contador = 0;
		System.out.print("Digite um numero: ");
		numero = scanner.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			if(numero%i == 0){
				contador++;
			}
		}
		
		if(contador == 2){
			System.out.println("O numero " + numero + " e primo.");
		} else{
			System.out.println("O numero " + numero + " nao e primo.");
		}
	}
}