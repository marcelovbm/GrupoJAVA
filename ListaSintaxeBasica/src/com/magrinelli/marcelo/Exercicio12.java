package com.magrinelli.marcelo;

import java.util.*;
public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		float[] pontoFlutuante = new float[5];
		float soma = 0;
		
		for(int i = 0; i < pontoFlutuante.length; i++){
			System.out.print("Digite um salario: ");
			pontoFlutuante[i] = scanner.nextFloat();
			soma += pontoFlutuante[i];
		}
		System.out.print("A soma de todos os salario é " + soma);
	}

}
