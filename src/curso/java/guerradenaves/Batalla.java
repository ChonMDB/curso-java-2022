package curso.java.guerradenaves;

import java.util.ArrayList;

public class Batalla {

	public static void main(String[] args) {

		ComandoDeElite comandoElite1 = new ComandoDeElite();
		ComandoDeElite comandoElite2 = new ComandoDeElite();
		ComandoDeElite comandoElite3 = new ComandoDeElite();
		ComandoDeElite comandoElite4 = new ComandoDeElite();
		ComandoDeElite comandoElite5 = new ComandoDeElite();
		ArrayList<ComandoDeElite> naveComandoElite = new ArrayList<ComandoDeElite>();
		naveComandoElite.add(comandoElite1);
		naveComandoElite.add(comandoElite2);
		naveComandoElite.add(comandoElite3);
		naveComandoElite.add(comandoElite4);
		naveComandoElite.add(comandoElite5);
		
		Gorgonita gorgonita1 = new Gorgonita();
		Gorgonita gorgonita2 = new Gorgonita();
		Gorgonita gorgonita3 = new Gorgonita();
		Gorgonita gorgonita4 = new Gorgonita();
		Gorgonita gorgonita5 = new Gorgonita();
		ArrayList<Gorgonita> naveGorgonita = new ArrayList<Gorgonita>();
		
		naveGorgonita.add(gorgonita1);
		naveGorgonita.add(gorgonita2);
		naveGorgonita.add(gorgonita3);
		naveGorgonita.add(gorgonita4);
		naveGorgonita.add(gorgonita5);
	}

}
