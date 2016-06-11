package com.magrinelli.marcelo;

import static org.junit.Assert.*;

import org.junit.Test;

public class Exercicio05 {
	Correntista correntista1 = new Correntista(931234263, "Marcelo");
	Correntista correntista2 = new Correntista(123123123, "Miller");
	Conta conta1 = new Conta(correntista1);
	Conta conta2 = new Conta(correntista2);
	
	@Test
	public void testConstructor() {
		assertEquals(correntista1, correntista2);
		assertEquals(conta1, conta1);
	}
	
	
	@Test
	public void testSaldo(){
		assertEquals(conta1.getCorrentista(), conta2.getCorrentista());
	}
	
	@Test
	public void testNotNull(){
		assertNotNull(conta1);
	}
	
	@Test
	public void testNull(){
		assertNull(conta2);
	}

}
