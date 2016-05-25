package com.magrinelli.marcelo;

public class Exercicio30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "Oi eu sou o marcelo!";
		
		System.out.print("Tamanho da String: " + string.length() + "\nString original: " + string + "\nString inversa: ");
		for (int i = string.length() - 1; i >= 0; i--) {
			System.out.print(string.charAt(i));
		}
	}
}