package utils;

public class Espacador {

	public static String espacador(int vezes) {
		String espaco = " ";

		for (int i = 0; i < vezes; i++) {
			espaco = (espaco + " ");
		}

		return espaco;
	}

}
