package curso.java.ficheros.ejercicio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import curso.java.colecciones.ejercicios.estudiantes.Asignatura;
import curso.java.maps.ejerciciocolegio.Alumno;

public class LeerFicheroAlumnos{
	
	public StringBuilder archivoAlumnos(String nombreArchivo) {
		
		StringBuilder stringAlumnos = new StringBuilder();
		File archivo = new File(nombreArchivo);
		try (BufferedReader reader = new BufferedReader(new FileReader(archivo))){

            String linea;
            String [] datosAlumnos = null;
            List<Alumno> alumnos = new ArrayList<Alumno>();
            while ( (linea = reader.readLine()) != null){
                datosAlumnos = linea.split("\\|");
                stringAlumnos.append(linea).append("\n");
                String []todasAsignaturas = datosAlumnos[3].split(";");
                List<String> asignaturas = new ArrayList<String>();
                for (String asignatura : todasAsignaturas) {
                	asignaturas.add(asignatura);
				}

                Alumno alumno = new Alumno(datosAlumnos[0], datosAlumnos[1], datosAlumnos[2], asignaturas);
                alumnos.add(alumno);
                
            }
            System.out.println("Lista de alumnos: ");
            System.out.println(stringAlumnos);

            System.out.println("Hay un total de " + alumnos.size() + " alumnos en el fichero.");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		return stringAlumnos;
			
	}

}
