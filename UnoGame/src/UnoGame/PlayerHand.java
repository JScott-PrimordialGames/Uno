package UnoGame;

import java.util.ArrayList;

class PlayerHand {

	ArrayList<UnoCard> cardsInHand = new ArrayList<UnoCard>();
	static ArrayList<UnoCard> cardsInHandSet = new ArrayList<UnoCard>();
    int playerNumber;
    boolean calledUno = false;
    static int id;
	
	public PlayerHand(int playerNumber) {
		this.playerNumber = playerNumber;
	}
	
	
	public int getPlayerNumber() {
		return playerNumber;
	}
	
	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}
	
	public ArrayList<UnoCard> getCardsInHand() {
		return cardsInHand;
		
	}
	
	public void setCardsInHand(ArrayList<UnoCard> cardsInHand)
	{
		this.cardsInHand = cardsInHand;
		
	}
	
	public String toString() {
		return "Player " + playerNumber + "s Hand is:" + cardsInHand;
	}
}