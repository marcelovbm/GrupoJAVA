package com.magrinelli.marcelo;

public class Exercicio26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		for (int j = 0; j < matriz.length; j++) {
			for (int i = 0; i < matriz[j].length; i++) {
				System.out.print(matriz[j][i] + "\t");
			}
			System.out.println();
		}
	}

}
