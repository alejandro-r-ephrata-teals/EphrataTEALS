package studentWork.CardLab;

public class Card {

    private int cardValue;
    private String cardSuit;

    public Card(int cardValue, String cardSuit) {
        
        this.cardValue = cardValue;
        this.cardSuit = cardSuit;
    }

    public int getValue(){

        return this.cardValue;
    }

    public String getSuit(){
        
        return this.cardSuit;
    }
    public String toString() {

        if (this.cardValue == 11 ) {

            String j = "Jack of " + this.cardSuit;
            return j;

        } else if(this.cardValue == 12) {

            String q = "Queen of " + this.cardSuit;
            return q;

        } else if(this.cardValue == 13){

            String k = "King of " + this.cardSuit;
            return k;

        } else if(this.cardValue == 1){

            String a = "Ace of " + this.cardSuit;
            return a;
        }

        return this.cardValue + " of " + this.cardSuit;
    }


    
}
