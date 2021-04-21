package studentWork.Unit8.CardLabPartII;

import java.util.Arrays;

public class Deck {

    private Card[] cardDeck;
    private int cardIndex;

    public Deck(int[] values, String[] suits) {


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

        String a = "A deck of " + this.cardDeck.length + " with a top card of " + Draw();
        this.cardIndex = 0;
        return a;
    


    }
       
    private void initilizeCards(String[] suits, int[] values) {

        this.cardDeck = new Card[values.length * suits.length];

        for( int value: values) {

            for( String suit: suits){
                Card card = new Card(value, suit);
                this.cardDeck[this.cardIndex] = card;
                this.cardIndex++;
                

            }

        }
        this.cardIndex = 0;
        

    }

    public Card[] shuffle(){

        CardShuffler shuffle = new CardShuffler();

    
        this.cardDeck = shuffle.shuffle(cardDeck);

        return this.cardDeck;

        
            
    }

    public boolean hasNext(){

        if(this.cardIndex > this.cardDeck.length){
            return false;
        }
        
        return true; 
    }

    public Card Draw() { 

        Card a = this.cardDeck[this.cardIndex];
       

        for(int i = 0;  i < this.cardDeck.length - 1; i++) {
            this.cardDeck[i] = this.cardDeck[i + 1];
        } 
        

        return a;
    }

    public void discard(Card input){

        this.cardDeck[this.cardDeck.length - 1] = input;

    }

    public void print() {
        for(Card card: this.cardDeck) {
            System.out.println(card);
        }
    }



  
    }

    
    


