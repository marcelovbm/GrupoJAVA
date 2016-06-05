package com.magrinelli.marcelo;

import java.util.*;
public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int nota;
		System.out.print("Digite uma nota com um valor entre 0 e 100: ");
		nota = scanner.nextInt();
		
		if(nota >= 90 && nota <= 100){
			System.out.println("Voce recebeu um A");
		} else if(nota >= 80 && nota <= 89){
			System.out.println("Voce recebeu um B");
		} else if(nota >= 70 && nota <= 79){
			System.out.println("Voce recebeu um C");
		} else {
			System.out.println("Voce foi reprovado");
		}
		scanner.close();
	}

}
