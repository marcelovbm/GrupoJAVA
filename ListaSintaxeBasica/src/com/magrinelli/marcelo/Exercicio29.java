package com.magrinelli.marcelo;

public class Exercicio29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] array = {'a','b','c','d','e'};
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] == 'a' || array[i] == 'e' || array[i] == 'i' || array[i] == 'o' || array[i] == 'u'){
				System.out.println(i + "\t" + array[i] + "\tvogal");
			} else {
				System.out.println(i + "\t" + array[i] + "\tconsoante");
			}
		}
	}

}
