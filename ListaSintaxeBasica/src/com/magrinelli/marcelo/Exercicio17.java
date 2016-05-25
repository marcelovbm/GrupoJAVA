package com.magrinelli.marcelo;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		char caracter;
		
		System.out.print("Digite um operador: ");
		caracter = scanner.next().charAt(0);
		switch (caracter) {
		case '+':
			System.out.println("Voce digitou um operador de prioridade simples");
			break;
		case '-':
			System.out.println("Voce digitou um operador de prioridade simples");
			break;
		case '/':
			System.out.println("Voce digitou um operador de prioridade alta");
			break;
		case '*':
			System.out.println("Voce digitou um operador de prioridade alta");
			break;			
		default:
			System.out.println("Po!! Voce nao digitou nenhum operador valido");
			break;
		}	
	}
}