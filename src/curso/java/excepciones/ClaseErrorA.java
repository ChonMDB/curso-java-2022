package curso.java.excepciones;

public class ClaseErrorA {
	public void metodo1() throws MiExcepcion {
		System.out.println("LLamando metodo1");
		int numerador = 9;
		int denominador = 0;
		if(denominador == 0) {
			ArithmeticException ae =  new ArithmeticException("Estas dividiendo entre cero y no se puede");
			MiExcepcion me = new MiExcepcion("Excepcion propia");
			
			Exception e =  new Exception("Estas dividiendo entre cero y no se puede");
//			try {
//				throw e;
//			}catch(Exception ex) {
//				
//			}
			throw me;
		}
		System.out.println("Voy a realizar la division");
		int division = numerador/denominador;

	}
}
