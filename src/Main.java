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
		
		// Modèle :
		Model model = new Model(new Stockeur<Boisson>(), new Monnayeur());
		
		Stockeur<Boisson> stockBoissons = model.getStockBoissons();;
		Monnayeur stockPieces = model.getMonnayeur();
		
		// Contrôleur :
		Controller controller = new Controller(model);
		
		// On stocke le nom des boissons et des pièces dans des tableaux de String
		String[] boissonsEnString = stockBoissons.stockEnString();
		String[] piecesEnString = stockPieces.stockEnString();
		
		// Vue :
		View view = new View(model);
		
		// Le contrôleur "écoute" la vue
		view.setListener(controller);
		
		// La vue observe les modèles
		model.addObserver(view);
		model.addObserver(view);
		
		view.setVisible(true);

		/*for (String el: boissonsEnString) {
			System.out.println(el);
		}*/
		
		
	}

}
