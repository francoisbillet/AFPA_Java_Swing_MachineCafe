package utils;

public abstract class Stockable {

	private int id;
	private String nom;
	private int valeur;
	private int qte;
	
	public Stockable(int id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
		this.valeur = 0;
		this.qte = 0;
	}
	
	public Stockable(int id, String nom, int valeur) {
		super();
		this.id = id;
		this.nom = nom;
		this.valeur = valeur;
		this.qte = 0;
	}
	
	public Stockable(int id, String nom, int valeur, int qte) {
		super();
		this.id = id;
		this.nom = nom;
		this.valeur = valeur;
		this.qte = qte;
	}

	public int getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}
	
	public void addQte() {
		this.qte ++;
	}
	
	public void addQte(int qte) {
		this.qte += qte;
	}
	
	public void enleverQte() {
		this.qte --;
	}
	
	public void enleverQte(int qte) {
		this.qte -= qte;
	}
	
}
