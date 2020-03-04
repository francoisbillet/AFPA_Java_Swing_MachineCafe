package model;

import java.util.Observable;

import utils.Boisson;
import utils.Boissons;
import utils.Piece;
import utils.Pieces;

@SuppressWarnings("deprecation")
public class Model extends Observable {

	private Stockeur<Boisson> stockBoissons;
	private Monnayeur stockPieces;
	
	public Model(Stockeur<Boisson> stockBoissons, Monnayeur monnayeur) {
		this.stockBoissons = stockBoissons;
		this.stockPieces = monnayeur;
		
		// On ajoute les boissons dans le stock de boissons
		for (int i=0; i<Boissons.values().length; i++) {
			stockBoissons.addItem(new Boisson(i, Boissons.values()[i].getNom(), Boissons.values()[i].getPrix(), Boissons.values()[i].getQte()));
		}
		
		// On ajoute les pièces dans le stock de pièces
		for (int i=0; i<Pieces.values().length; i++) {
			stockPieces.addItem(new Piece(i, Pieces.values()[i].getNom(), Pieces.values()[i].getValeur(), Pieces.values()[i].getQuantite()));
		}
	}
	
	public Stockeur<Boisson> getStockBoissons() {
		return stockBoissons;
	}

	public Monnayeur getMonnayeur() {
		return stockPieces;
	}

	public void notifyViews() {
		setChanged();
		notifyObservers();
	}
	
	/*public String drinkChosen(int id) {
		notifyViews();
		return stock.get(id).getNom();
	}*/
	
}
