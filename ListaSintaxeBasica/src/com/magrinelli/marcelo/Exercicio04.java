package com.magrinelli.marcelo;

import java.util.Scanner;
public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);		
		float ponto1, ponto2;
		System.out.println("Digite o valor do primeiro ponto:");
		ponto1 = scanner.nextFloat();
		System.out.println("Digite o valor do segundo ponto:");
		ponto2 = scanner.nextFloat();
		
		System.out.println((Math.pow(ponto1, 120))/(Math.sqrt(ponto2)));
		
	}

}
