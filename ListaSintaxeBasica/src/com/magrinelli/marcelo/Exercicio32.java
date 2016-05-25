package com.magrinelli.marcelo;

public class Exercicio32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "marcelo";
		
		for (int i = 0; i < string.length(); i++) {
			if(string.charAt(i) == 'a'? true : (string.charAt(i) == 'e'? true : (string.charAt(i) == 'i'? true : (string.charAt(i) == 'o'? true : (string.charAt(i) == 'u'? true : false))))){
				System.out.println(string.charAt(i) + " -> vogal");
			} else{
				System.out.println(string.charAt(i) + " -> consoante");
			}
		}
	}
}