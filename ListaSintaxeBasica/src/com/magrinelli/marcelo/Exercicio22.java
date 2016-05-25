package com.magrinelli.marcelo;

public class Exercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 2008;  i <= 2009; i++){
			for (int j = 1; j <= 12; j++) {
				switch (j) {
				case 1:
					System.out.println("Janeiro/" + i);
					break;
				case 2:
					System.out.println("Fevereiro/" + i);
					break;
				case 3:
					System.out.println("Marco/" + i);
					break;
				case 4:
					System.out.println("Abril/" + i);
					break;
				case 5:
					System.out.println("Maio/" + i);
					break;
				case 6:
					System.out.println("Junho/" + i);
					break;
				case 7:
					System.out.println("Julho/" + i);
					break;
				case 8:
					System.out.println("Agosto/" + i);
					break;
				case 9:
					System.out.println("Setembro/" + i);
					break;
				case 10:
					System.out.println("Outubro/" + i);
					break;
				case 11:
					System.out.println("Novembro" + i);
					break;
				case 12:
					System.out.println("Dezembro/" + i);
					break;
				}
			}
		}
	}

}
