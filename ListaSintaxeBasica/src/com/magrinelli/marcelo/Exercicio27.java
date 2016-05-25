package com.magrinelli.marcelo;

public class Exercicio27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] matriz = new boolean[60][80];
		matriz[13][74] = true;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] == true){
					System.out.println("Valor verdade encontrado na linha " + i + " e na coluna " + j);
					break;
				}
			}
		}
	}

}
