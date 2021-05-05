package studentWork.CardLab;


/**
 * Game of War
 * 
 * Game Rules:
 * 1. Each player draws a card from their deck. The player with the higher card value
 *    wins that round adds both cards to the bottom of their deck.
 * 2. If the cards have the same value, no one wins the cards.
 * 3. The game ends when one player has all the cards.
 */
public class WarGameClient {

    public static void main(String[] args) {
        // 1. Create a standard 52-card Deck and shuffle it.
        Deck standardDeck = new Deck();
        standardDeck.shuffle();
        // 2. Deal half the deck to each player. We will have two players,
        // each represented as a Deck.
        Deck deck1 = standardDeck.deal(26);
        Deck deck2 = standardDeck.deal(26);

        int count = 0;

        // 3. We want the game to continue until one of the players runs out of cards.
        // Fill in the condition of the while loop below. (Hint: what method on Deck
        // helps us check if there are cards left in the deck?)
        while (deck1.hasNext() == true && deck2.hasNext() == true) {
            // 4. Draw the top card of each player's deck. Print each of the cards.
            Card player1Card = deck1.Draw();
            Card player2Card = deck2.Draw();
            System.out.println();
            System.out.println(player1Card);
            System.out.println(player2Card);

            // 5. Determine which card has the higher value. Add both cards to the bottom
            // of the player's deck that drew the higher card. In the case of a tie,
            // do not give the cards to either player. Instead, print "It's a tie!".
            int card1 = player1Card.getValue();
            int card2 = player2Card.getValue();
            if(card1 > card2){
                deck1.discard(player1Card);
                deck1.discard(player2Card);
            } else if (card2 > card1) {
                deck2.discard(player1Card);
                deck2.discard(player2Card);
            } else {
                System.out.println("Its a tie");
            }

            // 6. Print the size of each deck.
            System.out.println("The score is");
            System.out.println(deck1.size());
            System.out.println(deck2.size());
            System.out.println();
            System.out.println("---> " + count);
            count++;
            deck1.shuffle(); //Added another shuffle because the game would not end :)
            deck2.shuffle();
        }

        // 7. We finally finished a game of War! Call the determineWinner method to see who won.
        determineWinner(deck1, deck2);
    }

    /**
     * 8. Write a method to determine who won the game. A player won the game if they
     * have more cards in their deck than the other player. If the players have the
     * same number of cards in each of their decks, then it is a tie. Print the outcome.
     */
    private static void determineWinner(Deck player, Deck computer) {

    
        if(player.size() > computer.size() ) {
            System.out.println("The player Has won");
        } else {
            System.out.println("The computer has won");
        }

    }
}