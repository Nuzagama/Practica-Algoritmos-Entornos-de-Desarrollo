package com.entornos.AlvaroRomero.algoritmos;

/**
 * Trabajo para la asignatura de Entornos
 * 
 * 
 * @version 1.0
 * 
 * @author Alvaro Romero
 *
 */

public class algoritmos {

/*
 * Recibe un número entero y devuelve el número de fibonacci de dicho número
 * @return devuelve el número de fibonacci de dicho número
 * @param n: numero entero que se ingresa
 */
public static int fibonacci(int n) {

int fibo1=1;

int fibo2=1;

for (int i=2;i<=n;i++) {

fibo2 = fibo1 + fibo2;

fibo1 = fibo2 - fibo1;

}

return fibo2;

}

/*
 * Recibe un número entero y devuelve el factorial de dicho número
 * @return devuelve el factorial de dicho número
 * @param n: numero entero que se ingresa
 */

public static int factorial (int n) {

int factorial = 1;

for (int i = 1; i <= n; i++) {

factorial = factorial * i;

}

return factorial;

}

/*
 * Recibe un número entero y devuelve true o false en función de si es primo o no
 * @return devuelve true o false en función de si es primo o no
 * @param n: numero entero que se ingresa
 */

public static boolean primo (int n) {

int cont = 0;

boolean primo = false;

for (int i = 1; i <= n; i++) {

if (n%i==0) cont++;

}

if (cont == 0) primo = true;

return primo;

}

}