package curso.java.bandamusica;

public class Guitarra extends Instrumento{
	
	private int numCuerdas;
	private String material;
	
	//Constructor
	
	public Guitarra(String nombre, String tipo, int precio, String marca, int numCuerdas, String material) {
		super(nombre, tipo, precio, marca);
		this.numCuerdas = numCuerdas;
		this.material = material;
		
	}
	
	// Getters & Setters
	
	public int getNumCuerdas() {
		return numCuerdas;
	}

	public void setNumCuerdas(int numCuerdas) {
		this.numCuerdas = numCuerdas;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	//Funciones
	
	@Override
	void tocar() {
		// TODO Auto-generated method stub
		if(isAfinado())
			System.out.println("Se esta tocando la guitarra bien");
		else
			System.out.println("Se esta tocando la guitarra mal");
			
	}
	

}
