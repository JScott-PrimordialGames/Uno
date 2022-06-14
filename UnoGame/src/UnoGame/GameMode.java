package UnoGame;



import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Random;



public class GameMode {
	private static final ArrayList<PlayerHand> playersInGame = new ArrayList<PlayerHand>();
	static int players = 4;
	static int playerId = 0;
	static UnoCard card = null;
	static PlayerHand addCard = null;
	static PlayerHand activePlayer = null;
	static int openingHand = 7;
	static int toAdd;
	static boolean reversed = false;
	static boolean addCards = false;
	static boolean skip = false;
	static boolean cardFound = false;
	static boolean bIsWinner = false;
	static UnoCard cardToMatch = null;
	static UnoCard checkedCard = null;
	static Random rand = new Random();
	
	public static void main(String[] args) {
		System.out.println("Welcome to Uno!");
		System.out.println("Press any key to start a 4-player game!");
		Scanner pause = new Scanner(System.in);
		pause.nextLine();
		
		Deck.cardsInDeck.add(new UnoCard("Red", "None", 0, false));
		Deck.cardsInDeck.add(new UnoCard("Red", "None", 1, false));
		Deck.cardsInDeck.add(new UnoCard("Red", "None", 2, false));
		Deck.cardsInDeck.add(new UnoCard("Red", "None", 3, false));
		Deck.cardsInDeck.add(new UnoCard("Red", "None", 4, false));
		Deck.cardsInDeck.add(new UnoCard("Red", "None", 5, false));
		Deck.cardsInDeck.add(new UnoCard("Red", "None", 6, false));
		Deck.cardsInDeck.add(new UnoCard("Red", "None", 7, false));
		Deck.cardsInDeck.add(new UnoCard("Red", "None", 8, false));
		Deck.cardsInDeck.add(new UnoCard("Red", "None", 9, false));
		Deck.cardsInDeck.add(new UnoCard("Red", "Add2", 10, true));
		Deck.cardsInDeck.add(new UnoCard("Red", "Skip", 11, true));
		Deck.cardsInDeck.add(new UnoCard("Red", "Reverse", 12, true));
		Deck.cardsInDeck.add(new UnoCard("Red", "None", 1, false));
		Deck.cardsInDeck.add(new UnoCard("Red", "None", 2, false));
		Deck.cardsInDeck.add(new UnoCard("Red", "None", 3, false));
		Deck.cardsInDeck.add(new UnoCard("Red", "None", 4, false));
		Deck.cardsInDeck.add(new UnoCard("Red", "None", 5, false));
		Deck.cardsInDeck.add(new UnoCard("Red", "None", 6, false));
		Deck.cardsInDeck.add(new UnoCard("Red", "None", 7, false));
		Deck.cardsInDeck.add(new UnoCard("Red", "None", 8, false));
		Deck.cardsInDeck.add(new UnoCard("Red", "None", 9, false));
		Deck.cardsInDeck.add(new UnoCard("Red", "Add2", 10, true));
		Deck.cardsInDeck.add(new UnoCard("Red", "Skip", 11, true));
		Deck.cardsInDeck.add(new UnoCard("Red", "Reverse", 12, true));
		Deck.cardsInDeck.add(new UnoCard("Blue", "None", 0, false));
		Deck.cardsInDeck.add(new UnoCard("Blue", "None", 1, false));
		Deck.cardsInDeck.add(new UnoCard("Blue", "None", 2, false));
		Deck.cardsInDeck.add(new UnoCard("Blue", "None", 3, false));
		Deck.cardsInDeck.add(new UnoCard("Blue", "None", 4, false));
		Deck.cardsInDeck.add(new UnoCard("Blue", "None", 5, false));
		Deck.cardsInDeck.add(new UnoCard("Blue", "None", 6, false));
		Deck.cardsInDeck.add(new UnoCard("Blue", "None", 7, false));
		Deck.cardsInDeck.add(new UnoCard("Blue", "None", 8, false));
		Deck.cardsInDeck.add(new UnoCard("Blue", "None", 9, false));
		Deck.cardsInDeck.add(new UnoCard("Blue", "Add2", 10, true));
		Deck.cardsInDeck.add(new UnoCard("Blue", "Skip", 11, true));
		Deck.cardsInDeck.add(new UnoCard("Blue", "Reverse", 12, true));
		Deck.cardsInDeck.add(new UnoCard("Blue", "None", 1, false));
		Deck.cardsInDeck.add(new UnoCard("Blue", "None", 2, false));
		Deck.cardsInDeck.add(new UnoCard("Blue", "None", 3, false));
		Deck.cardsInDeck.add(new UnoCard("Blue", "None", 4, false));
		Deck.cardsInDeck.add(new UnoCard("Blue", "None", 5, false));
		Deck.cardsInDeck.add(new UnoCard("Blue", "None", 6, false));
		Deck.cardsInDeck.add(new UnoCard("Blue", "None", 7, false));
		Deck.cardsInDeck.add(new UnoCard("Blue", "None", 8, false));
		Deck.cardsInDeck.add(new UnoCard("Blue", "None", 9, false));
		Deck.cardsInDeck.add(new UnoCard("Blue", "Add2", 10, true));
		Deck.cardsInDeck.add(new UnoCard("Blue", "Skip", 11, true));
		Deck.cardsInDeck.add(new UnoCard("Blue", "Reverse", 12, true));
		Deck.cardsInDeck.add(new UnoCard("Yellow", "None", 0, false));
		Deck.cardsInDeck.add(new UnoCard("Yellow", "None", 1, false));
		Deck.cardsInDeck.add(new UnoCard("Yellow", "None", 2, false));
		Deck.cardsInDeck.add(new UnoCard("Yellow", "None", 3, false));
		Deck.cardsInDeck.add(new UnoCard("Yellow", "None", 4, false));
		Deck.cardsInDeck.add(new UnoCard("Yellow", "None", 5, false));
		Deck.cardsInDeck.add(new UnoCard("Yellow", "None", 6, false));
		Deck.cardsInDeck.add(new UnoCard("Yellow", "None", 7, false));
		Deck.cardsInDeck.add(new UnoCard("Yellow", "None", 8, false));
		Deck.cardsInDeck.add(new UnoCard("Yellow", "None", 9, false));
		Deck.cardsInDeck.add(new UnoCard("Yellow", "Add2", 10, true));
		Deck.cardsInDeck.add(new UnoCard("Yellow", "Skip", 11, true));
		Deck.cardsInDeck.add(new UnoCard("Yellow", "Reverse", 12, true));
		Deck.cardsInDeck.add(new UnoCard("Yellow", "None", 1, false));
		Deck.cardsInDeck.add(new UnoCard("Yellow", "None", 2, false));
		Deck.cardsInDeck.add(new UnoCard("Yellow", "None", 3, false));
		Deck.cardsInDeck.add(new UnoCard("Yellow", "None", 4, false));
		Deck.cardsInDeck.add(new UnoCard("Yellow", "None", 5, false));
		Deck.cardsInDeck.add(new UnoCard("Yellow", "None", 6, false));
		Deck.cardsInDeck.add(new UnoCard("Yellow", "None", 7, false));
		Deck.cardsInDeck.add(new UnoCard("Yellow", "None", 8, false));
		Deck.cardsInDeck.add(new UnoCard("Yellow", "None", 9, false));
		Deck.cardsInDeck.add(new UnoCard("Yellow", "Add2", 10, true));
		Deck.cardsInDeck.add(new UnoCard("Yellow", "Skip", 11, true));
		Deck.cardsInDeck.add(new UnoCard("Yellow", "Reverse", 12, true));
		Deck.cardsInDeck.add(new UnoCard("Green", "None", 0, false));
		Deck.cardsInDeck.add(new UnoCard("Green", "None", 1, false));
		Deck.cardsInDeck.add(new UnoCard("Green", "None", 2, false));
		Deck.cardsInDeck.add(new UnoCard("Green", "None", 3, false));
		Deck.cardsInDeck.add(new UnoCard("Green", "None", 4, false));
		Deck.cardsInDeck.add(new UnoCard("Green", "None", 5, false));
		Deck.cardsInDeck.add(new UnoCard("Green", "None", 6, false));
		Deck.cardsInDeck.add(new UnoCard("Green", "None", 7, false));
		Deck.cardsInDeck.add(new UnoCard("Green", "None", 8, false));
		Deck.cardsInDeck.add(new UnoCard("Green", "None", 9, false));
		Deck.cardsInDeck.add(new UnoCard("Green", "Add2", 10, true));
		Deck.cardsInDeck.add(new UnoCard("Green", "Skip", 11, true));
		Deck.cardsInDeck.add(new UnoCard("Green", "Reverse", 12, true));
		Deck.cardsInDeck.add(new UnoCard("Green", "None", 1, false));
		Deck.cardsInDeck.add(new UnoCard("Green", "None", 2, false));
		Deck.cardsInDeck.add(new UnoCard("Green", "None", 3, false));
		Deck.cardsInDeck.add(new UnoCard("Green", "None", 4, false));
		Deck.cardsInDeck.add(new UnoCard("Green", "None", 5, false));
		Deck.cardsInDeck.add(new UnoCard("Green", "None", 6, false));
		Deck.cardsInDeck.add(new UnoCard("Green", "None", 7, false));
		Deck.cardsInDeck.add(new UnoCard("Green", "None", 8, false));
		Deck.cardsInDeck.add(new UnoCard("Green", "None", 9, false));
		Deck.cardsInDeck.add(new UnoCard("Green", "Add2", 10, true));
		Deck.cardsInDeck.add(new UnoCard("Green", "Skip", 11, true));
		Deck.cardsInDeck.add(new UnoCard("Green", "Reverse", 12, true));
		Deck.cardsInDeck.add(new UnoCard("Wild", "Wild", 13, true));
		Deck.cardsInDeck.add(new UnoCard("Wild", "Wild", 14, true));
		Deck.cardsInDeck.add(new UnoCard("Wild", "Wild", 15, true));
		Deck.cardsInDeck.add(new UnoCard("Wild", "Wild", 16, true));
		Deck.cardsInDeck.add(new UnoCard("Wild", "Wild4", 17, true));
		Deck.cardsInDeck.add(new UnoCard("Wild", "Wild4", 18, true));
		Deck.cardsInDeck.add(new UnoCard("Wild", "Wild4", 19, true));
		Deck.cardsInDeck.add(new UnoCard("Wild", "Wild4", 20, true));		
		PlayerHand player1 = new PlayerHand(1);
		playersInGame.add(player1);
		PlayerHand player2 = new PlayerHand(2);
		playersInGame.add(player2);
		PlayerHand player3 = new PlayerHand(3);
		playersInGame.add(player3);
		PlayerHand player4 = new PlayerHand(4);
		playersInGame.add(player4);
		Deck.buildDeck();
	}
	
