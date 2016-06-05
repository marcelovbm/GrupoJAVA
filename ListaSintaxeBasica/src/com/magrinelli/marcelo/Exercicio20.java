package com.magrinelli.marcelo;

import java.util.*;
public class Exercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String nome;
		System.out.print("Digite o seu nome completo: ");
		nome = scanner.nextLine();
		
		System.out.println(nome.toUpperCase());
		System.out.println(nome.toLowerCase());
		System.out.print(Character.toUpperCase(nome.charAt(0)));
		
		for(int i = 0; i < nome.length(); i++){
			if(nome.charAt(i) == ' '){
				System.out.print(" " + Character.toUpperCase(nome.charAt(i + 1)));
			}			
		}	
		scanner.close();
	}
}