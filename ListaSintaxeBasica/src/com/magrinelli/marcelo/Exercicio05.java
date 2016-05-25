package com.magrinelli.marcelo;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);		
		float raio;
		System.out.println("Digite o valor do raio de um circulo:");
		raio = scanner.nextFloat();
		
		System.out.println("O valor de seu perimetro é " + (float)(2*Math.PI*raio) + " e sua area é " + (float)(Math.PI*Math.pow(raio, 2)));
	}

}
