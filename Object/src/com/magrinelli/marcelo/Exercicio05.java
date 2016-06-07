package com.magrinelli.marcelo;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Correntista correntista = new Correntista(123, "Marcelo");
		Correntista correntista2 = new Correntista(1234, "Miller");
		Conta conta = new Conta(correntista, 123.23);
		Conta conta2 = new Conta(correntista2);
		
		System.out.println(conta.getCorrentista().getNome());
		System.out.println(conta.retirar(124));
		System.out.println(conta.getSaldo() + "\n");
		
		System.out.println(conta2.getCorrentista().getNome());
		System.out.println(conta2.getSaldo());
		conta2.depositar(100);
		System.out.println(conta2.getSaldo() + "\n");
		
		conta.transferir(conta2, 100);
		System.out.println(conta.getCorrentista().getNome() + "->\t" + conta2.getCorrentista().getNome());
		System.out.println("\t" + conta2.getSaldo() + "\n");
	}

}
