package curso.java.excepciones.bar;

import curso.java.excepciones.bar.exceptions.TemperatureException;
import curso.java.excepciones.bar.exceptions.TooColdTemperatureException;
import curso.java.excepciones.bar.exceptions.TooHotTemperatureException;

public class Cliente {
	private String nombre;

	public Cliente(String nombre){
		super();
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	void tomarCafe(TazaCafe taza) throws TemperatureException {
		if(taza.getTemperatura() > 80) {
			TemperatureException teh = new TooHotTemperatureException("El cafe esta muy caliente");
			throw teh;
		}else if(taza.getTemperatura() < 20) {
			TemperatureException tec = new TooColdTemperatureException("El cafe esta muy frio");
			throw tec;
		}else {
			System.out.println("El cliente se toma la taza de cafe");
		}
		
	}
}
