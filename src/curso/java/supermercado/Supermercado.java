package curso.java.supermercado;

public class Supermercado {

	public static void main(String[] args) {
		
		Supermercado super1 = new Supermercado();
		Cliente cliente1 = new Cliente("Cristian", "Mendez", "5353532P");
		Cliente cliente2 = new Cliente("Gonzalo", "Fuente", "2431234P");
		Cliente cliente3 = new Cliente("Alberto", "Garcia", "7653532P");
		Cliente cliente4 = new Cliente("Irene", "Lopez", "51231233P");
		
		cliente1.comprar(40);
		cliente2.comprar(20);
		cliente2.comprar(52);
		cliente3.comprar(35);
		cliente4.comprar(22);
		
		Cliente [] clientes = {cliente1, cliente2, cliente3, cliente4};
		super1.importeTotal(clientes);
		
		
	}
	
	private void importeTotal(Cliente [] clientes) {
		int totalImporte = 0;
		for (Cliente cliente : clientes) {
			totalImporte += cliente.getImporteCompra();
		}
		System.out.println("El importe total de todos los clientes es: " + totalImporte);
	}

}
