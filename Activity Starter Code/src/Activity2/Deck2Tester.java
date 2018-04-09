package Activity2;
/**
 * This is a class that tests the Deck class.
 */
public class Deck2Tester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] suits = {"Spades", "Hearts"};
		String[] ranks = {"Ace", "King"};
		int[] values = {11, 10};
		Deck2 test = new Deck2(ranks, suits, values);
		test.shuffle();
		test.deal();
		test.isEmpty();
		test.size();
		System.out.println(test);
		test.deal();
		test.isEmpty();
	}
}
