package studentWork.CardLab;

import java.util.Arrays;

public class Deck {

    private Card[] cardDeck;
    private int cardIndex = 0;

    public Deck(int[] values, String[] suits) {

        this.cardDeck = new Card[values.length * suits.length];
        this.cardIndex = 0;

        for( int value: values) {

            for( String suit: suits){
                Card card = new Card(value, suit);
                cardDeck[cardIndex] = card;
                cardIndex++;
                

            }

        }

    }

    public Deck(){
        this.cardIndex = 0;

        String[] suits = {"Spades", "Hearts", "Dimond", "Clubs"};

        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        
        this.cardDeck = new Card[52];

        for(String suit: suits){

            for(int value: values) {
                cardDeck[cardIndex] = new Card(value, suit);
                cardIndex++;

            }

        }

        }
    
    public String toString(){
    


    }
       
    private void initilize() {
        

           
        

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

    public String Draw(){

    }

  
    }

    
    


