
public class Deck_Of_Cards {

	public static void main(String[] args) {

		String[] cardSuit = { "Clubs", "Diamonds", "Hearts", "Spades" };

		String[] cardRank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

		String[] cardsArray = new String[52];

		int start = 0, end = 12, j1 = 0;

		for (int i = 0; i < 4; i++) {
			for (int j = start; j <= end; j++) {
				cardsArray[j] = cardRank[j1] + " of " + cardSuit[i];
				j1++;
			}

			j1 = 0;
			start = end + 1;
			end += 13;
		}

		shuffleCardsDeck(cardsArray);

		System.out.println("Welcome to Deck of Cards ");
		System.out.println();

		int j2 = 0;
		for (int i = 0; i < 4; i++) {
			System.out.println("For Player " + i + " : ");
			for (int j = 0; j < 9; j++) {

				System.out.print(cardsArray[j2] + " ==> ");
				j2++;
			}

			System.out.println();
			System.out.println();
		}

	}

	static void shuffleCardsDeck(String[] cardsArray) {

	}

}
