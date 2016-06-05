//DUVIDA NESTE EXERCICIO

package com.magrinelli.marcelo;
import java.util.*;

public class Exercicio13DUVIDA {
	public static void baskara(int a, int b, int c){
		int delta = (int) Math.pow(b, 2) -4*a*c;
		if(delta < 0){
			System.out.println("A parabola não toca o eixo x");
		} else if(delta == 0) {
			System.out.println("So existe uma raiz");
		} else {
			System.out.println("Existe duas raizes");
		}		
		int x1 = (-b+(int)Math.sqrt(delta))/(2*a);
		int x2 = (-b-(int)Math.sqrt(delta))/(2*a);
		System.out.print(x1 + " " + x2);
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a, b, c;
		
		System.out.print("Digite o valor de a: ");
		a = scanner.nextInt();
		if(a == 0){
			System.out.print("O valor de 'a' não poder ser '0'");
		} else {
			System.out.print("Digite o valor de b: ");
			b = scanner.nextInt();
			System.out.print("Digite o valor de c: ");
			c = scanner.nextInt();
			
			baskara(a, b, c);
		}
		scanner.close();
	}

}
