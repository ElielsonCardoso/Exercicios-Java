package br.com.db1;

public class ExerciciosString {

	public String letrasEmMaisculo(String letrasEmMaisculo) {
		return letrasEmMaisculo.toUpperCase();
	}

	public String letrasEmMinusculo(String letrasEmMinusculo) {
		return letrasEmMinusculo.toLowerCase();
	}

	public Integer quantidadeLetras(String quantidadeLetras) {
		return quantidadeLetras.length();
	}

	public Integer quantidadeLetrasMaisEspaco(String quantidadeLetrasMaisEspaco) {
		return quantidadeLetrasMaisEspaco.length();
	}

	public Integer quantidadeLetrasMenosEspaco(String quantidadeLetrasMenosEspaco) {
		return quantidadeLetrasMenosEspaco.trim().length();
	}

	public String quatroPrimeirasLetras(String quatroPrimeirasLetras) {
		return quatroPrimeirasLetras.substring(0, 4);
	}

	public String aPartirDaTerceiraLetra(String aPartirDaTerceiraLetra) {
		return aPartirDaTerceiraLetra.substring(3);
	}

	public String quatroUltimasLetras(String quatroUltimasLetras) {
		return quatroUltimasLetras.substring(quatroUltimasLetras.length() - 4);
	}

	public String substituiPrimeiroNome(String palavra) {
		Integer tamanhoPrimeiraPalavra = 0;
		for (Integer x = 0; x < palavra.length(); x++) {
			if (palavra.charAt(x) == ' ') {
				tamanhoPrimeiraPalavra = x;
				break;
			}
		}
		return "ALUNO" + palavra.substring(tamanhoPrimeiraPalavra);
	}

	public String[] separaFrase(String separaFrase) {
		String frutas[]=separaFrase.split(",");
		return frutas;
	}

	public Integer numeroVogais(String palavra) {
		Integer contador = 0;
		for (Integer x = 0; x < palavra.length(); x++) {
			switch(palavra.charAt(x)){
				case'a':
				case'A':
				case'e':
				case'E':
				case'i':
				case'I':
				case'o':
				case'O':
				case'u':
				case'U':
				contador+=1;
			}
		}
		return contador;
	}

	public Object invertePalavra(String palavra) {
		String palavraInvertida = "";
		for (Integer y = palavra.length(); y > 0; y--) {
			palavraInvertida += palavra.charAt(y - 1);
		}
		return palavraInvertida;
	}

}
