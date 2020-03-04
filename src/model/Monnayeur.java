package model;

import utils.Piece;

public class Monnayeur extends Stockeur<Piece> {

	public int monnaieDue(int sommePieces, int prixBoissonChoisie) {
		return sommePieces - prixBoissonChoisie;
	}
	
	public int[] rendreMonnaie(int monnaieDue) {
		int aRendre = monnaieDue;
		int resteARendre = 0;
		//this.getItem(1).setQte(0);
		
		for (int i=Math.min(aRendre/this.getItem(4).getValeur(), this.getItem(4).getQte()); i >= 0; i--) {
			resteARendre = aRendre - (i*this.getItem(4).getValeur());
			for (int j=Math.min(aRendre/this.getItem(3).getValeur(), this.getItem(3).getQte()); j >= 0; j--) {
				resteARendre = aRendre - (i*this.getItem(4).getValeur()) - (j*this.getItem(3).getValeur());
				for (int k=Math.min(aRendre/this.getItem(2).getValeur(), this.getItem(2).getQte()); k >= 0; k--) {
					resteARendre = aRendre - (i*this.getItem(4).getValeur()) - (j*this.getItem(3).getValeur()) - (k*this.getItem(2).getValeur());
					for (int l=Math.min(aRendre/this.getItem(1).getValeur(), this.getItem(1).getQte()); l >= 0; l--) {
						resteARendre = aRendre - (i*this.getItem(4).getValeur()) - (j*this.getItem(3).getValeur()) - (k*this.getItem(2).getValeur()) - (l*this.getItem(1).getValeur());
						for (int m=Math.min(aRendre/this.getItem(0).getValeur(), this.getItem(0).getQte()); m >= 0; m--) {
							resteARendre = aRendre - (i*this.getItem(4).getValeur()) - (j*this.getItem(3).getValeur()) - (k*this.getItem(2).getValeur()) - (l*this.getItem(1).getValeur()) - (m*this.getItem(0).getValeur());
							if (resteARendre == 0) {
								System.out.println("Je vous rends " + i + " pièce(s) de 2€, " + j + " pièce(s) de 1€, " + k + " pièce(s) de 50 cts, " + l + " pièce(s) de 20 cts et " + m + " pièce(s) de 10 cts");
								return new int[] {i, j, k, l, m};
							}
						}
					}
				}
			}
		}
		return new int[0];
	}
	
	public int[] rendreMonnaieBacktracking(int monnaieDue) {
		return new int[] {};
	}
	
	// Je peux rendre une pièce si j'en ai suffisamment et si la valeur de cette pièce n'est pas supérieure à ce que je dois
	public boolean peutRendrePiece(int monnaieDue, int pieceValeur, int pieceQuantite) {
		int nbPiecesARendre = monnaieDue / pieceValeur;
		if (nbPiecesARendre >= 1) {
			return pieceQuantite >= nbPiecesARendre;
		}
		else {
			return false;
		}
	}
	
	public int nbPiecesARendre(int monnaieDue, int pieceValeur) {
		//System.out.println("Je vous rends " + monnaieDue / pieceValeur);
		return monnaieDue / pieceValeur;
	}

}
