import controller.Controller;
import model.Model;
import model.Monnayeur;
import model.Stockeur;
import utils.Boisson;
import utils.Boissons;
import utils.Piece;
import utils.Pieces;
import view.View;

public class Main {

	public static void main(String[] args) {
		
		// Mod�le :
		Model model = new Model(new Stockeur<Boisson>(), new Monnayeur());
		
		Stockeur<Boisson> stockBoissons = model.getStockBoissons();;
		Monnayeur stockPieces = model.getMonnayeur();
		
		// Contr�leur :
		Controller controller = new Controller(model);
		
		// On stocke le nom des boissons et des pi�ces dans des tableaux de String
		String[] boissonsEnString = stockBoissons.stockEnString();
		String[] piecesEnString = stockPieces.stockEnString();
		
		// Vue :
		View view = new View(model);
		
		// Le contr�leur "�coute" la vue
		view.setListener(controller);
		
		// La vue observe les mod�les
		model.addObserver(view);
		model.addObserver(view);
		
		view.setVisible(true);

		/*for (String el: boissonsEnString) {
			System.out.println(el);
		}*/
		
		
	}

}
