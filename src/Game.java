/*
 * 
 * Game.java
 * 
 * The Game.java controls the flow of the game
 * and the algorithm involved to read the cards,
 * select them, and find matching sets. After all
 * the sets are found, it will display the result.
 *
 */
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;

public class Game {
	
	private BufferedReader input;
	private int number;
	private ArrayList<Card> cards;
	private ArrayList<Card> set;
	private int numberOfSet;
	private int countPossible;
	
	public Game() {
		this.number = -1;
		this.numberOfSet = 0;
		this.countPossible = 0;
	}
		
	public void readText(BufferedReader input) {
		try {
			this.input = input;
			this.number = Integer.parseInt(this.input.readLine());
			cards = new ArrayList<Card>();
			String x = "";
			int index = 0;
			while((x= input.readLine()) != null) {
				String[] split = x.split("\\s+");
				Card newCard = new Card(split[0], split[1]);
				this.cards.add(newCard);
				index++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void calculate() {
		set = new ArrayList<Card>();
		int offset = 0;
		for(int y = 0; y < cards.size(); y++) {
			for(int x = 0; x < cards.size(); x++) {
				for(int loop = 0; loop < cards.size(); loop++) {
					if(loop != x && loop != y && x != y) {
						if(testCompleteSet(cards.get(y), cards.get(x), cards.get(loop))) {
							countPossible++;
						}
					}
				}
			}
		}	
		for(int y = 0; y < cards.size(); y++) {
			for(int x = 0; x < cards.size(); x++) {
				for(int loop = 0; loop < cards.size(); loop++) {
					if(loop != x && loop != y && x != y) {
						if(this.cards.get(y).getColorName().equals("") || this.cards.get(x).getColorName().equals("") || this.cards.get(loop).getColorName().equals("")) {
						} else if(testCompleteSet(cards.get(y), cards.get(x), cards.get(loop))) {
							Card card0 = new Card(this.cards.get(y).getColorName(), this.cards.get(y).getType());
							Card card1 = new Card(this.cards.get(x).getColorName(), this.cards.get(x).getType());
							Card card2 = new Card(this.cards.get(loop).getColorName(), this.cards.get(loop).getType());
							this.set.add(card0);
							this.set.add(card1);
							this.set.add(card2);
							this.cards.get(y).setColor("");
							this.cards.get(x).setColor("");
							this.cards.get(loop).setColor("");
							this.numberOfSet++;
							
						}
					}
				}
			}
		}		
	}
	
	public void display() {
		System.out.println(countPossible/6);
		System.out.println(numberOfSet);
		System.out.println();
		int space = 0;
		for(int i = 0; i < set.size(); i++) {
			System.out.println(set.get(i).getColorName() + " " + set.get(i).getType());
			space++;
			if(space == 3) {
				space = 0;
				System.out.println();
			}
		}
	}
	
	public boolean testCompleteSet(Card x, Card y, Card z) {
		int count = 0;	
		if(testSet(x.getColor(), y.getColor(), z.getColor()) == true) {
			count++;
		}
		
		if(count != 1) {
			return false;
		} else if(testSet(x.getTypeAmount(), y.getTypeAmount(), z.getTypeAmount()) == true) {
			count++;
		}
		
		if(count != 2) {
			return false;
		} else if(testSet(x.getTypeCase(), y.getTypeCase(), z.getTypeCase()) == true) {
			count++;
		}
		
		if(count != 3) {
			return false;
		} else if(testSet(x.getTypeLetter(), y.getTypeLetter(), z.getTypeLetter()) == true) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean testSet(int x, int y, int z) {
		if((x+y+z)%3 == 0) {
			return true;
		} else {
			return false;
		}
	}
}