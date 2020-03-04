package utils;
/**
 * 
 */

/**
 * @author 31010-16-07
 *
 */
public class Boisson extends Stockable {

	private String marque;
	
	/**
	 * @param id
	 * @param nom
	 */
	public Boisson(int id, String nom) {
		super(id, nom);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param nom
	 * @param valeur
	 */
	public Boisson(int id, String nom, int valeur) {
		super(id, nom, valeur);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param nom
	 * @param valeur
	 * @param qte
	 */
	public Boisson(int id, String nom, int valeur, int qte) {
		super(id, nom, valeur, qte);
		// TODO Auto-generated constructor stub
	}

	public String getMarque() {
		return marque;
	}
	
	public void setMarque(String marque) {
		this.marque = marque;
	}
	
}