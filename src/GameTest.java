/*
 * 
 * GameTest.java
 * 
 * Test essentials functions in the Game class
 * to make sure they work properly.
 *
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class GameTest {
	@Test
	public void happyPath0() {
		Card card0 = new Card("yellow", "$$");
		Card card1 = new Card("yellow", "s");
		Card card2 = new Card("yellow", "SSS");
		Game game0 = new Game();
		assertEquals(true, game0.testCompleteSet(card0, card1, card2));
	}
	
	@Test
	public void happyPath1() {
		Card card0 = new Card("green", "$");
		Card card1 = new Card("yellow", "SS");
		Card card2 = new Card("blue", "sss");
		Game game0 = new Game();
		assertEquals(true, game0.testCompleteSet(card0, card1, card2));		
	}
	
	@Test
	public void happyPath2() {
		Card card0 = new Card("green", "S");
		Card card1 = new Card("yellow", "A");
		Card card2 = new Card("blue", "H");
		Game game0 = new Game();
		assertEquals(true, game0.testCompleteSet(card0, card1, card2));		
	}
	
	@Test
	public void happyPath3() {
		Card card0 = new Card("blue", "H");
		Card card1 = new Card("green", "S");
		Card card2 = new Card("yellow", "A");
		Game game0 = new Game();
		assertEquals(true, game0.testCompleteSet(card0, card1, card2));		
	}
	
	@Test
	public void happyPath4() {
		Card card0 = new Card("green", "$$$");
		Card card1 = new Card("green", "$");
		Card card2 = new Card("green", "$$");
		Game game0 = new Game();
		assertEquals(true, game0.testCompleteSet(card0, card1, card2));		
	}	
	
	@Test
	public void happyPath5() {
		Card card0 = new Card("green", "HHH");
		Card card1 = new Card("blue", "hhh");
		Card card2 = new Card("blue", "HHH");
		Game game0 = new Game();
		assertEquals(false, game0.testCompleteSet(card0, card1, card2));		
	}	

	@Test
	public void happyPath6() {
		Card card0 = new Card("green", "aa");
		Card card1 = new Card("blue", "H");
		Card card2 = new Card("yellow", "$");
		Game game0 = new Game();
		assertEquals(false, game0.testCompleteSet(card0, card1, card2));		
	}
	
	@Test
	public void happyPath7() {
		Game game0 = new Game();
		assertEquals(true, game0.testSet(3, 3, 3));
	}
	
	@Test
	public void happyPath8() {
		Game game0 = new Game();
		assertEquals(true, game0.testSet(2, 2, 2));
	}
	
	@Test
	public void happyPath9() {
		Game game0 = new Game();
		assertEquals(true, game0.testSet(1, 1, 1));
	}
	
	@Test
	public void happyPath10() {
		Game game0 = new Game();
		assertEquals(true, game0.testSet(1, 2, 3));
	}
	
	@Test
	public void happyPath11() {
		Game game0 = new Game();
		assertEquals(false, game0.testSet(1, 2, 2));
	}
	
	@Test
	public void happyPath12() {
		Game game0 = new Game();
		assertEquals(false, game0.testSet(2, 2, 3));
	}
}