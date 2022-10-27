package curso.java.inicio;

import curso.java.funciones.Utils;

public class Ejercicio3UnDado {

	public static void main(String[] args) {
		
		int numeroTiradas = Integer.parseInt(Utils.pideValor("Cuantas veces quieres tirar el dado?"));
		int [] tiradas = new int [numeroTiradas];
		int media = 0;
		int total=0;
		int tiradaMasAlta = 0;
		int tiradaMasBaja = 0;
		System.out.println("Un solo dado:");
		for(int i = 0; i < numeroTiradas; i++) {
			tiradas[i] = Utils.tirarUnDado();
			total+=tiradas[i];
			if(tiradas[i] > tiradaMasAlta) {
				tiradaMasAlta = tiradas[i];
			}
			tiradaMasBaja = tiradas[0];
			if(tiradas[i] < tiradaMasBaja) {
				tiradaMasBaja = tiradas[i];
			}
		}
		media = total/numeroTiradas;
		System.out.println("La media es: " + media);
		System.out.println("La tirada mas alta es: " + tiradaMasAlta);
		System.out.println("La tirada mas baja es: " + tiradaMasBaja);

	}
}
