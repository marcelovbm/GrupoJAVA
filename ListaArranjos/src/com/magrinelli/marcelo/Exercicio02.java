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

	public static double determinante(double[][] matriz){	
		if(matriz.length == 1){			
			return matriz[0][0];			
		} else if(matriz.length == 2){			
			double det = (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);			
			return det;			
		} else {			
			double soma = 0;
		    for(int i = 0; i < matriz.length; i++){
		    double[][] nm = new double [matriz.length-1][matriz.length-1];
		        for(int j = 0; j < matriz.length; j++){
		            if(j != i){
		                for(int k = 1; k < matriz.length; k++){
		                	int indice = -1;
		                	if(j < i){
		                		indice = j;
		                	}		                		
		                	else if(j > i){
		                		indice = j-1;
		                	}		                
		                	nm[indice][k-1] = matriz[j][k];
		                }
		            }
		        }
		        soma = (i%2 == 0)? soma + matriz[i][0] * determinante(nm) : soma - matriz[i][0] * determinante(nm);		        	
		    }
		    return soma;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] matriz = {	{5, 0, 1},		//3x3
								{-2, 3, 4},
								{0, 2, -1}};
		
		System.out.println(determinante(matriz));
	}
}