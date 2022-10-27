package curso.java.bandamusica;

public class Instrumento {
	private String nombre;
	private String tipo;
	private int precio;
	private String marca;
	private boolean afinado;
	// Constructor
	
	public Instrumento(String nombre, String tipo, int precio, String marca) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.precio = precio;
		this.marca = marca;
	}

	// Getters & Setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isAfinado() {
		return afinado;
	}

	public void setAfinado(boolean afinado) {
		this.afinado = afinado;
	}
	
	// Funciones
	
	boolean afinar() {
		int numeroRandom = (int)Math.ceil((10 * Math.random()));
		if(numeroRandom > 8) {
			this.afinado = true;
			System.out.println("El instrumento " + this.nombre + " esta afinado");
		}else {
			this.afinado = false;
			System.out.println("El instrumento " + this.nombre + " no esta afinado");
		}
		return afinado;
	}
	
	void tocar() {
		if(isAfinado()) {
			System.out.println("El instrumento " + this.nombre + " esta sonando correctamente");
		}else {
			System.out.println("El instrumento " + this.nombre + " esta sonando desafinado");
		}
	}
}
