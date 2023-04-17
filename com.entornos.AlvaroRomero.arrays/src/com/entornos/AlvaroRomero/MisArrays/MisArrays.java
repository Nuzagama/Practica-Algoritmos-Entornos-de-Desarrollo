package com.entornos.AlvaroRomero.MisArrays;
/**
 * Trabajo para la asignatura de Entornos, arrays.
 * 
 * 
 * @version 1.0
 * 
 * @author Alvaro Romero
 *
 */
public abstract class MisArrays {
	
	/*
	 * Media:Recibe una lista de números enterso y devuelve un número decimal
	 * @return devuelve números decimales
	 * @param Array de números enteros
	 */

	public static double calcularMedia(int[] numeros) {
		int suma = 0;
		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
		}
		double media = (double) suma / numeros.length;
		return media;

	}
	
	/*
	 * Mediana:Recibe un array de números enteros y devuelve la mediana con
	 * decimales de dicho array
	 * @return devuelve la media con números decimales
	 * @param Array de números enteros
	 */
	
	public static double calcularMediana(int[] numeros) {
		int mediana;
		int mitad = numeros.length / 2;
		// Si la longitud es par, se deben promediar los del centro
		if (numeros.length % 2 == 0) {
		    mediana = (numeros[mitad - 1] + numeros[mitad]) / 2;
		} else {
		    mediana = numeros[mitad];
		}
		return mediana;
	
	
	}
}