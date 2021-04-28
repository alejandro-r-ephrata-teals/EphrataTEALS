package studentWork.CardLab;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {


    ArrayList<Card> cardDeck;

    public Deck(int[] values, String[] suits) {

       initilizeCards(suits, values);

    }

    public Deck(){

        String[] suits = {"Spades", "Hearts", "Dimond", "Clubs"};

        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        
        this.cardDeck = new ArrayList<Card>(52);

        initilizeCards(suits, values);

        }
    
    public String toString(){

        String a = "A deck of " + this.cardDeck.size() + " with a top card of " + this.cardDeck.get(0);
        
        return a;
    


    }
       
    private void initilizeCards(String[] suits, int[] values) {

        this.cardDeck = new ArrayList<Card>();

        for( int value: values) {

            for( String suit: suits){
                Card card = new Card(value, suit);
                this.cardDeck.add(card);
                
                

            }

        }
        
        

    }

    public void shuffle(){

        Collections.shuffle(this.cardDeck);

        return;

        
            
    }

    public boolean hasNext(){

        if( this.cardDeck.size() > 0){
            return true;
        }
        
        return false; 
    }

    public Card Draw() { 

        return this.cardDeck.remove(0); 
    }

    public void discard(Card input){

       this.cardDeck.add(input);
    }

    public void print() {
        for(Card card: this.cardDeck) {
            System.out.println(card);
        }
    }



  
    }

    
    


