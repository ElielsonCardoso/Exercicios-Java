package br.com.db1;

public class ExerciciosInteger {

	public Integer soma(Integer valor1, Integer valor2) {
		return valor1 + valor2;
	}

	public Integer subtracao(Integer valor1, Integer valor2) {
		return valor1 - valor2;
	}

	public Integer multiplicacao(Integer valor1, Integer valor2) {
		return valor1 * valor2;
	}

	public Integer divisao(Integer valor1, Integer valor2) {
		return valor1 / valor2;
	}

	public Boolean numeroPar(Integer valor) {
		if (valor % 2 == 0) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}

	}

	public Integer maiorNumero(Integer valor1, Integer valor2) {
		return (valor1).compareTo(valor2);
	}

	public Integer quantidadeNumerosImpares(Integer valor1) {
		Integer contador = 0;
		for (Integer x = valor1; x <= 100; x++) {
			if (x % 2 != 0) {
				contador += 1;
			}
		}
		return contador;
	}

}
