package edu.ucjc.programacion;

public class Condicionales {
	
	public static void main (String[]args) {
		
		int  numero = 7;
		int numero2= 10;
		boolean mayorDoce = numero>12;
		if (mayorDoce && numero2 > 5) {
			System.out.println("Numero mayor que doce");
			
		}else if (--numero>=7 && numero<12) {
			System.out.println("Numero entre 7 y 12 doce");
			
		}else {
			System.out.println("El numero sera menor que 7");
		}
		numero+=5d;
		numero = numero + 5;
		System.out.println(numero);
		//System.out.println(numero);
		//System.out.println(numero);
		
		int opcion = 2;
		switch(opcion) {
		case 1:
		case 2: 
		case 3: System.out.println("El valor esta entre 1 y 3");break;
		case 9: System.out.println("El valor es 9");break;
		default: System.out.println("No es ningung valor controlado");break;
		
		}
	}

}
