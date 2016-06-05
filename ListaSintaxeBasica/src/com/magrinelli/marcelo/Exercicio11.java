package com.magrinelli.marcelo;

import java.util.*;

public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String frase;
		int quantidadDeA = 0;
		
		System.out.println("Digite uma frase com pelo menos 30 caracteres:");
		frase = scanner.nextLine();
		
		for(int i = 0; i < frase.length(); i++){
			if (frase.charAt(i) == 'a'){
				quantidadDeA += 1;
			}
		}
		System.out.print(quantidadDeA);
		scanner.close();
	}
}