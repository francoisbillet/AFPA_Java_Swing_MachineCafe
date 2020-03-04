package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.Map.Entry;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import model.Model;
import model.Monnayeur;
import model.Stockeur;
import utils.Boisson;
import utils.Boissons;
import utils.Piece;

@SuppressWarnings("deprecation")
public class View extends JFrame implements Observer {

	// Containers
	private Container mainContainer = getContentPane();
	private JPanel centerPanel = new JPanel(new FlowLayout());
	private JPanel leftPanel = new JPanel(new GridLayout(0,2));
	private JPanel rightPanel = new JPanel(new GridLayout(0,2));
	
	// Titre
	private JLabel title = new JLabel("Distributeur de boissons");
	
	// Tableaux de boissons et pièces
	/*private String[] boissonsEnString;
	private String[] piecesEnString;*/
	
	// Modèle
	private Model model;
	
	// Liste de boutons
	private ArrayList<JButton> buttons = new ArrayList<JButton>();
	
	// Zone de texte
	private JTextArea textArea = new JTextArea("Texte");
	
	public View(Model model) {
		/*this.boissonsEnString = boissonsEnString;
		this.piecesEnString = piecesEnString;*/
		
		this.model = model;
		
		setSize(400,200);
		mainContainer.setLayout(new BorderLayout());
		mainContainer.add(title, BorderLayout.NORTH);
		this.setTitle("Distributeur de boissons");
		
		createDrinkButtons();
		createCoinsButtons();
		
		centerPanel.add(leftPanel);
		centerPanel.add(rightPanel);
		mainContainer.add(centerPanel);
		
		mainContainer.add(textArea, BorderLayout.SOUTH);
		
	}
	
	// On créee les boutons correspondant aux boissons
	public void createDrinkButtons() {
		for (Entry<Integer, Boisson> e : model.getStockBoissons().getStock().entrySet()) {
			JButton button = new JButton(e.getValue().getNom());
			// L'actioncommand du bouton de la boisson est son id + la lettre b
			button.setActionCommand(e.getValue().getId() + "b");
			buttons.add(button);
			leftPanel.add(button);
		}
	}
	
	// On créee les boutons correspondant aux pièces
	public void createCoinsButtons() {
		for (Entry<Integer, Piece> e : model.getMonnayeur().getStock().entrySet()) {
			JButton button = new JButton(e.getValue().getNom());
			// L'actioncommand du bouton de la pièce est son id + la lettre p
			button.setActionCommand(e.getValue().getId() + "p");
			buttons.add(button);
			rightPanel.add(button);
		}
	}
	
	public void setListener(ActionListener al) {
		// On ajoute un listener sur chaque bouton
		for (JButton button : buttons) {
			button.addActionListener(al);
		}
	}

	@Override
	public void update(Observable o, Object arg) {
		//centerPanel.removeAll();
		
	}
	
}
