package br.com.db1.test;

import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;
import java.time.LocalTime;

import br.com.db1.ExerciciosData;

public class ExerciciosDataTest {

	ExerciciosData exerciciosData = new ExerciciosData();

	@Test
	public void anoBissexto() {
		Assert.assertTrue(Boolean.TRUE == exerciciosData.anoBissexto(2012));
		Assert.assertTrue(Boolean.FALSE == exerciciosData.anoBissexto(2017));
	}

	@Test
	public void diaUtil() {
		Assert.assertTrue(Boolean.TRUE == exerciciosData.diaUtil(LocalDate.of(2017, 9, 13)));
	}

	@Test
	public void idade() {
		Assert.assertTrue(18 == exerciciosData.idade(LocalDate.of(1998, 10, 16)));
	}

	@Test
	public void diasEntreDatas() {
		Assert.assertTrue(10 == exerciciosData.diasEntreDatas(LocalDate.of(2016, 10, 16), LocalDate.of(2016, 10, 26)));
	}

	@Test
	public void mesesEntreDatas() {
		Assert.assertTrue(5 == exerciciosData.mesesEntreDatas(LocalDate.of(2016, 1, 16), LocalDate.of(2016, 6, 26)));
	}

	@Test
	public void anosEntreDatas() {
		Assert.assertTrue(2 == exerciciosData.anosEntreDatas(LocalDate.of(2014, 10, 16), LocalDate.of(2016, 12, 26)));
	}

	@Test
	public void diferencaHorasDistintas() {
		Assert.assertTrue(1 == exerciciosData.diferencaHorasDistintas(LocalTime.of(13, 5), LocalTime.of(14, 5)));
	}

}
