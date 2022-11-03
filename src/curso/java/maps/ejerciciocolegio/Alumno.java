package curso.java.maps.ejerciciocolegio;

import java.util.List;
import curso.java.colecciones.ejercicios.estudiantes.Asignatura;

public class Alumno {
	private String nombre;
	private String apellidos;
	private String dni;
	private List<String> asignaturas;
	
	public Alumno(String nombre, String apellidos, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}
	
	public Alumno(String nombre, String apellidos, String dni, List<String> asignatura) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.setAsignatura(asignaturas);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}


	@Override
	public String toString() {
		return "nombre= " + nombre + ", apellidos= " + apellidos + ", dni= " + dni;
	}

	public List<String> getAsignatura() {
		return asignaturas;
	}

	public void setAsignatura(List<String> asignaturas) {
		this.asignaturas = asignaturas;
	}

	
}
