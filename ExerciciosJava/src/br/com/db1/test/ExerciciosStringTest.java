package br.com.db1.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.ExerciciosString;

public class ExerciciosStringTest {

	ExerciciosString exerciciosString = new ExerciciosString();

	@Test
	public void letrasEmMaisculoTest() {
		Assert.assertEquals(exerciciosString.letrasEmMaisculo("fusca"), "FUSCA");
	}

	@Test
	public void letrasEmMinusculoTest() {
		Assert.assertEquals(exerciciosString.letrasEmMinusculo("FUSCA"), "fusca");
	}

	@Test
	public void quantidadeLetrasTest() {
		Assert.assertTrue(8 == exerciciosString.quantidadeLetras("DB1START"));
	}

	@Test
	public void quantidadeLetrasMaisEspacoTest() {
		Assert.assertTrue(10 == exerciciosString.quantidadeLetrasMaisEspaco(" DB1START "));
	}

	@Test
	public void quantidadeLetrasMenosEspacoTest() {
		Assert.assertTrue(8 == exerciciosString.quantidadeLetrasMenosEspaco(" DB1START "));
	}

	@Test
	public void quatroPrimeirasLetrasTest() {
		Assert.assertEquals(exerciciosString.quatroPrimeirasLetras("Elielson Cardoso da Silva"), "Elie");
	}

	@Test
	public void aPartirDaTerceiraLetra() {
		Assert.assertEquals(exerciciosString.aPartirDaTerceiraLetra("Elielson Cardoso da Silva"),
				"elson Cardoso da Silva");
	}

	@Test
	public void quatroUltimasLetras() {
		Assert.assertEquals(exerciciosString.quatroUltimasLetras("Elielson Cardoso da Silva"), "ilva");
	}

	@Test
	public void substituiPrimeiroNome() {
		Assert.assertEquals(exerciciosString.substituiPrimeiroNome("Elielson Cardoso da Silva"),
				"ALUNO Cardoso da Silva");
	}

	@Test
	public void separaFrase() {
		String frutaTeste[] = exerciciosString.separaFrase("banana,maçã,melancia");
		Assert.assertEquals("banana", frutaTeste[0]);
		Assert.assertEquals("maçã", frutaTeste[1]);
		Assert.assertEquals("melancia", frutaTeste[2]);
	}

	@Test
	public void numeroVogais() {
		Assert.assertTrue(4 == exerciciosString.numeroVogais("elielson"));
		Assert.assertFalse(4 == exerciciosString.numeroVogais("joao"));
	}

	@Test
	public void invertePalavra() {
		Assert.assertEquals(exerciciosString.invertePalavra("fusca"), "acsuf");
	}

}
