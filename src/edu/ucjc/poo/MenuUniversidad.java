package edu.ucjc.poo;

import java.util.Scanner;

import edu.ucjc.utilidades.Utilidades;

public class MenuUniversidad {
	
	Alumno [] alumnos = null;

	public static void main(String[] args) {
		int opcion = 0;

		MenuUniversidad menu = new MenuUniversidad();
		
		do {
			String[] opciones = {"1. Crear Universidad","2. Insertar Alumnos","3. Mostra alumnos",
					"4. Buscar Alumno","5. eliminar alumni","6.salir"};
			Utilidades.pintarMenu(opciones);
			opcion = Utilidades.pideDatoEntero("Selecciona una opcion");
			
			switch(opcion) {
				case 1: menu.crearUniversidad();break;
				case 2:menu.insertarAlumnos();break;
						
					
				
//				case 3: 
//					if (alumnos==null) {
//						System.out.println("Debes crear la universidad en la opción 1");
//					}else {
//						for (Alumno alumno : alumnos) {
//							if(alumno!=null) {
//								System.out.println("Nombre "+ alumno.getNombre());
//								System.out.println("Apellidos "+ alumno.getApellidos());
//								System.out.println("dni "+ alumno.getDni());
//								System.out.println("edad "+ alumno.getEdad());
//								System.out.println("=======================================");
//							}
//						}
//						
//					}
//					
//					break;
//				case 4: 
//					if (alumnos==null) {
//						System.out.println("Debes crear la universidad en la opción 1");
//					}else {
//						
//						String dniBusqueda = Utilidades.pideDatoString("Introduce el dni del alumno a buscar ");
//						
//						for (Alumno alumno : alumnos) {
//							if(alumno !=null && alumno.getDni().equals(dniBusqueda)    ) {
//								System.out.println("Alumno con dni "+dniBusqueda + " encontrado");
//								break;
//							}
//						}
//						
//					}
//					
//					
//					break;
//				case 5 : 
//					int i =0;
//					Scanner scan = new Scanner (System.in);
//					String parametro =scan.nextLine();
//					for (Alumno alumno : alumnos) {
//						if (alumno!=null && alumno.getDni().equals(parametro)) {
//							alumnos[i] = null;
//							break;
//						}
//						i++;
//					}
//			
//				break;
//			
//		
//				case 6: System.out.println("Adios!!");break;
//				default: System.out.println("Opcion incorrecta");
	}
		}while(opcion!=6);
	}

	private   void crearUniversidad () {
	int numAlumnos = Utilidades.pideDatoEntero("Introduce número de alumnos");
	alumnos = new Alumno[numAlumnos];
	System.out.println("Universidad creada con "+ alumnos.length + " alumnos");
	}
	
	private   void insertarAlumnos () {
		if (alumnos==null) {
			System.out.println("Debes crear la universidad en la opción 1");
		}else {//Rellenamos el array con objetos de tipo alumno
			
			for (int i=0 ; i<alumnos.length ; i++) {
				String nombre = Utilidades.pideDatoString("Introduce el nombre del alumno "+(i+1));
				String apellidos = Utilidades.pideDatoString("Introduce el apellido del alumno "+(i+1));
				String dni = Utilidades.pideDatoString("Introduce el dni del alumno "+(i+1));
				int edad = Utilidades.pideDatoEntero("Introduce la edad del alumno "+(i+1));
				
				Alumno alumno = new Alumno(nombre,apellidos,edad,dni);
				alumnos[i] = alumno;
			}
		}
		
}
}