package curso.java.ficheros.ejercicio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import curso.java.colecciones.ejercicios.estudiantes.Asignatura;
import curso.java.maps.ejerciciocolegio.Alumno;
import curso.java.maps.ejerciciocolegio.Colegio;

public class LeerFicheroAlumnosColegio{
	
	public StringBuilder archivoAlumnosColegio(String nombreArchivo) {
		
		StringBuilder stringAlumnosColegios = new StringBuilder();
		File archivo = new File(nombreArchivo);
		
		try (BufferedReader reader = new BufferedReader(new FileReader(archivo))){
			
			HashMap<String, List<Alumno>> alumnosColegios = new HashMap<String, List<Alumno>>();
            String linea;
            while ( (linea = reader.readLine()) != null){
                stringAlumnosColegios.append(linea).append("\n");
                String [] datosAlumnos = linea.split("\\|");
                String []todasAsignaturas = datosAlumnos[3].split(";");
                List<String> asignaturas = new ArrayList<String>();
                
                for (String asignatura : todasAsignaturas) {
                	asignaturas.add(asignatura);
				}
                
                String colegio = datosAlumnos[0];
                Alumno alumno = new Alumno(datosAlumnos[1], datosAlumnos[2], datosAlumnos[3], asignaturas);
                
                if(alumnosColegios.containsKey(colegio)) {
                	List<Alumno> alumnos = alumnosColegios.get(colegio);
                	alumnos.add(alumno);
                	alumnosColegios.get(colegio).addAll(alumnos);
                }else {
                	List<Alumno> alumnos = new ArrayList<Alumno>();
                	alumnos.add(alumno);
                	alumnosColegios.put(colegio, Arrays.asList(alumno));
                }
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		return stringAlumnosColegios;
			
	}

}
