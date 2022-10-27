package curso.java.hipodromo;


public class Carrera {
	
	private String nombre;
	private int distancia;
	private Caballo caballo1;
	private Caballo caballo2;
	private Caballo caballo3;
	
	private Caballo [] caballos = {caballo1, caballo2, caballo3};
	
	// Constructor 
	
	public Carrera(String nombre, int distancia, Caballo[] caballos) {
		super();
		this.nombre = nombre;
		this.distancia = distancia;
		this.caballos = caballos;
	}

	// Getters & Setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public Caballo getCaballo1() {
		return caballo1;
	}

	public void setCaballo1(Caballo caballo1) {
		this.caballo1 = caballo1;
	}

	public Caballo getCaballo2() {
		return caballo2;
	}

	public void setCaballo2(Caballo caballo2) {
		this.caballo2 = caballo2;
	}

	public Caballo getCaballo3() {
		return caballo3;
	}

	public void setCaballo3(Caballo caballo3) {
		this.caballo3 = caballo3;
	}

	public Caballo[] getCaballos() {
		return caballos;
	}

	public void setCaballos(Caballo[] caballos) {
		this.caballos = caballos;
	}
	
	public int iniciarCarrera() {
		int [] auxCaballos = new int[caballos.length];
		int caballoGanador = 0;
		int dorsalCaballoGanador = 0;
			for(int i=0; caballoGanador < getDistancia(); i++) {
				for(int j= 0; j < caballos.length; j++) {
					if(auxCaballos[j]<= getDistancia()) {
						auxCaballos[j] += caballos[j].correr();
						System.out.println("El caballo " + caballos[j].getDorsal() + " ha recorrido: " +auxCaballos[j] + "metros.");
						
						if(caballoGanador < auxCaballos[j]) {
							caballoGanador = auxCaballos[j];
							dorsalCaballoGanador = caballos[j].getDorsal();
						}
					}
				}
			}
			
		return dorsalCaballoGanador;
	}
}
