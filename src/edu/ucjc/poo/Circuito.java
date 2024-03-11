package edu.ucjc.poo;

public class Circuito {
	private String nombre;
	
	public Circuito(String nombre) {
		super();
		this.nombre=nombre;
	}
	public static void main(String[] args) {
		for(String dato:args) {
			System.out.println(dato);
		}
		Piston piston1 = new Piston(1, "Marca1");
		Motor motor1 = new Motor("MarcaMotor1", 120, piston1);
		Volante volante1 = new Volante(1, "Deportivo", "negro");
		Coche coche1 = new Coche("1111-ABC", "Peugot", volante1, motor1);
		double velocidad= Math.random()*120;
		coche1.setVelocidad(velocidad);
		Piston piston2 = new Piston(2, "Marca2");
		Motor motor2 = new Motor("MarcaMotor2", 120, piston2);
		Volante volante2 = new Volante(2, "Deportivo", "azul");
		Coche coche2 = new Coche("2222-ABC", "Peugot", volante2, motor2);
		double velocida2= Math.random()*120;
		coche2.setVelocidad(velocida2);
		Coche [] coches  = {coche1,coche2};
		
		coche1.conducir();
		coche2.conducir();
	}

}
