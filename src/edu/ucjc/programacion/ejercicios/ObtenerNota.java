package edu.ucjc.programacion.ejercicios;

import java.util.Scanner;

public class ObtenerNota {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce una nota");
		int nota = scan.nextInt();

		// Con if
		if (nota > 0 && nota < 5) {
			System.out.println("Suspenso");

		} else if (nota >= 5 && nota < 7) {
			System.out.println("Aprobado");

		} else if (nota >= 7 && nota < 9) {
			System.out.println("Notable");
		} else if (nota > 8 && nota <= 10) {
			System.out.println("Sobresaliente");
		} else {
			System.out.println("La nota es incorrecta");
		}
		// Con Switch
		System.out.println("=====================");
		switch (nota) {

		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Suspenso");
			break;
		case 5:
		case 6:
			System.out.println("Aprobado");
			break;
		case 7:
		case 8:
			System.out.println("Notable");
			break;
		case 9:
		case 10:
			System.out.println("Sobresaliente");
			break;
		default:
			System.out.println("La nota es incorrecta");
			break;

		}
	}

}
