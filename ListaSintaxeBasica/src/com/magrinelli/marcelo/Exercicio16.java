package com.magrinelli.marcelo;

import java.util.*;
public class Exercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um operador: ");
		char caracter = scanner.next().charAt(0);
		if(caracter == '+' || caracter == '-'){
			System.out.println("Voce digitou um operador de prioridade simples");
		} else if(caracter == '/' || caracter == '*'){
			System.out.println("Voce digitou um operador de prioridade alta");
		} else {
			System.out.println("Po!! Voce nao digitou nenhum operador valido");
		}
		scanner.close();
	}

}
