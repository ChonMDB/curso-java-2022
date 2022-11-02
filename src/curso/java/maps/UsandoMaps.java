package curso.java.maps;

import java.util.HashMap;
import java.util.Map;

import curso.java.colecciones.ejercicios.estudiantes.Estudiante;

public class UsandoMaps {

	public static void main(String[] args) {
		
		Map<String, Estudiante> mapa1= new HashMap<String, Estudiante>();
		
		Estudiante estudiante1 = new Estudiante("Nombre estudiante 1", "Apellido estudiante 1", "11111R");
		Estudiante estudiante2 = new Estudiante("Nombre estudiante 2", "Apellido estudiante 2", "3333P");
		
		mapa1.put(estudiante1.getDni(), estudiante1);
		mapa1.put(estudiante2.getDni(), estudiante2);
		
		String dni = "11111R";
		
		Estudiante estudiante = mapa1.get(dni);
		System.out.println(estudiante.getNombre());
	}

}