	public void dealCards() {
		int openingHand = 7;
		for(int c = 0;c < openingHand; c++) { 
			for (int p = 0; p < 4; p++){
				card = Deck.cardsInDeck.get(0);
				addCard = playersInGame.get(p);
				addCard.cardsInHand.add(card);	
				Deck.cardsInDeck.remove(0);	
			}
		}
		for(int g = 0; g < 4; g++) {
			addCard = playersInGame.get(g);
			String line = addCard.toString();
			System.out.println(line);
		}
		activePlayer = playersInGame.get(0);
		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		playFirstTurn();
	}
	
	public static void nextPlayerTurn() {
		if(bIsWinner == false) {
			if(!reversed) {
				playerId++;
				if(playerId == 4) {
					playerId = 0;
				}
			}
			else {
					playerId--;
				if(playerId == -1) {
					playerId = 3;
				}
			}
			if(!skip) {
				playTurn();
			}
			else {
				skip = false;
				PlayerHand skipped = playersInGame.get(playerId);
				System.out.println("Player " + skipped.playerNumber + "'s turn is skipped.");
				try {
					Thread.sleep(1 * 1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				nextPlayerTurn();
			}
		}
		else{
		}
	}
	
	
	public static void addCard(int cardsToAdd) {
		for(int c = 0; c < cardsToAdd; c++) {
			drawCard();
			activePlayer.cardsInHand.add(card);	
			addCards = false;
			toAdd = 0;
		}
	}
	
	public static void playTurn() {
		activePlayer = playersInGame.get(playerId);
		System.out.println("It is Player " + activePlayer.playerNumber + "'s turn!");
		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(!addCards) {
		}
		else {
			System.out.println("Player " + activePlayer.playerNumber + " draws " + toAdd + " cards");
			addCard(toAdd);
			try {
				Thread.sleep(1 * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		cardToMatch = Pile.topOfPile;
		for(UnoCard cardToCheck : activePlayer.cardsInHand) {
			if(cardToCheck.cardColor == cardToMatch.cardColor){
				if(cardToCheck.bDoesCardHaveRule == true) {
					if(cardToCheck.cardRule.contains("Add2")) {
						addCards = true;
						toAdd = 2;
					}else if(cardToCheck.cardRule == "Reverse") {
						reversed = !reversed;
					}else if(cardToCheck.cardRule == "Skip") {
						skip = true;
					}
				}
				cardFound = true;
				checkedCard = cardToCheck;
				break;
			}else if(cardToCheck.cardFace == cardToMatch.cardFace) {
				cardFound = true;
				checkedCard = cardToCheck;
				break;
			}else if(cardToCheck.cardColor == "Wild") {
				System.out.println("WILD!");
				int n = rand.nextInt(2) + 0;
				ArrayList<String> Colors = new ArrayList<String>();
				Colors.add("Red");
				Colors.add("Green");
				Colors.add("Blue");
				Colors.add("Yellow");
				Colors.remove(cardToMatch.cardColor);
				String newColor = Colors.get(n);
				cardToCheck.setCardColor(newColor);
				if(cardToCheck.cardRule == "Wild4") {
					addCards = true;
					toAdd = 4;
				}
				cardFound = true;
				checkedCard = cardToCheck;
				break;
			}
		}
		if(!cardFound) {
			System.out.println("Player " + activePlayer.playerNumber + " draws a card.");
			addCard(1);
			try {
				Thread.sleep(1 * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(UnoCard cardToCheck : activePlayer.cardsInHand) {
				if(cardToCheck.cardColor == cardToMatch.cardColor){
					if(cardToCheck.bDoesCardHaveRule == true) {
						if(cardToCheck.cardRule == "Add2") {
							addCards = true;
							toAdd = 2;
							cardFound = true;
						}else if(cardToCheck.cardRule == "Reverse") {
							if(!reversed) {
								reversed = true;
								}else{
								reversed = false;
							}
							cardFound = true;
						}else if(cardToCheck.cardRule == "Skip") {
							skip = true;
							cardFound = true;
						}
					}
					checkedCard = cardToCheck;
					cardFound = true; 
					break;
				}else if(cardToCheck.cardFace == cardToMatch.cardFace) {
					cardFound = true;
					checkedCard = cardToCheck;
					break;
				}else if(cardToCheck.cardColor == "Wild") {
					System.out.println("WILD!");
					int n = rand.nextInt(2) + 0;
					ArrayList<String> Colors = new ArrayList<String>();
					Colors.add("Red");
					Colors.add("Green");
					Colors.add("Blue");
					Colors.add("Yellow");
					Colors.remove(cardToMatch.cardColor);
					String newColor = Colors.get(n);
					cardToCheck.setCardColor(newColor);
					if(checkedCard.cardRule == "Wild4") {
						addCards = true;
						toAdd = 4;
					}
					checkedCard = cardToCheck;
					cardFound = true;
					break;
				}
			}
		}
		if(cardFound == true) {
			System.out.println("Player " + activePlayer.playerNumber + " has played a card!");
			activePlayer.cardsInHand.remove(checkedCard);
			try {
				Thread.sleep(1 * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Pile.addToPile(checkedCard);
			try {
				Thread.sleep(1 * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			System.out.println("Player " + activePlayer.playerNumber + " could not play a card!");
			
		}
		if(activePlayer.cardsInHand.size() == 0) {
			bIsWinner = true;
			winner();
		}else if(activePlayer.cardsInHand.size() == 1) {
			activePlayer.calledUno = true;
			System.out.println("Player " + activePlayer.playerNumber + " has called Uno!");
			try {
				Thread.sleep(1 * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			activePlayer.calledUno = false;
		}
		cardFound = false;
		nextPlayerTurn();
	}
	
	public void playFirstTurn() {
		System.out.println("Player 1 is starting things off!");
		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		card = activePlayer.cardsInHand.get(0);
		Pile.addToPile(card);
		activePlayer.cardsInHand.remove(0);
		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(card.cardColor == "Wild") {
			System.out.println("WILD!");
			int n = rand.nextInt(3) + 0;
			ArrayList<String> Colors = new ArrayList<String>();
			Colors.add("Red");
			Colors.add("Green");
			Colors.add("Blue");
			Colors.add("Yellow");
			String newColor = Colors.get(n);
			card.setCardColor(newColor);
			if(checkedCard.cardRule == "Wild4") {
				addCards = true;
				toAdd = 4;
			}
			nextPlayerTurn();
		}else if(card.cardRule == "Add2") {
			addCards = true;
			toAdd = 2;
			nextPlayerTurn();
		} else if(card.cardRule == "Reverse") {
			reversed = !reversed;
			nextPlayerTurn();
		}else if(card.cardRule == "Skip") {
			skip = true;
			nextPlayerTurn();
		}else if(card.cardRule == "None") {
			nextPlayerTurn();
		}

	}

	
	public static void winner() {
		System.out.println("Player " + activePlayer.playerNumber + " is the winner!!!");
	}

	public static void drawCard() {
		if(Deck.cardsInDeck.size() < 0) {
			Pile.discardPile.clear();
			Deck.cardsInDeck.add(new UnoCard("Red", "None", 0, false));
			Deck.cardsInDeck.add(new UnoCard("Red", "None", 1, false));
			Deck.cardsInDeck.add(new UnoCard("Red", "None", 2, false));
			Deck.cardsInDeck.add(new UnoCard("Red", "None", 3, false));
			Deck.cardsInDeck.add(new UnoCard("Red", "None", 4, false));
			Deck.cardsInDeck.add(new UnoCard("Red", "None", 5, false));
			Deck.cardsInDeck.add(new UnoCard("Red", "None", 6, false));
			Deck.cardsInDeck.add(new UnoCard("Red", "None", 7, false));
			Deck.cardsInDeck.add(new UnoCard("Red", "None", 8, false));
			Deck.cardsInDeck.add(new UnoCard("Red", "None", 9, false));
			Deck.cardsInDeck.add(new UnoCard("Red", "Add2", 10, true));
			Deck.cardsInDeck.add(new UnoCard("Red", "Skip", 11, true));
			Deck.cardsInDeck.add(new UnoCard("Red", "Reverse", 12, true));
			Deck.cardsInDeck.add(new UnoCard("Red", "None", 1, false));
			Deck.cardsInDeck.add(new UnoCard("Red", "None", 2, false));
			Deck.cardsInDeck.add(new UnoCard("Red", "None", 3, false));
			Deck.cardsInDeck.add(new UnoCard("Red", "None", 4, false));
			Deck.cardsInDeck.add(new UnoCard("Red", "None", 5, false));
			Deck.cardsInDeck.add(new UnoCard("Red", "None", 6, false));
			Deck.cardsInDeck.add(new UnoCard("Red", "None", 7, false));
			Deck.cardsInDeck.add(new UnoCard("Red", "None", 8, false));
			Deck.cardsInDeck.add(new UnoCard("Red", "None", 9, false));
			Deck.cardsInDeck.add(new UnoCard("Red", "Add2", 10, true));
			Deck.cardsInDeck.add(new UnoCard("Red", "Skip", 11, true));
			Deck.cardsInDeck.add(new UnoCard("Red", "Reverse", 12, true));
			Deck.cardsInDeck.add(new UnoCard("Blue", "None", 0, false));
			Deck.cardsInDeck.add(new UnoCard("Blue", "None", 1, false));
			Deck.cardsInDeck.add(new UnoCard("Blue", "None", 2, false));
			Deck.cardsInDeck.add(new UnoCard("Blue", "None", 3, false));
			Deck.cardsInDeck.add(new UnoCard("Blue", "None", 4, false));
			Deck.cardsInDeck.add(new UnoCard("Blue", "None", 5, false));
			Deck.cardsInDeck.add(new UnoCard("Blue", "None", 6, false));
			Deck.cardsInDeck.add(new UnoCard("Blue", "None", 7, false));
			Deck.cardsInDeck.add(new UnoCard("Blue", "None", 8, false));
			Deck.cardsInDeck.add(new UnoCard("Blue", "None", 9, false));
			Deck.cardsInDeck.add(new UnoCard("Blue", "Add2", 10, true));
			Deck.cardsInDeck.add(new UnoCard("Blue", "Skip", 11, true));
			Deck.cardsInDeck.add(new UnoCard("Blue", "Reverse", 12, true));
			Deck.cardsInDeck.add(new UnoCard("Blue", "None", 1, false));
			Deck.cardsInDeck.add(new UnoCard("Blue", "None", 2, false));
			Deck.cardsInDeck.add(new UnoCard("Blue", "None", 3, false));
			Deck.cardsInDeck.add(new UnoCard("Blue", "None", 4, false));
			Deck.cardsInDeck.add(new UnoCard("Blue", "None", 5, false));
			Deck.cardsInDeck.add(new UnoCard("Blue", "None", 6, false));
			Deck.cardsInDeck.add(new UnoCard("Blue", "None", 7, false));
			Deck.cardsInDeck.add(new UnoCard("Blue", "None", 8, false));
			Deck.cardsInDeck.add(new UnoCard("Blue", "None", 9, false));
			Deck.cardsInDeck.add(new UnoCard("Blue", "Add2", 10, true));
			Deck.cardsInDeck.add(new UnoCard("Blue", "Skip", 11, true));
			Deck.cardsInDeck.add(new UnoCard("Blue", "Reverse", 12, true));
			Deck.cardsInDeck.add(new UnoCard("Yellow", "None", 0, false));
			Deck.cardsInDeck.add(new UnoCard("Yellow", "None", 1, false));
			Deck.cardsInDeck.add(new UnoCard("Yellow", "None", 2, false));
			Deck.cardsInDeck.add(new UnoCard("Yellow", "None", 3, false));
			Deck.cardsInDeck.add(new UnoCard("Yellow", "None", 4, false));
			Deck.cardsInDeck.add(new UnoCard("Yellow", "None", 5, false));
			Deck.cardsInDeck.add(new UnoCard("Yellow", "None", 6, false));
			Deck.cardsInDeck.add(new UnoCard("Yellow", "None", 7, false));
			Deck.cardsInDeck.add(new UnoCard("Yellow", "None", 8, false));
			Deck.cardsInDeck.add(new UnoCard("Yellow", "None", 9, false));
			Deck.cardsInDeck.add(new UnoCard("Yellow", "Add2", 10, true));
			Deck.cardsInDeck.add(new UnoCard("Yellow", "Skip", 11, true));
			Deck.cardsInDeck.add(new UnoCard("Yellow", "Reverse", 12, true));
			Deck.cardsInDeck.add(new UnoCard("Yellow", "None", 1, false));
			Deck.cardsInDeck.add(new UnoCard("Yellow", "None", 2, false));
			Deck.cardsInDeck.add(new UnoCard("Yellow", "None", 3, false));
			Deck.cardsInDeck.add(new UnoCard("Yellow", "None", 4, false));
			Deck.cardsInDeck.add(new UnoCard("Yellow", "None", 5, false));
			Deck.cardsInDeck.add(new UnoCard("Yellow", "None", 6, false));
			Deck.cardsInDeck.add(new UnoCard("Yellow", "None", 7, false));
			Deck.cardsInDeck.add(new UnoCard("Yellow", "None", 8, false));
			Deck.cardsInDeck.add(new UnoCard("Yellow", "None", 9, false));
			Deck.cardsInDeck.add(new UnoCard("Yellow", "Add2", 10, true));
			Deck.cardsInDeck.add(new UnoCard("Yellow", "Skip", 11, true));
			Deck.cardsInDeck.add(new UnoCard("Yellow", "Reverse", 12, true));
			Deck.cardsInDeck.add(new UnoCard("Green", "None", 0, false));
			Deck.cardsInDeck.add(new UnoCard("Green", "None", 1, false));
			Deck.cardsInDeck.add(new UnoCard("Green", "None", 2, false));
			Deck.cardsInDeck.add(new UnoCard("Green", "None", 3, false));
			Deck.cardsInDeck.add(new UnoCard("Green", "None", 4, false));
			Deck.cardsInDeck.add(new UnoCard("Green", "None", 5, false));
			Deck.cardsInDeck.add(new UnoCard("Green", "None", 6, false));
			Deck.cardsInDeck.add(new UnoCard("Green", "None", 7, false));
			Deck.cardsInDeck.add(new UnoCard("Green", "None", 8, false));
			Deck.cardsInDeck.add(new UnoCard("Green", "None", 9, false));
			Deck.cardsInDeck.add(new UnoCard("Green", "Add2", 10, true));
			Deck.cardsInDeck.add(new UnoCard("Green", "Skip", 11, true));
			Deck.cardsInDeck.add(new UnoCard("Green", "Reverse", 12, true));
			Deck.cardsInDeck.add(new UnoCard("Green", "None", 1, false));
			Deck.cardsInDeck.add(new UnoCard("Green", "None", 2, false));
			Deck.cardsInDeck.add(new UnoCard("Green", "None", 3, false));
			Deck.cardsInDeck.add(new UnoCard("Green", "None", 4, false));
			Deck.cardsInDeck.add(new UnoCard("Green", "None", 5, false));
			Deck.cardsInDeck.add(new UnoCard("Green", "None", 6, false));
			Deck.cardsInDeck.add(new UnoCard("Green", "None", 7, false));
			Deck.cardsInDeck.add(new UnoCard("Green", "None", 8, false));
			Deck.cardsInDeck.add(new UnoCard("Green", "None", 9, false));
			Deck.cardsInDeck.add(new UnoCard("Green", "Add2", 10, true));
			Deck.cardsInDeck.add(new UnoCard("Green", "Skip", 11, true));
			Deck.cardsInDeck.add(new UnoCard("Green", "Reverse", 12, true));
			Deck.cardsInDeck.add(new UnoCard("Wild", "Wild", 13, true));
			Deck.cardsInDeck.add(new UnoCard("Wild", "Wild", 14, true));
			Deck.cardsInDeck.add(new UnoCard("Wild", "Wild", 15, true));
			Deck.cardsInDeck.add(new UnoCard("Wild", "Wild", 16, true));
			Deck.cardsInDeck.add(new UnoCard("Wild", "Wild4", 17, true));
			Deck.cardsInDeck.add(new UnoCard("Wild", "Wild4", 18, true));
			Deck.cardsInDeck.add(new UnoCard("Wild", "Wild4", 19, true));
			Deck.cardsInDeck.add(new UnoCard("Wild", "Wild4", 20, true));
			Deck.cardsInDeck.remove(Pile.topOfPile);
			Collections.shuffle(Deck.cardsInDeck);
		}
		card = Deck.cardsInDeck.get(0);
	}
}

