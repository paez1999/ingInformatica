package edu.ucjc.poo;

public class Piloto {
	 	private int experencia;
	    private String nombre;
	    private String equipo;
	    private int numVictorias;
	    
	    public Piloto(int experencia, String nombre, String equipo, int numVictorias ) {
	    	
	    	super();
	    	this.experencia = experencia;
	    	this.nombre = nombre;
	    	this.equipo = equipo;
	    	this.numVictorias = numVictorias;
	    }

		public int getExperencia() {
			return experencia;
		}

		public void setExperencia(int experencia) {
			this.experencia = experencia;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getEquipo() {
			return equipo;
		}

		public void setEquipo(String equipo) {
			this.equipo = equipo;
		}

		public int getNumVictorias() {
			return numVictorias;
		}

		public void setNumVictorias(int numVictorias) {
			this.numVictorias = numVictorias;
		}
	    
}
