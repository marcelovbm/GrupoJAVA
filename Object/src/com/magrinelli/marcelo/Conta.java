package com.magrinelli.marcelo;

public class Conta {
	
	//ATRIBUTOS
	private static int autoIncremento = 1;
	private int numero;
	private double saldo;
	private Correntista correntista;
	
	//METODOS
	public Conta (Correntista correntista){
		this.correntista = correntista;
		this.saldo = 0;
		this.numero = autoIncremento;
		autoIncremento++;
		//System.out.println(autoIncremento);
	}
	
	public Conta (Correntista correntista, double saldo){
		this.correntista = correntista;
		this.saldo = saldo;
		this.numero = autoIncremento;
		autoIncremento++;
		//System.out.println(autoIncremento);
	}
	
	public int getNumero() {
		return numero;
	}
	
	public Correntista getCorrentista(){
		return correntista;
	}
	
	public void setCorrentista(Correntista correntista){
		this.correntista = correntista;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public boolean retirar (double valor){
		if(this.saldo > valor){
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
	}
	
	public void depositar (double valor){
		this.saldo = this.saldo + valor;
	}
	
	public boolean transferir (Conta contaDestino, double valor){
		if(this.saldo >= valor){
			contaDestino.depositar(valor);
			this.saldo = this.saldo - valor;
			return true;
		}else {
			return false;
		}
	}
}
