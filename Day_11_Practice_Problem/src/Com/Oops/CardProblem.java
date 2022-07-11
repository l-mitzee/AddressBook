package Com.Oops;


public class CardProblem {

        public static void main(String[] args) {
            System.out.println("Welcome to the card of deck program ");
            String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
            String[] CARD_RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
            String[] cardsArray = new String[52];
            int start = 0;
            int end = 12;
            int j1 = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = start; j <= end; j++) {
                    cardsArray[j] = SUITS[i] + " " + CARD_RANKS[j1];
                    j1++;
                }
                j1 = 0;
                start = end + 1;
                end += 13;
            }
            System.out.println("-----------------------------------------------");
            System.out.println("Number of the card's suits and their ranks:- ");
            for (int i = 0; i < cardsArray.length; i++) {
                System.out.println(cardsArray[i] + " ");
            }

            System.out.println("-----------------------------------------------");
            int n = SUITS.length * CARD_RANKS.length;
            String[] deck= new String[n];
            for (int i = 0; i < CARD_RANKS.length; i++) {
                for (int j = 0; j < SUITS.length; j++) {
                    deck [SUITS.length * i + j] = CARD_RANKS[i] + " of " + SUITS[j];

                }
            }
            for (int i = 0; i < n; i++) {
                int r = i + (int) (Math.random() * (n - i));
                String temp = deck[r];
                deck[r] = deck[i];
                deck[i] = temp;
            }
            for (int i = 0; i < 4; i++) {
                System.out.println("");
                System.out.println("Number of player " + (i + 1) + " and their 9 cards are:- ");
                System.out.println("-------------------------------------------");
                for (int j = 0; j < 9; j++) {
                    System.out.println(deck[i + j * 4] + " (Card " + (i + j * 4) +")");
                }
            }
        }

}