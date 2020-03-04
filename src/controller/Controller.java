package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map.Entry;

import model.Model;
import model.Monnayeur;
import model.Stockeur;
import utils.Boisson;

public class Controller implements ActionListener {

	/*private Stockeur<Boisson> stockBoissons;
	private Monnayeur monnayeur;*/
	
	private Model model;
	
	public Controller(Model m) {
		/*this.stockBoissons = stockBoissons;
		this.monnayeur = stockPieces;*/
		this.model = m;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		int id = Integer.parseInt(str.substring(0,1));
		// Si la 2ème lettre est un b, cad si le bouton correspond à une boisson
		if (str.substring(1).equals("b")) {
			System.out.println(model.getStockBoissons().getItem(id).getNom());
			//String test = stockBoissons.chosenDrink(id);
		}
		// Si la 2ème lettre est un p, cad si le bouton correspond à une pièce
		else if (str.substring(1).equals("p")) {
			System.out.println(model.getMonnayeur().getItem(id).getNom());
		}
		else {
			System.out.println("Action inconnue");
		}
	}
	
	
	
}
