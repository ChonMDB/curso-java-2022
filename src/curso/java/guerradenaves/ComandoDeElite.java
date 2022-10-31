package curso.java.guerradenaves;

public class ComandoDeElite extends Guerrero{

	int numRandom = (int)Math.ceil((10 * Math.random()));
	@Override
	public int defender() {
		return numRandom;
	}

	@Override
	public int atacar() {
		return numRandom;
	}

}
