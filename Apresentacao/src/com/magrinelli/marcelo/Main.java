package com.magrinelli.marcelo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno = new Aluno();
		Aluno aluno2 = new Aluno();
		
		/*aluno.setNome("Marcelo");
		System.out.println(aluno.getNome());*/
		
		System.out.println("toString():\n\tPackage, nome da classe e um hexadecimal\n\t" + aluno.toString());
		
		System.out.println("\ngetClass():\n\tPackage e o nome da classe\n\t" + aluno.getClass());
		
		System.out.println("\nequals():\n\tVerifica se dois objetos sao iguais retornando TRUE ou FALSE\n\t" + aluno.equals(aluno2));
		
		System.out.println("\nhashCode():\n\tRetorna um numero inteiro unico referente ao objeto\n\t" + aluno.hashCode());
	}
}