/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card DiaAce = new Card("Ace", "Diamonds", 11);
		Card HeaKing = new Card("King", "Hearts", 10);
		Card SpaEight = new Card("Eight", "Spades", 8);
		DiaAce.pointValue();
		HeaKing.rank();
		SpaEight.suit();
		HeaKing.matches(SpaEight);
		System.out.println(HeaKing);
	}
}
