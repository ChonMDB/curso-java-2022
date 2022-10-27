package curso.java.supermercado;

public class Cliente {
	
	private String nombre;
	private String apellidos;
	private String dni;
	private int importeCompra=0;
	
	public Cliente(String nombre, String apellidos, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}
	
	
	public int getImporteCompra() {
		return importeCompra;
	}
	public void setImporteCompra(int importeCompra) {
		this.importeCompra = importeCompra;
	}
	public String getNombre() {
		return nombre;
	}
	public void getApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public void getDni(String dni) {
		this.dni = dni;
	}
	
	// FUNCIONES
	
	public void comprar(int importe) {
		this.importeCompra += importe;
	}
	
}
