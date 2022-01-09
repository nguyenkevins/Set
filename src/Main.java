/*
 * 
 * Project Title  : SET
 * Project Author : Kevin Nguyen
 * 
 * Main.java
 * 
 * This file is the main core of the program. 
 * The Main.java is supposed to look at the cat
 * UNIX command and read the inputs inside it.
 * After reading the input, it proceeds to create
 * a Game object to start the game.
 * 
 * List of Class:
 * Main.java
 * Game.java
 * Card.java
 * CardTest.java (for Unit Testing the Card.java file)
 * GameTest.java (for Unit Testing the Game.java file)
 *
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		Game game = new Game();
		game.readText(input);
		game.calculate();
		game.display();
	}
}
