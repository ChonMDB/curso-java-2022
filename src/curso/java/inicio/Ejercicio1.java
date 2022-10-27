package curso.java.inicio;

import java.util.Scanner;

import curso.java.funciones.Utils;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int opcion;
		
		do {
			
		Utils.pintaMenu();
			
		Scanner scan = new Scanner(System.in);
		opcion = scan.nextInt();
		
		switch(opcion) {
		
		// OPCION 1: CREAR CUADRADO
			case 1: 
				pintarCuadrado();
				break;
		//OPCION 2: VALIDAR EMAIL	
			case 2:
				validarEmail();
				break;
			case 3:
				fibonnacci();
				break;
			case 4:
				alumnos();
				break;
			case 5:
				System.out.println("Adiós");
				break;
			default:
				System.out.println("*****Opcion incorrecta*****");
		}
		}while(opcion!=5);
			
	}
	
	
	
	static void pintarCuadrado() {
		Scanner scan = new Scanner(System.in);
		System.out.println("*Selecciona tamaño del cuadrado*");
		int tamanio = scan.nextInt();
		
		//primera linea
		for(int i = 0; i < tamanio; i++) {
            System.out.print("*");
        }
		System.out.println();
		
		//centro del cuadrado
		for(int i = 0; i < tamanio-2; i++) {
            System.out.print("*");        
            for(int x = 0; x < tamanio-2; x++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
		
		// ultima linea
		for(int i = 0; i < tamanio; i++) {
            System.out.print("*");
            
        }
		System.out.println();
	}
	
	static void validarEmail() {
		Scanner scan = new Scanner(System.in);
		System.out.println("*Introduce email*");
		String email = scan.nextLine().trim();
		String mensajeError = "";
			
		//No puede contener espacios en blanco
		if(email.contains(" ")) {
			mensajeError = " el email no puede tener espacios en blanco";
		}
		//Contiene solamente una @
		if(email.indexOf("@")== -1 || email.indexOf("@") != email.lastIndexOf("@") ) {
			mensajeError += " el email tiene que tener una @";
		}
		//Contiene un punto despues de la arroba
		if(!email.substring(email.indexOf("@")).contains(".")) {
			mensajeError += " tiene que tener al menos un punto";
		}else {
			//Contiene de 2 a 6 caracteres despues del último punto
			if( email.length() - email.lastIndexOf(".")-1 < 2 || email.length() - email.lastIndexOf(".")-1 > 6 ){
				mensajeError += " el número de caracteres después del último punto es incorrecto";
			}
		}
		if(mensajeError.equals("")) {
			System.out.println("El email "+ email+" es correcto");
		}else {
			System.out.println("El email "+ email+" no es correcto" + mensajeError);
		}
	}
	
	static void fibonnacci() {
		Scanner scan = new Scanner(System.in);
		System.out.println("*Introduce la cantidad de números que quiere mostrar*");
		int cantidad = scan.nextInt();
		int pos1 = 0;
		int pos2 = 1;
		int aux;
		for(int i=0; i < cantidad; i++) {
			System.out.print(pos1+ " ");
			aux = pos1 + pos2;
			pos1 = pos2;
			pos2 = aux;
		}
		System.out.println("\n");
	}
	
	/*
	 * fibonnaci (funcion recursiva)
	 *  Scanner scan = new Scanner(System.in);
		System.out.println("*Introduce la cantidad de números que quiere mostrar*");
		int cantidad = scan.nextInt();
		for(int i = 0; i<cantidad; i++){
			int numero = fibonnacciRecursiva(i);
			System.out.println(numero);
		}
		static int fibonnacciRecursiva(int numero){
			if(numero == 0 || numero == 1){
				return numero;
			}else{
				return fibonnacciRecursiva(numero-1) + fibonnacciRecursiva(numero-2);
			}
		}
	 *  
	*/
	static void alumnos() {
		Scanner scan = new Scanner(System.in);
		System.out.println("*Introduce cuantos alumnos hay en clase*");
		int cantidadAlumnos = scan.nextInt();
		String [] listaAlumnos = new String[cantidadAlumnos];
		System.out.println("*¿Como se llaman los alumnos que hay en clase?*");
		
		for(int i = 0; i <= listaAlumnos.length; i++) {
		
			listaAlumnos[i] = Utils.pideValor("Introduce nombre alumno "+(i+1));
		}
		
		for (String alumno : listaAlumnos) {
			System.out.println(alumno);
		}
		
		System.out.println();
	}
}



