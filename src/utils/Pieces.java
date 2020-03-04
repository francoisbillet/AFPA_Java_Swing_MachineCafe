package utils;

public enum Pieces {

	DIX (0, "10cts", 10),
	VINGT (1, "20cts", 20),
	CINQUANTE (2, "50cts", 50),
	UN (3, "1€", 100),
	DEUX (4, "2€", 200);
	
	private int id;
	private String nom;
	private int valeur;
	private int qte;
	
	Pieces(int id, String nom, int valeur) {
		this.id = id;
		this.nom = nom;
		this.valeur = valeur;
		this.qte = 4;
	}

	public int getId() {
		return id;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getValeur() {
		return valeur;
	}
	
	public int getQuantite() {
		return qte;
	}
}
