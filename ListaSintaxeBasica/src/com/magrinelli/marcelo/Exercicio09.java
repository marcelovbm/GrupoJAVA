package com.magrinelli.marcelo;

import java.util.*;
public class Exercicio09 {

	public static void somaResultante(int numero){
		int soma = 0;
		for (int i = 1; i <= numero; i++){
			soma += i;
			if(i == numero){
				System.out.println(i + " = " + soma);
			}
			else{
				System.out.print(i + " + ");
			}			
		}		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int numeroInt;
		
		System.out.print("Digite um numero inteiro: ");
		numeroInt = scanner.nextInt();
		
		somaResultante(numeroInt);
	}

}
