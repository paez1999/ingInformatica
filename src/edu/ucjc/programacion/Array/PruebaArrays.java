package edu.ucjc.programacion.Array;

public class PruebaArrays {

	public static void main(String[] args) {
		int [] numeros = {1,2,3,4};// Sabemos que elementos vamos a meter
		
		int [] numeros2 = new int [6];// sabemos cuantos valores vamos a meter pero no que valores
		
		
		 numeros2[2]=4;
		System.out.println(numeros2 [2]);
		System.out.println(numeros2.length);
		System.out.println(numeros.length);

	}

}
