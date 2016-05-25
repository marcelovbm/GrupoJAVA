package com.magrinelli.marcelo;

public class Exercicio01 {

	public static void multiplicacaoMatriz (int[][] matrizA, int[][]matrizB){
		int[][] matrizResultante = new int[matrizA.length][matrizB[0].length];
		
		for(int row = 0; row < matrizResultante.length; row++){	//NUMERO DE LINHAS
			for(int col = 0; col < matrizResultante[row].length; col++){		//NUMERO DE COLUNAS
				int valorSoma = 0;
				for(int i = 0; i < matrizA[row].length; i++){	//VALORES DAS MATRIZES					
					valorSoma = valorSoma + (matrizA[row][i] * matrizB[i][col]);	
				}
				matrizResultante[row][col] = valorSoma;
			}
			
		}
		
		for(int i = 0; i < matrizResultante.length; i++){
			for(int j = 0; j < matrizResultante[0].length; j++){
				System.out.print(matrizResultante[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrizA = {	{1,2,3,4},		//5x4
							{5,3,2,1},
							{9,0,1,2},
							{3,4,0,6},
							{7,8,9,0}};
		
		int[][] matrizB = {	{1,2,3,4,5},	//4x5
							{5,6,7,8,9},
							{9,0,1,2,3},
							{3,4,5,6,7}};
		
		multiplicacaoMatriz(matrizA, matrizB);
	}

}
