package edu.ucjc.programacion.ejercicios;

public class Numeros {

	public static void main(String[] args) {
		int par;
		int impar;
		int num;
		int length = 100;
		for (int i = 0; i <= length; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}

		}
		System.out.println("----------------------");

		// Impar-par
		for (int i = 0; i <= length; i++) {

			if (i % 2 == 0 && i != 0) {
				num = i;
				par = (length + 2) - num;
				impar = --num;
				System.out.println(impar + "-" + par);
			}

		}

	}

}
