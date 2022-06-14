package UnoGame;

import java.util.ArrayList;
import java.util.Collections;


public class Deck {	
	
	static GameMode gameMode = new GameMode();
	static ArrayList<UnoCard> cardsInDeck = new ArrayList<UnoCard>();
	
	public void main(String[] args, ArrayList<UnoCard> cardsInDeck){	
			Deck.cardsInDeck = cardsInDeck;
	}
	
	public static void buildDeck() 
	{	
	Collections.shuffle(cardsInDeck);
	gameMode.dealCards();
	}
	public void rebuildDeck() {
		
	}
}
	