package curso.java.poo;


public class MainClases {

	public static void main(String[] args) {
		
		ClaseA ca = new ClaseA("Cristian");
		ClaseA ca2 = new ClaseA(1,4,"Cristian");
		System.out.println(ca2.getNombre());
		ca2.setNombre("Gonzalo");
		System.out.println(ca2.getNombre());
		
		ClaseB cb = new ClaseB("Holi", 2);
		ClaseA ca3 = new ClaseA(2, 3, "Cristian", cb);
		System.out.println(ca3.getClaseb().getCadena1());
		
	}

}
