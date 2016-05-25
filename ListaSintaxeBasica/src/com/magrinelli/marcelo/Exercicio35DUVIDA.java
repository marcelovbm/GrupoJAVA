//FORMA ITERATIVA
package com.magrinelli.marcelo;

public class Exercicio35DUVIDA {

	public static long fatorial(int num) {
		if (num <= 1 ){
			System.out.println(1);
			return 1;
		} else{
			System.out.print(num + " * " + fatorial(num-1) + "! = ");
			return num * fatorial(num - 1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 4;
		for(int i = 0; i <= numero; i++) {
			System.out.print(i + "! = ");
			fatorial(i);
		}
	}

}
