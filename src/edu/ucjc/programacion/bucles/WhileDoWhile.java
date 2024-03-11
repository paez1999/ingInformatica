package edu.ucjc.programacion.bucles;

public class WhileDoWhile {

	public static void main(String[] args) {
		// While
		int numero = 10;
		while (numero > 7) {
			System.out.println(numero--);
		}
		// do-while,primero va a ejecutar y luego evalua la condicion
		do {
			numero++;
			System.out.println(numero);
		} while (numero < 20);

	}

}
