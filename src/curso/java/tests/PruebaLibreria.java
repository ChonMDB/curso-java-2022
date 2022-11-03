package curso.java.tests;

import curso.java.ejercicios.libreria.Utilidades;

public class PruebaLibreria {

	public static void main(String[] args) {
		Utilidades utils = new Utilidades("de librerias en Java", 2);
		utils.funcion1("Prueba");
		
		Utilidades.funcion2();
	}

}
