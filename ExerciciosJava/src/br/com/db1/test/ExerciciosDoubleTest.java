package br.com.db1.test;

import org.junit.Assert;
import org.junit.Test;
import br.com.db1.ExerciciosDouble;

public class ExerciciosDoubleTest {

	ExerciciosDouble exerciciosInteger = new ExerciciosDouble();

	@Test
	public void menorValor() {
		Assert.assertTrue(2d == exerciciosInteger.menorValor(5d, 2d));
		Assert.assertTrue(3.9 == exerciciosInteger.menorValor(10d, 3.9));
	}

	@Test
	public void maiorVelor() {
		Assert.assertTrue(5d == exerciciosInteger.maiorVelor(5d, 4d));
		Assert.assertTrue(10d == exerciciosInteger.maiorVelor(10d, 7d));
	}

	@Test
	public void media() {
		Assert.assertTrue(10d == exerciciosInteger.media(5d, 10d, 15d));
		Assert.assertTrue(80d == exerciciosInteger.media(90d, 70d, 80d));
	}

	@Test
	public void areaTriangulo() {
		Assert.assertTrue(25d == exerciciosInteger.areaTriangulo(5d, 10d));
		Assert.assertTrue(30d == exerciciosInteger.areaTriangulo(6d, 10d));
	}

}
