package UnoGame;


public class UnoCard {

	String cardColor;
	String cardRule;
	int cardFace;
	Boolean bDoesCardHaveRule;
	
	public UnoCard(String cardColor, String cardRule, int cardFace, Boolean bDoesCardHaveRule)
	{
		
		this.cardColor = cardColor; 
		this.cardRule = cardRule;
		this.cardFace = cardFace;
		this.bDoesCardHaveRule = bDoesCardHaveRule;
		
	}
	
	public String getCardColor() {
		return cardColor;
	}
	
	public void setCardColor(String cardColor) {
		this.cardColor = cardColor;
	}
	
	public int getCardFace() {
		return cardFace;
	}
	
	public void setCardFace(int cardFace) {
		this.cardFace = cardFace;
	}
	public String getCardRule() {
		return cardRule;
	}
	public void setCardRule(String cardRule) {
		this.cardRule = cardRule;
	}
	
	public String toString() {
		return "[" + cardColor + "," + cardFace + "," + cardRule + "]";
	}
}
