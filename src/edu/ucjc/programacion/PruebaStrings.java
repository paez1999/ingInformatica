package edu.ucjc.programacion;

import java.net.MulticastSocket;
import java.nio.file.spi.FileSystemProvider;

public class PruebaStrings {

	public static void main(String[] args) {

		String nombre = "Texto";

		// nombre = nombre.toUpperCase();

		// System.out.println(nombre);

		String nombre2 = new String("Texto");// crea un nuevo objeto
		String nombre3 = "texto";
		System.out.println(nombre == nombre2);// compara posicion en la memoria
		System.out.println(nombre == nombre3);
		System.out.println(nombre.equals(nombre2));// compara valor de los objetos

		System.out.println(nombre.equalsIgnoreCase(nombre3));
		System.out.println(nombre.contains("Te"));// revisa si el string contiene una secuencia de letras
		String cadena = "    Esto es unae prueba";
		System.out.println(cadena.indexOf("e"));// devuelve la posicion de un caracter en el string empieza de izquierda
												// a derecha
		System.out.println(cadena.lastIndexOf("e"));// devuele la ultima posiciion de un caracter en una cadena empieza
													// de derecha a izquierda contando izquierda derecha

		System.out.println(cadena);
		System.out.println(cadena.trim());// metodo para eliminar los espacios en blanco a la izquierda y derecha
		
		
		System.out.println(cadena.replace(" ", ""));// sustiutyo un caracter cuantas veces este por otro
		System.out.println(cadena.substring(3));// crean una subcadena desde la posicion 3 hasta el final
		
		
		System.out.println(cadena.substring(5, cadena.length()));// crea una subcadena desde la posicion 5 al final o la posicion deseada				
		System.out.println(cadena + " Prueba");//concadenar strings comunmente
		System.out.println(cadena.concat(" Prueba"));//concadenacion con metodo
		
		String info = "dato1;dato2;dato3";// separas una string con simbolos
		String [] datos = info.split(";");// creas un array con los trozos de string que fueron separados por un simbolo
		System.out.println(datos[1]);// devuelve la posicion de el array pedida
		
	}
	

}
