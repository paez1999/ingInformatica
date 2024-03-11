package edu.ucjc.programacion.ejercicios;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		System.out.println("1.Matriz");
		System.out.println("2.Cuadrado");
		System.out.println("3.Fibonacci");
		System.out.println("4.Salir");

		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca Seleccion");
		int seleccion = scan.nextInt();

		if (seleccion != 4) {
			if (seleccion == 1) {
				for (int i = 1; i <= 9; i++) {
					if (i <= 3) {
						System.out.print(i);

					} else if (i > 3 && i <= 6) {
						if (i == 4) {
							System.out.println("");
						}
						System.out.print(i);
					} else if (i > 6 && i <= 9) {
						if (i == 7) {
							System.out.println("");
						}

						System.out.print(i);
					}

				}

			} else if (seleccion == 2) {
				for (int i = 1; i < 17; i++) {
					System.out.print("*\t");
					if (i % 4 == 0) {
						System.out.println("\n");

					}

				}
			}
				else if (seleccion == 3) {
					System.out.println("Hasta que numero deseas hacer la serie de fibonacci: ");
					int numeros = scan.nextInt();
					int num1 = 0;
					int num2= 1;
					System.out.println(num1);
					
					int suma=0;
					for (int i=0;suma<numeros;i++) {
						suma = num1+num2;
						num1= num2;
						num2= suma;
						if (suma<=numeros) {
						System.out.println(suma);
					} 
				}
		}
	}
}
}
				
				
			

		

		
					

		
	

