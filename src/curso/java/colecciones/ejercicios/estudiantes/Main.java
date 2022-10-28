package curso.java.colecciones.ejercicios.estudiantes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Set<Asignatura> asignaturasEstudiante1 = new HashSet<Asignatura>();
		Set<Asignatura> asignaturasEstudiante2 = new HashSet<Asignatura>();
		Set<Asignatura> asignaturasEstudiante3 = new HashSet<Asignatura>();
		Set<Asignatura> asignaturasEstudiante4 = new HashSet<Asignatura>();
		Set<Asignatura> asignaturasEstudiante5 = new HashSet<Asignatura>();
		
		Estudiante estudiante1 = new Estudiante("Aimar", "Saiz", "1111T", asignaturasEstudiante1);
		Estudiante estudiante2 = new Estudiante("Vega", "Rodrguez", "2222X", asignaturasEstudiante2);
		Estudiante estudiante3 = new Estudiante("Mar", "Viera", "3333P", asignaturasEstudiante3);
		Estudiante estudiante4 = new Estudiante("Basilio ", "Sandoval", "4444L", asignaturasEstudiante4);
		Estudiante estudiante5 = new Estudiante("Fidel  ", "Martin", "5555R", asignaturasEstudiante5);
		
		ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
		estudiantes.add(estudiante1);
		estudiantes.add(estudiante2);
		estudiantes.add(estudiante3);
		estudiantes.add(estudiante4);
		estudiantes.add(estudiante5);
		
		asignaturasEstudiante1.add(new Asignatura("Matemáticas", 5));
		asignaturasEstudiante1.add(new Asignatura("Biología", 7));
		asignaturasEstudiante1.add(new Asignatura("Física", 5));
		asignaturasEstudiante1.add(new Asignatura("Química", 8));
		
		asignaturasEstudiante2.add(new Asignatura("Matemáticas", 7));
		asignaturasEstudiante2.add(new Asignatura("Biología", 4));
		asignaturasEstudiante2.add(new Asignatura("Física", 9));
		asignaturasEstudiante2.add(new Asignatura("Lengua", 2));
		
		asignaturasEstudiante3.add(new Asignatura("Matemáticas", 6));
		asignaturasEstudiante3.add(new Asignatura("Biología", 3));
		asignaturasEstudiante3.add(new Asignatura("Física", 8));
		asignaturasEstudiante3.add(new Asignatura("Lengua", 2));
		
		asignaturasEstudiante4.add(new Asignatura("Literatura", 4));
		asignaturasEstudiante4.add(new Asignatura("Biología", 6));
		asignaturasEstudiante4.add(new Asignatura("Física", 10));
		asignaturasEstudiante4.add(new Asignatura("Quimica", 5));
		
		asignaturasEstudiante5.add(new Asignatura("Matemáticas", 8));
		asignaturasEstudiante5.add(new Asignatura("Biología", 2));
		asignaturasEstudiante5.add(new Asignatura("Física", 3));
		asignaturasEstudiante5.add(new Asignatura("Despliegue web", 6));
		
		Main main = new Main();
		
		main.mostrarEstudiantes(estudiantes);
		System.out.println();
		main.soloMatematicas(estudiantes);
		System.out.println();
		main.aprobado(estudiantes);
		System.out.println();
		main.soloSuspensosLengua(estudiantes);
		System.out.println();
		
		
	}
	
	public void mostrarEstudiantes(ArrayList<Estudiante> estudiantes) {
		System.out.println("Los estudiantes, sus asignaturas y sus notas: \n");
		
		for (Estudiante estudiante : estudiantes) {
			System.out.println(estudiante.getNombre() + " " + estudiante.getApellidos());
			System.out.println(estudiante.getAsignaturas());
		}
	}
	
	public void soloMatematicas(ArrayList<Estudiante> estudiantes) {
		String asignatura = "Matemáticas";
		System.out.println("Los estudiantes que han cursado " + asignatura + " son:");
		for (Estudiante estudiante : estudiantes) {
			for (Asignatura estudianteMatematicas : estudiante.getAsignaturas()) {
				if(estudianteMatematicas.getNombre().equals(asignatura)) {
					System.out.println(estudiante.getNombre() + " " + estudiante.getApellidos());
				}
			}
		}
	}
	
	public void aprobado(ArrayList<Estudiante> estudiantes) {
		System.out.println("Los alumnos aprobados son: ");
		for (Estudiante estudiante : estudiantes) {
			if(estudiante.media(estudiante.getAsignaturas()) >= 5){
				System.out.println(estudiante.getNombre() + " " + estudiante.getApellidos());
			}
		}
	}
	
	public void soloSuspensosLengua(ArrayList<Estudiante> estudiantes) {
		String asignatura = "Lengua";
		System.out.println("Los estudiantes que han suspendido " + asignatura + " son:");
		for (Estudiante estudiante : estudiantes) {
			for (Asignatura estudianteSuspendidoLengua : estudiante.getAsignaturas()) {
				if(estudianteSuspendidoLengua.getNombre().equals(asignatura)) {
					if(estudianteSuspendidoLengua.getNota() < 5) {
						estudiantes.remove(estudiante);
						System.out.println("Se ha eliminado a: " + estudiante.getNombre() + " " + estudiante.getApellidos());
					}
				}
			}
		}
	}
	
	
	
}
