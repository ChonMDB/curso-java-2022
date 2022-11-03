package curso.java.colecciones.ejercicios.estudiantes;

public class Asignatura {
	private String nombre;
	private int nota;
	
	
	public Asignatura(String nombre, int nota) {
		this.nombre = nombre;
		this.nota = nota;
	}
	
	public Asignatura(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return nombre;
	}
	
}
