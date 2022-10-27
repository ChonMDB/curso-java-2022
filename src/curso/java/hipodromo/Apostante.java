package curso.java.hipodromo;

import curso.java.funciones.Utils;

public class Apostante {
	private String nombre;
	private int saldo;
	
	// Constructor
	
	public Apostante(String nombre, int saldo) {
		super();
		this.nombre = nombre;
		this.saldo = saldo;
	}

	// Getters & Setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	// Funciones 
	
	Apuesta apostar() {
		Apuesta apuesta = new Apuesta(0, 0);
		System.out.println("Hola " + getNombre() + ", tu saldo actual es: " + getSaldo() + " €");
		int cantidad = Integer.parseInt(Utils.pideValor("¿Cuanto quieres apostar " + getNombre() + "?"));
		if(cantidad <= getSaldo()) {
			int caballo = Integer.parseInt(Utils.pideValor("¿A que caballo quieres apostar?"));
			if(caballo == 1 || caballo == 2 || caballo == 3) {
				apuesta.setCantidad(cantidad);
				apuesta.setCaballo(caballo);
			}
		}else {
			System.out.println("Saldo insuficiente");
		}

		return apuesta;
	}
	
}
