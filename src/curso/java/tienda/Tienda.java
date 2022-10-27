package curso.java.tienda;

public class Tienda {

	public static void main(String[] args) {
		
		Tienda tiendaUno = new Tienda();
		
		Maniqui [] maniquies = tiendaUno.crearTienda();
		double total = tiendaUno.precioTotal(maniquies);
		
		System.out.println("El total de euros de todas las prendas de los maniquies es: " + total + "€");
		
	}
	
	private Maniqui [] crearTienda() {
		
		
		Boton botonUno = new Boton("Negro", "Cuadrado");
		Boton botonDos = new Boton("Rojo", "Redondo");
		Boton [] botones = {botonUno, botonDos};
		Camisa camisaUno = new Camisa("Amarilla", "L", 28.0, botones);
		Pantalon pantalonUno = new Pantalon("Azul oscuro", "L", 35.0, botonUno);
		Vestido vestidoUno = new Vestido("Azul", "M", 20.0);

		Maniqui maniquiUno = new Maniqui(2222);
		Maniqui maniquiDos = new Maniqui(3333);
		
		maniquiUno.vestir(vestidoUno);
		maniquiDos.vestir(camisaUno, pantalonUno);
		
		Maniqui [] maniquies = {maniquiUno, maniquiDos};
		
		return maniquies;
	}
	
	private double precioTotal(Maniqui [] maniquies) {
		
		double total = 0;
		for (Maniqui maniqui : maniquies) {
			
			if(maniqui.getVestido() != null)
				total += maniqui.getVestido().getPrecio();
			
			if(maniqui.getCamisa() != null) 
				total += maniqui.getCamisa().getPrecio();
			
			if(maniqui.getPantalon() != null)
				total += maniqui.getPantalon().getPrecio();
		}
		
		return total;
	}
	
}
