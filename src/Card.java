/*
 * 
 * Card.java
 * 
 * The Card.java is a template for the card
 * objects. Each card objects have a color name
 * and a type. This class focuses on breaking down
 * the importance of each card such as the number
 * of types and letter used.
 *
 */
public class Card {
	
	private String color;
	private String type;
	
	public Card() {
		this.color = "";
		this.type = "";
	}
	
	public Card(String color, String type) {
		this.color = color;
		this.type = type;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	
	public String getColorName() {
		return this.color;
	}
	
	/*
	 * getColor()
	 * 
	 * Return 1 represents blue
	 * Return 2 represents green
	 * Return 3 represents yellow
	 * Return -999 means error
	 * 
	 */
	public int getColor() {
		if(this.color.equals("blue")) {
			return 1;
		} else if(this.color.equals("green")) {
			return 2;
		} else if(this.color.equals("yellow")) {
			return 3;
		} else {
			return -999;
		}
	}
	
	
	/*
	 * getTypeAmount()
	 * 
	 * Returns type string
	 * 
	 */	
	public String getType() {
		return this.type;
	}
	
	/*
	 * getTypeAmount()
	 * 
	 * Returns size of the type
	 * 
	 */
	public int getTypeAmount() {
		return this.type.length();
	}
	
	
	/*
	 * getTypeCase()
	 * 
	 * Return 1 represents lower-case
	 * Return 2 represents upper-case
	 * Return 3 represents symbols
	 * Return -999 means error
	 * 
	 */
	public int getTypeCase() {
		if(this.type.charAt(0) == 'a' || this.type.charAt(0) == 's' || this.type.charAt(0) == 'h') {
			return 1;
		} else if(this.type.charAt(0) == 'A' || this.type.charAt(0) == 'S' || this.type.charAt(0) == 'H') {
			return 2;
		} else if(this.type.charAt(0) == '@' || this.type.charAt(0) == '$' || this.type.charAt(0) == '#') {
			return 3;
		} else {
			return -999;
		}
	}
	
	/*
	 * getTypeLetter()
	 * 
	 * Return 1 represents a,A,@
	 * Return 2 represents s,S,$
	 * Return 3 represents h,H,#
	 * Return -999 means error
	 * 
	 */	
	public int getTypeLetter() {
		if(this.type.charAt(0) == 'a' || this.type.charAt(0) == 'A' || this.type.charAt(0) == '@') {
			return 1;
		} else if(this.type.charAt(0) == 's' || this.type.charAt(0) == 'S' || this.type.charAt(0) == '$') {
			return 2;
		} else if(this.type.charAt(0) == 'h' || this.type.charAt(0) == 'H' || this.type.charAt(0) == '#') {
			return 3;
		} else {
			return -999;
		}
	}
}