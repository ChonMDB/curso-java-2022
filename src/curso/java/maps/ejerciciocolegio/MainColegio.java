package curso.java.maps.ejerciciocolegio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MainColegio {

	public static void main(String[] args) {
		MainColegio mainColegio = new MainColegio();
		Map <Colegio, List<Alumno>> colegios = mainColegio.crearColegio();
		mainColegio.mostrarDatos(colegios);
		System.out.println("____________________________________________________");
		mainColegio.buscarPorDni(colegios);
		
	}
	
	private void mostrarDatos(Map <Colegio, List<Alumno>> colegios) {
		for (Colegio colegio: colegios.keySet()) {
			System.out.println(colegio);
			List<Alumno> alumnos = colegios.get(colegio);
			for (Alumno alumno : alumnos) {
				System.out.println(alumno);
			}
		}
		
	}
	
	private void buscarPorDni(Map <Colegio, List<Alumno>> colegios) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el dni del alumno que estas buscando");
		String dni = scan.nextLine();
		
		for (Colegio colegio: colegios.keySet()) {
			List<Alumno> alumnos = colegios.get(colegio);
			for (Alumno alumno : alumnos) {
				if(alumno.getDni().equals(dni)) {
					System.out.println("El alumno con dni " + alumno.getDni() + " esta en el colegio: " + colegio.getNombre());
				}else {
					System.out.println("El alumno no existe");
				}
			}
		}
		
	}
	
	private Map<Colegio, List<Alumno>> crearColegio() {
		
		Colegio colegio1 = new Colegio("Colegio1", "Dir1");
		Colegio colegio2 = new Colegio("Colegio2", "Dir2");
		
		Alumno alumno1 = new Alumno("Nombre1", "Apellido1", "11111F");
		Alumno alumno2 = new Alumno("Nombre2", "Apellido2", "22222T");
		Alumno alumno3 = new Alumno("Nombre3", "Apellido3", "33333R");
		List<Alumno> alumnosCole1= new ArrayList<>();
		alumnosCole1.add(alumno1);
		alumnosCole1.add(alumno2);
		alumnosCole1.add(alumno3);
		
		Alumno alumno4 = new Alumno("Nombre4", "Apellido4", "44444Y");
		Alumno alumno5 = new Alumno("Nombre5", "Apellido5", "55555U");
		Alumno alumno6 = new Alumno("Nombre6", "Apellido6", "66666I");
		List<Alumno> alumnosCole2= new ArrayList<>();
		alumnosCole2.add(alumno4);
		alumnosCole2.add(alumno5);
		alumnosCole2.add(alumno6);
		
		Map <Colegio, List<Alumno>> colegios = new HashMap<Colegio, List<Alumno>>();
		colegios.put(colegio1, alumnosCole1);
		colegios.put(colegio2, alumnosCole2);
		
		return colegios;
	}

}
