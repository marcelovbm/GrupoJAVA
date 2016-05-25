package com.magrinelli.marcelo;

public class Exercicio36 {

	public static long fatorial(int num) {
		if (num <= 1 ){
			return 1;
		} else{
			
			return num * fatorial(num - 1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 4;
		for(int i = 0; i <= numero; i++) {
			System.out.println(i + "! = " + fatorial(i));
		}
	}

}
