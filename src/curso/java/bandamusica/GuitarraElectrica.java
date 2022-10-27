package curso.java.bandamusica;

public class GuitarraElectrica extends Guitarra{
	private int potencia;
	
	//Constructor
	
	public GuitarraElectrica(String nombre, String tipo, int precio, String marca, int numCuerdas, String material, int potencia) {
		super(nombre, tipo, precio, marca, numCuerdas, material);
		this.potencia = potencia;
	}
	
	//Getters & Setters
	
	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	//Funciones
	
	@Override
	void tocar() {
		super.tocar();
		System.out.println(" eléctrica " + getPotencia());

	}
	
	
}
