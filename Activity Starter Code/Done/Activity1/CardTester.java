package Activity1;
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
		Card1 DiaAce = new Card1("Ace", "Diamonds", 11);
		Card1 HeaKing = new Card1("King", "Hearts", 10);
		Card1 SpaEight = new Card1("Eight", "Spades", 8);
		DiaAce.pointValue();
		HeaKing.rank();
		SpaEight.suit();
		HeaKing.matches(SpaEight);
		System.out.println(HeaKing);
	}
}
