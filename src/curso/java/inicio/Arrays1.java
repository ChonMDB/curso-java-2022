package curso.java.inicio;

public class Arrays1 {

	public static void main(String[] args) {
		
		String[][] colores = new String [3][];
		colores[0] = new String[3];
		colores[1] = new String[5];
		colores[2] = new String[6];
		
		colores[0][1] = "Blanco";
		System.out.println((colores[0][1]));
	}
}
