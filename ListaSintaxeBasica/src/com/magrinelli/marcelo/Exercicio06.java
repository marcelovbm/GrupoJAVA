package com.magrinelli.marcelo;

import java.util.*;
public class Exercicio06 {

	public static int soma( int numero1, int numero2){
		return numero1 + numero2;	
	}
	public static int subtracao(int numero1, int numero2){
		return numero1 - numero2;
	}
	public static int multiplicacao(int numero1, int numero2){
		return numero1 * numero2;
	}
	public static int divisao(int numero1, int numero2){
		return numero1 / numero2;
	}
	public static int restoDivisao(int numero1, int numero2){
		return numero1 % numero2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int numero1, numero2;
		
		System.out.print("Digite o valor do primeiro numero:");
		numero1 = scanner.nextInt();
		System.out.print("Agora digite o valor do segundo numero:");
		numero2 = scanner.nextInt();
		
		if(numero2 != 0){
		System.out.print("A soma entre estes numero é " + soma(numero1,numero2) + "\nA subtracao é " + subtracao(numero1,numero2) + 
				"\nA multiplicacao é " + multiplicacao(numero1,numero2) + "\nAdivisao é " + divisao(numero1,numero2) + 
				"\nO resto da divisao é " + restoDivisao(numero1,numero2));
		} else {
			System.out.println("O segundo numero não pode ter o valor '0'");
		}
	}
}
