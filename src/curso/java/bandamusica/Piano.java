package curso.java.bandamusica;

public class Piano extends Instrumento{

	private int numOctavas;
	private int numPedales;
	
	//Constructor
	
	public Piano(String nombre, String tipo, int precio, String marca, int numOctavas, int numPedales) {
		super(nombre, tipo, precio, marca);
		this.numOctavas = numOctavas;
		this.numPedales = numPedales;
	}
	
	//Getters & Setters
	
	public int getNumOctavas() {
		return numOctavas;
	}

	public void setNumOctavas(int numOctavas) {
		this.numOctavas = numOctavas;
	}

	public int getNumPedales() {
		return numPedales;
	}

	public void setNumPedales(int numPedales) {
		this.numPedales = numPedales;
	}
	
	
}
