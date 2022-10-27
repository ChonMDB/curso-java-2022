package curso.java.hipodromo;

public class Apuesta {
	int cantidad;
	int caballo;
	
	// Constructor 
	
	public Apuesta(int cantidad, int caballo) {
		super();
		this.cantidad = cantidad;
		this.caballo = caballo;
	}

	// Getters & Setters
	
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getCaballo() {
		return caballo;
	}

	public void setCaballo(int caballo) {
		this.caballo = caballo;
	}

	
	
	
	
	
}
