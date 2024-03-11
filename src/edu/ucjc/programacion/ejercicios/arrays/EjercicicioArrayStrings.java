package edu.ucjc.programacion.ejercicios.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicicioArrayStrings {
	public static void main(String[] args) {
		// crear un array de numeros enteros del tamaño que pidais por consola( luego
		// solicitar por teclado los numeros)
		// mostar unicamente los numeros pares que se hayan introducido en el array
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca Longitud deseada del array");
		int longitud = scan.nextInt();
		int[] numeros = new int[longitud];

		for (int i = 0; i < longitud; i++) {
			if (i < longitud) {
				Scanner scan2 = new Scanner(System.in);
				System.out.println("Introduzca la posicion " + i + " en el array: ");
				int numerosIntroducir = scan2.nextInt();
				numeros[i] = numerosIntroducir;

			} 

		}
		for (int j = 0; j < longitud; j++) {
			if (numeros[j] % 2 == 0) {
				System.out.print(numeros[j]);
				System.out.print("  ");

			}

		}
		int [][] numeros2 = new int [2][3];
		

	}

}
