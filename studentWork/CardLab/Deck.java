package studentWork.CardLab;

import java.util.Arrays;

public class Deck {

    private Card[] cardDeck;
    private int cardIndex = 0;

    public Deck(int[] values, String[] suits) {

        this.cardDeck = new Card[values.length * suits.length];
        this.cardIndex = 0;

       initilizeCards(suits, values);

    }

    public Deck(){
        this.cardIndex = 0;

        String[] suits = {"Spades", "Hearts", "Dimond", "Clubs"};

        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        
        this.cardDeck = new Card[52];

        initilizeCards(suits, values);

        }
    
    public String toString(){

        String a = "A deck of " + cardDeck.length + " with a top card of " + Draw(cardDeck);
        return a;
    


    }
       
    private void initilizeCards(String[] suits, int[] values) {

        for( int value: values) {

            for( String suit: suits){
                Card card = new Card(value, suit);
                cardDeck[cardIndex] = card;
                cardIndex++;
                

            }

        }
        

    }

    public void shuffle(){

        CardShuffler shuffle = new CardShuffler();

        shuffle.shuffle(cardDeck);
        

        
            
    }

    public boolean hasNext(){

        if(cardDeck.length > cardIndex){
            return true;
        }
        
        return false; 
    }

    public Card Draw(Card[] cardDeck) {

        Card a = cardDeck[0];

        for(int i = 0;  i < cardDeck.length - 1; i++) {
            cardDeck[i] = cardDeck[i + 1];

        }
        cardDeck[cardDeck.length - 1] = a;

        return a;





    }

    public void discard(Card[] input){

    }

  
    }

    
    


