package com.entornos.AlvaroRomero.algoritmos;

public class Principal {

	public static void main(String[] args) {

			int [] array = new int [5];

			for (int i = 0; i < array.length; i++) {

			array [i] = (int)((Math.random()*(20-1+1))+1);

			}

			long [] resultadoFibonacci = new long [5];

			for (int i = 0; i < array.length; i++) {

			resultadoFibonacci[i] = algoritmos.fibonacci(array [i]);

			}

			long [] resultadoFactorial = new long [5];

			for (int i = 0; i < array.length; i++) {

			resultadoFactorial[i] = algoritmos.factorial(array [i]);

			}

			boolean [] resultadoPrimos = new boolean [5];

			for (int i = 0; i < array.length; i++) {

			resultadoPrimos[i] = algoritmos.primo(array [i]);

			}

	}

			
}


