package com.magrinelli.marcelo;

import static org.junit.Assert.*;

import org.junit.Test;

public class Exercicio03 {
	Pessoa pessoa = new Pessoa("Marcelo", 24);
	Pessoa pessoa2 = new Pessoa("Marcel", 20);
	
	@Test
	public void testConstructor() {
		assertEquals(pessoa, pessoa);
		assertEquals(pessoa2, pessoa);
	}
	
	@Test
	public void testIdade(){
		assertEquals(pessoa.getIdade(), pessoa2.getIdade());
	}
	
	@Test
	public void testNome(){
		assertEquals(pessoa.getNome(), pessoa2.getNome());
	}
	
	@Test
	public void testNotNull(){
		assertNotNull(pessoa);
	}
	
	@Test
	public void testNull(){
		assertNull(pessoa2);
	}

}
