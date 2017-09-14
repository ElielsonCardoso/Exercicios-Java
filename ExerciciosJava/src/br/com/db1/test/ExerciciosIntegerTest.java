package br.com.db1.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.ExerciciosInteger;

public class ExerciciosIntegerTest {

	ExerciciosInteger exerciciosInteger = new ExerciciosInteger();

	@Test
	public void somaTest() {
		Assert.assertTrue(30 == exerciciosInteger.soma(10, 20));
		Assert.assertTrue(10 == exerciciosInteger.soma(-10, 20));
	}

	@Test
	public void subtracaoTest() {
		Assert.assertTrue(40 == exerciciosInteger.subtracao(50, 10));
		Assert.assertTrue(-60 == exerciciosInteger.subtracao(-50, 10));
		Assert.assertTrue(-10 == exerciciosInteger.subtracao(0, 10));
	}

	@Test
	public void multiplicacaoTest() {
		Assert.assertTrue(50 == exerciciosInteger.multiplicacao(5, 10));
		Assert.assertTrue(-60 == exerciciosInteger.multiplicacao(-6, 10));
	}

	@Test
	public void divisaoTest() {
		Assert.assertTrue(15 == exerciciosInteger.divisao(150, 10));
		Assert.assertTrue(-10 == exerciciosInteger.divisao(-100, 10));
		Assert.assertTrue(0 == exerciciosInteger.divisao(0, 10));
	}

	@Test
	public void numeroParTest() {
		Assert.assertTrue(exerciciosInteger.numeroPar(10));
		Assert.assertFalse(exerciciosInteger.numeroPar(5));
	}

	@Test
	public void maiorNumeroTest() {
		Assert.assertTrue(-1 == exerciciosInteger.maiorNumero(10, 20));
		Assert.assertTrue(1 == exerciciosInteger.maiorNumero(20, 10));
		Assert.assertTrue(0 == exerciciosInteger.maiorNumero(5, 5));
	}

	@Test
	public void quantidadeNumerosImparesTest() {
		Assert.assertTrue(5 == exerciciosInteger.quantidadeNumerosImpares(90));
	}

}
