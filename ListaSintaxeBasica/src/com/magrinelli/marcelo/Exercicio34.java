package com.magrinelli.marcelo;

import java.util.*;
public class Exercicio34 {
	
	public static boolean isVogal(char character){
		return character == 'a'? true : (character == 'e'? true : (character == 'i'? true : (character == 'o'? true : (character == 'u'? true : false))));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String string;
		
		System.out.print("Digite uma frase: ");
		string = scanner.nextLine();
		
		for (int i = 0; i < string.length(); i++) {
			if(isVogal(string.charAt(i))){
				System.out.println("Index: " + i);
				break;
			}
		}
		scanner.close();
	}
}