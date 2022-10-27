package curso.java.excepciones;

public class ExcepcionesMain {

	public static void main(String[] args) {
		
		System.out.println("Inicio");
		try {
			ClaseErrorA cea = new ClaseErrorA();
			cea.metodo1();
			
			
			String [] colores = {"Blanco", "Azul"};
			int num = 7/0;
			System.out.println(num);
		}catch(MiExcepcion e1) {
			e1.getStackTrace();
			System.out.println(e1.getMessage());
		}catch(ArithmeticException ae) {
			System.out.println("Ha habido un problema con la division " + ae.getMessage());
		}catch(ArrayIndexOutOfBoundsException aiobe) {
			System.out.println("Ha habido un problema con la longitud del array: " + aiobe.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Continua");
			
		}
		System.out.println("Fin");
	}

}
