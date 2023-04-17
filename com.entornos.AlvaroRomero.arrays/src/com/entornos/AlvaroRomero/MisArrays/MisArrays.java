package com.entornos.AlvaroRomero.MisArrays;

public abstract class MisArrays {

	public static double calcularMedia(int[] numeros) {
		int suma = 0;
		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
		}
		double media = (double) suma / numeros.length;
		return media;

	}
}