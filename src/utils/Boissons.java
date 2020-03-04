package utils;

public enum Boissons {
	
	CAFE (0,"café", 40),
	THÉ (1, "thé", 20),
	CHOCOLAT (2, "chocolat", 60),
	COCA (3, "coca-cola", 150),
	SOUPE (4, "soupe", 10),
	TEQUILA (5, "tequila", 120);
	
	private int id;
	private String nom;
	private int prix;
	private int qte;
	
	Boissons(int id, String nom, int prix) {
		this.id = id;
		this.nom = nom;
		this.prix = prix;
		this.qte = 2;
	}
	
	private int getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public int getPrix() {
		return prix;
	}
	
	public int getQte() {
		return qte;
	}
}
