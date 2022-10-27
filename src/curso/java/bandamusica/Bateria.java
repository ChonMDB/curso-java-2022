package curso.java.bandamusica;

public class Bateria extends Instrumento{
	private int numTimbales;
	private int numPlatos;
	
	//Constructor
	
	public Bateria(String nombre, String tipo, int precio, String marca, int numTimbales, int numPlatos) {
		super(nombre, tipo, precio, marca);
		this.numPlatos = numPlatos;
		this.numTimbales = numTimbales;
	}

	//Getters & Setters
	
	public int getNumTimbales() {
		return numTimbales;
	}

	public void setNumTimbales(int numTimbales) {
		this.numTimbales = numTimbales;
	}

	public int getNumPlatos() {
		return numPlatos;
	}

	public void setNumPlatos(int numPlatos) {
		this.numPlatos = numPlatos;
	}
	
	//Funciones
	
	void aporrear() {
		System.out.println("La bateria " + getNombre() + " se esta aporreando.");
	}

}
