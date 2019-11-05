package br.com.model;

import org.junit.Test;

import junit.framework.Assert;

public class ExecutaOperacoes {
	
	@Test
	public void somaTest() {
		Operacoes op = new Operacoes(3, 3);
		int ret = op.soma();
		
		Assert.assertEquals(6, ret);
	}
	
	@Test
	public void subTest() {
		Operacoes op = new Operacoes(5, 3);
		int ret = op.subtracao();
		
		Assert.assertEquals(2, ret);
	}
}
