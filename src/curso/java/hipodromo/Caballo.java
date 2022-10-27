package curso.java.hipodromo;

public class Caballo {
	
	private int dorsal;
	private String nombre;
	private int velocidad;
	private int expriencia;
	private int edad;
	
	//Constructor
	
	public Caballo(int dorsal, String nombre, int velocidad, int expriencia, int edad) {
		super();
		this.dorsal = dorsal;
		this.nombre = nombre;
		this.velocidad = velocidad;
		this.expriencia = expriencia;
		this.edad = edad;
	}

	// Getters y Setter
	
	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getExpriencia() {
		return expriencia;
	}

	public void setExpriencia(int expriencia) {
		this.expriencia = expriencia;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	// Funciones 
	
	int correr() {
    	int numeroRandom = (int)Math.ceil((10 * Math.random()));
		int metrosAvanzados = getVelocidad() + getExpriencia() + getEdad() + numeroRandom;
		return metrosAvanzados;
	}
	
}
