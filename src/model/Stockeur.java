package model;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Observable;

import utils.Stockable;

// GENERICITE
public class Stockeur<T extends Stockable> {

	protected Map<Integer, T> stock = new HashMap<Integer, T>();
	
	public Map<Integer, T> getStock() {
		return stock;
	}

	public void addItem(T item) {
		stock.put(item.getId(), item);
	}

	public void ajouterQuantiteItem(Integer itemId) {
		stock.get(itemId).addQte();
	}
	
	public void enleverQuantiteItem(Integer itemId) {
		stock.get(itemId).enleverQte();
	}
	
	public T getItem(Integer itemId) {
		return stock.get(itemId);
	}
	
	public String[] stockEnString() {
		String[] stockEnString = new String[stock.size()];
		for (Entry<Integer, T> e : stock.entrySet()) {
			//System.out.println(e.getKey() + " " + e.getValue().getNom() + " " + e.getValue().getValeur() + " " + e.getValue().getQte());
			//stockEnString[e.getKey()] = e.getValue().getNom() + " " + e.getValue().getValeur() + " " + e.getValue().getQte();
			//stockEnString[e.getKey()] = e.getValue().getNom() + " (" + e.getValue().getValeur() + ")";
			stockEnString[e.getKey()] = e.getValue().getNom();
		}
		return stockEnString;
	}
	
}
