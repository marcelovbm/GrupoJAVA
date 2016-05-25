package com.magrinelli.marcelo;

public class Exercicio24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arranjo = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		for (int i = 0; i < arranjo.length; i++) {
			for (int j = 0; j < arranjo.length; j++) {
				System.out.print(arranjo[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
