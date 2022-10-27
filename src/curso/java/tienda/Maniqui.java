package curso.java.tienda;

public class Maniqui {
	private int id;
	private Camisa camisa;
	private Pantalon pantalon;
	private Vestido vestido;
	
	// Constructor 
	
	public Maniqui(int id) {
		super();
		this.id = id;
	}
	
	//Getters & Setters
	
	public int getId() {
		return id;
	}
	public Camisa getCamisa() {
		return camisa;
	}
	public void setCamisa(Camisa camisa) {
		this.camisa = camisa;
	}
	public Pantalon getPantalon() {
		return pantalon;
	}
	public void setPantalon(Pantalon pantalon) {
		this.pantalon = pantalon;
	}
	public Vestido getVestido() {
		return vestido;
	}
	public void setVestido(Vestido vestido) {
		this.vestido = vestido;
	}
	
	//Método vestir() y desvestir()
	
	void vestir(Camisa camisa, Pantalon pantalon) {
		desvestir();
		setCamisa(camisa);
		System.out.println("Vistiendo al maniqui con id " + this.getId() + " con camisa y pantalón");
		setPantalon(pantalon);
	}
	
	void vestir(Vestido vestido) {
		desvestir();
		System.out.println("Vistiendo al maniqui con id " + this.getId() + " con vestido");
		setVestido(vestido);
	}
	
	void desvestir() {
		if(getCamisa() != null)  
			System.out.println("Desvistiendo al maniqui con id " + this.getId());
			setCamisa(null);
	
		if(getPantalon() != null)
			System.out.println("Desvistiendo al maniqui con id " + this.getId());
			setPantalon(null);						

		if(getVestido() != null) 
			System.out.println("Desvistiendo al maniqui con id " + this.getId());
			setVestido(null);
	
	}
}
