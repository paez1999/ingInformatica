package edu.ucjc.programacion.ejercicios.arrays;

import java.util.Scanner;

public class CorreosArray {

	public static void main(String[] args) {
		String []correos= {"email1@gmail.es","email2@gmail.es","email3@gmail.es"};
	}
}
	/*
String[] correos = new String[3];
for (int i = 0; i < 3; i++) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Introduzca el correo numero: " + i);
	String direccionCorreo = scan.next();
	String splitString = direccionCorreo;
	String[] direccionCorreoArray = splitString.split("@");

	int num1 = direccionCorreo.indexOf("@");
	int num2 = direccionCorreo.indexOf(".");
	int num3 = direccionCorreo.lastIndexOf(".");
	int num4 = direccionCorreo.length();

	if (direccionCorreo.contains("")) {
		System.out.println("eRROR");
		correos[i] = "Correo incompatible";
	} else if (direccionCorreoArray[1].contains(".") == false || direccionCorreoArray.length > 2
			|| direccionCorreo.contains(" ") == true || num2 - num1 < 2
			|| (num4 - num3 > 5 || num4 - num3 < 2)) {
		System.out.println("error");
		correos[i] = "Correo inconmpatible";

	} else {
		correos[i] = direccionCorreo;
	}

}
for (int j = 0; j < 3; j++) {
	System.out.println(correos[j]);
	*/





