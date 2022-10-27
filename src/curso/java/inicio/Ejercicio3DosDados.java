package curso.java.inicio;

import java.util.Arrays;

import curso.java.funciones.Utils;

public class Ejercicio3DosDados {

	public static void main(String[] args) {
		
		int numTiradas = 5;
		int tiradaMasAlta = 0;
		int suma = 0;
		int []dadoUno = new int[numTiradas];
		int []dadoDos = new int[numTiradas];
		
		for(int i = 0; i < numTiradas;i++) {
			int dadoUnoAux = Utils.tirarUnDado();
			int dadoDosAux = Utils.tirarUnDado();
			dadoUno[i] = dadoUnoAux;
			dadoDos[i] = dadoDosAux;
			
			if(tiradaMasAlta < (dadoUnoAux + dadoDosAux)) {
				suma = dadoUnoAux + dadoDosAux;
				tiradaMasAlta = i+1;
			}
		}
		System.out.println(Arrays.toString(dadoUno));
		System.out.println(Arrays.toString(dadoDos));
		System.out.println("La tirada con la suma mas alta ha sido : " + tiradaMasAlta);
		System.out.println("La suma mas alta es: " + suma);
	}

}
