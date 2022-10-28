package curso.java.colecciones;
import java.util.ArrayList;

import curso.java.tienda.Boton;

public class ListasJava {

	public static void main(String[] args) {
		
		ArrayList<String> lista1 = new ArrayList<String>();
		
		
		lista1.add("Hola");
		lista1.add("Hola");		
//		lista1.add(1);
//		lista1.add(new Boton("", ""));
		lista1.add("que");
		lista1.add("tal");
		lista1.add("?");
		
		for (String texto : lista1) {
			System.out.print(texto + " ");
		}
		
		System.out.println(lista1.contains("que"));
		System.out.println(lista1.get(lista1.size()-1));
		lista1.set(0, "Hey");
		
		for (String texto : lista1) {
			System.out.print(texto + " ");
		}
		System.out.println();
		System.out.println(lista1);
	}

}
