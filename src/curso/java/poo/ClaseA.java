package curso.java.poo;

public class ClaseA {
	
	//Variables de instancia
	private int numero1;
	private int numero2;
	private String nombre;
	private ClaseB claseb;
	
	
	//Constructores
	
	public ClaseA(String nombre) {
		super();
		this.nombre = nombre;
	}

	public ClaseA(int numero1, int numero2, String nombre) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.nombre = nombre;
	}
	
	public ClaseA(int numero1, int numero2, String nombre, ClaseB claseb) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.nombre = nombre;
		this.claseb = claseb;
	}
	
	
	//getter y setter
	
	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public ClaseB getClaseb() {
		return claseb;
	}

	public void setClaseb(ClaseB claseb) {
		this.claseb = claseb;
	}

	//Funciones del constructor
	void funcion1() {
		System.out.println("funcion 1");
	}

}
