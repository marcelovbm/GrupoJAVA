package com.magrinelli.marcelo;

public class Exercicio02 {
	
	public static int[][] subMatriz (int[][] subMatriz){
		int[][] matriz = new int [subMatriz.length][2];
		
		for(int row = 0; row < subMatriz.length; row++){
			for(int col = 0; col < 2; col++){
				matriz[row][col] = subMatriz[row][col];
			}
		}
		return matriz;
	}

	public static int determinante(int[][] matriz){
	
		if(matriz.length == 1){
			
			return matriz[0][0];
			
		} else if(matriz.length == 2){
			
			int det = (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);
			
			return det;
			
		} else {
			
			int detA = 1;
			int detB = 1;
			int[][] submatriz = subMatriz(matriz);
			
			for (int i = 0; i < matriz.length; i++) {
				detA = detA * matriz[i][i];
			}
			
			return detB - detA;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = {	{1,2,3,4},		//4x4
							{5,3,2,1},
							{9,0,1,2},
							{3,4,0,6}};
		
		System.out.println(determinante(matriz));
	}
}