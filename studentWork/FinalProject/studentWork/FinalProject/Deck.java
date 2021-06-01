package studentWork.FinalProject; 

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

    public Deck(ArrayList<Card> cardDeck){

        this.cardDeck = cardDeck;
    }

    public Deck deal(int numberOfCards) {

        ArrayList<Card>newDeck = new ArrayList<Card>();

        for(int i = 0; numberOfCards > i; i++){
            Card remove = this.cardDeck.remove(0);
            newDeck.add(remove);
        }
        Deck finalDeck = new Deck(newDeck);

        return finalDeck;
    }

    public int size() {

        return this.cardDeck.size();
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
        int index = 1;
        for(Card card: this.cardDeck) {
            
            System.out.print("(" + index + ") " + card + "  " );

            index++;
        }
    }

    public Card Remove(int index) {
        return this.cardDeck.remove(index);
    }

    public Card get(int player1Card) {

        Card card = this.cardDeck.get(player1Card);
        
        return card;
    } 
}

    
    

    
    


