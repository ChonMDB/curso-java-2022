package curso.java.inicio;
import curso.java.funciones.Utils;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		int opcion=0;
		int numAulas = Integer.parseInt(Utils.pideValor("Cuantas aulas tiene el colegio"));
		int numAlumnos = Integer.parseInt(Utils.pideValor("Cuantos alumnos tiene el cada aula"));
		String [][] colegio = new String[numAulas][numAlumnos];
		int aux=0;
		
		System.out.println("El colegio tiene " + numAulas + " aulas y por cada una tiene " + numAlumnos +" alumnos");

		do {
			Utils.pintaMenu("1. Insertar alumno por aula\n2. Buscar alumno\n3. Borrar alumno\n4. Mostrar alumnos\n5. Mostrar todos los alumnos\n6. Salir");
			opcion = Integer.parseInt(Utils.pideValor());
			
			switch(opcion) {
				case 1:
					insertarAlumno(colegio, numAlumnos, aux);
					aux++;
					break;
				case 2:
					buscarAlumno(colegio, numAlumnos, numAulas);
					break;
				case 3:
					borrarAlumno(colegio, numAlumnos, numAulas);
					break;
				case 4:
					mostrarAlumnosAula(colegio);
					break;
				case 5:
					mostrarTodosAlumnos(colegio);
					break;
				case 6:
					System.out.println("Adiós");
					break;
				default:System.out.println("Opcion incorrecta");		
			}
		}
		while(opcion!=7);
	}

	static void insertarAlumno( String [][] colegio, int alumnosPorAula, int aux) {
		
		int aulaAlumno = Integer.parseInt(Utils.pideValor("En que aula quieres meter al alumno"))-1;
		if(aulaAlumno <= alumnosPorAula) {
			for(int i=0;i<colegio[aulaAlumno ].length;i++) {
				if (colegio[aulaAlumno ][i] == null) {	
					String nombreAlumno = Utils.pideValor("Que nombre tiene el alumno");
					colegio[aulaAlumno ][i]=nombreAlumno;
					System.out.println("Registrado");					
					break;
					//i=alumnosPorAula;
				}
			}
			if(aux >=  alumnosPorAula){
				System.out.println("El aula " + (aulaAlumno + 1) + " aula esta llena");
			}
		}else {
			System.out.println("El aula " + (aulaAlumno + 1) + " no existe");
		}
	}
	
	static void buscarAlumno( String [][] colegio, int alumnosPorAula, int numAulas) {
		String nombreAlumno=Utils.pideValor("Introduce el nombre del alumno.");
		int aux = 0;
		for (int i = 0; i < alumnosPorAula;i++) {
			for (int j = 0; j < numAulas; j++) {
				if(colegio[i][j]!=null && colegio[i][j].equals(nombreAlumno)) {
					System.out.println("El alumno se encuentra en el aula: " + ( i+1 ));
				}else {	
					aux++;
				}
				i=alumnosPorAula-1;
				j=numAulas;	
			}
			if(aux!=0) {
				System.out.println("El alumno no existe");
			}
		}
	}
	
	static void borrarAlumno( String [][] colegio, int alumnosPorAula, int numAulas) {
		String nombreAlumno=Utils.pideValor("Introduce el nombre del alumno.");
		int aux = 0;
		for (int i = 0; i < alumnosPorAula; i++) {
			for (int j = 0; j < numAulas; j++) {
				if(colegio[i][j].equals(nombreAlumno)) {
					colegio[i][j] = null;
					System.out.println("Alumno borrado");
					i= alumnosPorAula;
					j= numAulas;
					
				}else {
					aux++;
				}
			}
		}
		if(aux!=0) {
			System.out.println("El alumno no esta en el colegio");
		}
	}
	
	static void mostrarAlumnosAula( String [][] colegio ) {
		int aula = Integer.parseInt(Utils.pideValor("De que aula quieres ver los alumnos")) -1;
		for (int i = 0; i < colegio[aula].length; i++) {
			if(colegio[aula][i] != null) {
				System.out.print(colegio[aula][i] + ", ");		
			}
			if(colegio[aula][i] == null) {
				System.out.println("La clase esta vacia aún");
				break;
			}
		}
		System.out.println("");
	}
	
	static void mostrarTodosAlumnos(String [][] colegio) {
		for (int i = 0; i < colegio.length;i++) {
			System.out.println("Aula " + ( i+1 ) + ":");
			for (int j = 0; j < colegio[i].length; j++) {
				if(colegio[i][j] != null) {
					System.out.print(colegio[i][j] + ", ");
				}
			}
			System.out.println("");
		}
	}
	
}
