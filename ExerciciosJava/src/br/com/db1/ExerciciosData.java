package br.com.db1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ExerciciosData {

	public Boolean anoBissexto(Integer ano) {
		if (ano % 400 == 0 || (ano % 4 == 0) && (ano % 100 != 0)) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}

	public Boolean diaUtil(LocalDate data) {
		switch (data.getDayOfWeek()) {
		case SUNDAY:
		case MONDAY:
		case TUESDAY:
		case WEDNESDAY:
		case THURSDAY:
		case FRIDAY:
		case SATURDAY:
			return Boolean.TRUE;
		default:
			return Boolean.FALSE;
		}
	}

	public Integer idade(LocalDate dataNascimento) {
		return Period.between(dataNascimento, LocalDate.now()).getYears();
	}

	public Integer diasEntreDatas(LocalDate data1, LocalDate data2) {
		return Period.between(data1, data2).getDays();
	}

	public Integer mesesEntreDatas(LocalDate data1, LocalDate data2) {
		return Period.between(data1, data2).getMonths();
	}

	public Integer anosEntreDatas(LocalDate data1, LocalDate data2) {
		return Period.between(data1, data2).getYears();
	}

	public Double diferencaHorasDistintas(LocalTime hora1, LocalTime hora2) {
		return (double) hora1.until(hora2, ChronoUnit.HOURS);
	}

}
