package curso.java.hipodromo;

public class Hipodromo {

	public static void main(String[] args) {
		
		// Caballos
		
		Caballo caballo1 = new Caballo(1, "uno", 5, 6, 11);
		Caballo caballo2 = new Caballo(2, "dos", 4, 6, 12);
		Caballo caballo3 = new Caballo(3, "tres", 3, 5, 14);
		Caballo [] caballos = {caballo1, caballo2, caballo3};
		
		//Apostantes
		
		Apostante apostante1 = new Apostante("Irene", 300);
		Apostante apostante2 = new Apostante("Cristian", 400);
		Apostante [] apostantes = {apostante1, apostante2};
		
		
		Apuesta apuesta1 = apostante1.apostar();
		System.out.println(apostante1.getNombre() + " has apostado " + apuesta1.getCantidad() + "€ al caballo: " + apuesta1.getCaballo() );
		
		Apuesta apuesta2 = apostante2.apostar();
		System.out.println(apostante2.getNombre() + " has apostado " + apuesta2.getCantidad() + "€ al caballo: " + apuesta2.getCaballo() );
		
		Apuesta [] apuestas = {apuesta1, apuesta2};
		
		// Carrera 
		
		Carrera carrera1 = new Carrera("Carrera uno", 200, caballos);
		
		
		carrera1.setCaballo1(caballo1);
		carrera1.setCaballo2(caballo2);
		carrera1.setCaballo3(caballo3);
		carrera1.setNombre("Carrera 1");
		
	
		int resultadoCarrera1 = carrera1.iniciarCarrera();
		
		System.out.println("El caballo ganador es el numero: " + resultadoCarrera1);
		
		// Resultados de las apuestas 
		
		for(int i = 0; i < apuestas.length;i ++) {
			if(apuestas[i].getCaballo() == resultadoCarrera1) {
				System.out.println("Has ganado " + apostantes[i].getNombre() + (apuestas[i].getCantidad() * 5) + "€");
				apostantes[i].setSaldo(apostantes[i].getSaldo() + (apuestas[i].getCantidad() * 5));
			}else {
				System.out.println("Has perdido " + apostantes[i].getNombre() + apuestas[i].getCantidad() + "€");
				apostantes[i].setSaldo(apostantes[i].getSaldo() - apuestas[i].getCantidad());
			}
			
			System.out.println("El nuevo saldo de " + apostantes[i].getNombre() + " es:" + apostantes[i].getSaldo());
		}
		
	}
}
