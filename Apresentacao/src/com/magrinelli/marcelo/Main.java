package com.magrinelli.marcelo;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Aluno aluno = new Aluno();
		Aluno aluno2 = new Aluno();
		
		aluno.setNome("Marcelo");
		System.out.println(aluno.getNome());
		
		//METODO toString()
		System.out.println("toString():\n\tPackage, nome da classe e um hexadecimal\n\t" + aluno.toString());

		//METODO getClass()
		System.out.println("\ngetClass():\n\tPackage e o nome da classe\n\t" + aluno.getClass());
		
		///METODO equals()
		System.out.println("\nequals():\n\tVerifica se dois objetos sao iguais retornando TRUE ou FALSE\n\t" + aluno.equals(aluno2));
		
		//METODO hashCode()
		System.out.println("\nhashCode():\n\tRetorna um numero inteiro unico referente ao objeto\n\t" + aluno.hashCode());
		
		//METODO clone()
		aluno2 = (Aluno) aluno.clone();		
		aluno2.setNome("Marcelo Magrinelli");
		
		//RESPOSTA DEVE SER TRUE, ELES DEVEM ESTAR EM DIFERENTES ENDEREÇOS DE MEMÓRIA
		System.out.println("\nclone():\n\tMesmo endereço de memória? " + (aluno != aluno2) );
		
		//ESTAMOS RETORNANDA A MESMA CLASSE, ENTÃO DEVE SER TRUE
		System.out.println("\tMesma classe? " + (aluno.getClass() == aluno2.getClass()));
		
		//O METODO EQUALS() POR DEFAULT VERIFICA AS REFERENCIAS, ENTÃO DEVE SER FALSE.
		//CASO QUEIRA QUE SEJA TRUE A SAIDA, O METODO DEVE SER REESCRITO 
		System.out.println("\tMesmo objecto? " + (aluno.equals(aluno2)));
		
		//METODO finalize()
		//http://howtodoinjava.com/core-java/related-concepts/why-not-to-use-finalize-method-in-java/
		
		//METODO notify()
		
	}
}