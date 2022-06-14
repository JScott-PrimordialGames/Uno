package UnoGame;

import java.util.ArrayList;
import UnoGame.UnoCard;

public class Pile {
	
	static ArrayList<UnoCard> discardPile = new ArrayList<UnoCard>();
	static UnoCard topOfPile = null;
	
	public static void addToPile(UnoCard card) {
		discardPile.add(topOfPile);
		topOfPile = card;
		System.out.println("Top card in pile is: " + topOfPile);
	}
}
