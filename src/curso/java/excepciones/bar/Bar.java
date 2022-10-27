package curso.java.excepciones.bar;

import curso.java.excepciones.bar.exceptions.TooColdTemperatureException;
import curso.java.excepciones.bar.exceptions.TooHotTemperatureException;

public class Bar {

	public static void main(String[] args) {
		int temperatura = (int)Math.ceil((100 * Math.random()));
		TazaCafe taza1 = new TazaCafe(temperatura);
		Cliente cliente1 = new Cliente("Tomás");
		
		try {
			cliente1.tomarCafe(taza1);
		} catch (TooHotTemperatureException th) {
			System.out.println(th.getMessage() + ", el cliente se ha quemado." + "La taza esta a: " + taza1.getTemperatura() + "º");
		} catch (TooColdTemperatureException tc) {
			System.out.println(tc.getMessage() + ", el cliente ha dejado el cafe." + "La taza esta a: " + taza1.getTemperatura() + "º");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
