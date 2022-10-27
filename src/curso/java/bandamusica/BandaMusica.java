package curso.java.bandamusica;

public class BandaMusica {
	public static void main(String[] args) {
		
		BandaMusica banda1 = new BandaMusica();
		banda1.crearInstrumentos();
		banda1.iniciarConcierto(banda1.crearInstrumentos());
	}
	
	Instrumento [] crearInstrumentos() {
		Guitarra guitarra1 = new Guitarra("Guitarra uno", "cuerda", 200, "marca guitarra", 5, "madera" );
		GuitarraElectrica guitarraElectrica1 = new GuitarraElectrica("Guitarra Electrica 1", "cuerda", 370, "marca de guitarra electrica", 5, "madera y metal", 3200 );
		Bateria bateria1 = new Bateria("Bateria uno", "percusion", 700, "marca bateria", 6, 4);
		Piano piano1 = new Piano("Piano uno", "cuerda-percusion", 1300, "marca piano", 8, 3);
		
		Instrumento [] instrumentos = {guitarra1, guitarraElectrica1, bateria1, piano1};
		return instrumentos;
	}
	
	void iniciarConcierto(Instrumento [] instrumentos) {
		for (Instrumento instrumento : instrumentos) {
			instrumento.afinar();
		}
		for (Instrumento instrumento : instrumentos) {
			if(instrumento instanceof Bateria) {
				((Bateria) instrumento).aporrear();
			}
			instrumento.tocar();
		}
	} 
}
