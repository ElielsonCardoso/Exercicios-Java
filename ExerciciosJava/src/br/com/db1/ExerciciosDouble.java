package br.com.db1;

public class ExerciciosDouble {

	public Double menorValor(Double valor1, Double valor2) {
		return Math.min(valor1, valor2);
	}

	public Double maiorVelor(Double valor1, Double valor2) {
		return Math.max(valor1, valor2);
	}

	public Double media(Double valor1, Double valor2, Double valor3) {
		return (valor1 + valor2 + valor3) / 3;
	}

	public Double areaTriangulo(Double valorBase, Double valorAltura) {
		return (valorBase * valorAltura) / 2;
	}

}
