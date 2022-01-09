/*
 * 
 * CardTest.java
 * 
 * Test essentials functions in the Card class
 * to make sure they work properly.
 *
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CardTest {
	@Test
	public void happyPath0() {
		Card card0 = new Card("yellow", "$$");
		assertEquals(2, card0.getTypeAmount());
	}
	
	@Test
	public void happyPath1() {
		Card card0 = new Card("blue", "aaa");
		assertEquals(1, card0.getTypeCase());
	}
	
	@Test
	public void happyPath2() {
		Card card0 = new Card("green", "H");
		assertEquals(3, card0.getTypeLetter());
	}
	
	@Test
	public void happyPath3() {
		Card card0 = new Card("yellow", "AAA");
		assertEquals(3, card0.getColor());
	}
}