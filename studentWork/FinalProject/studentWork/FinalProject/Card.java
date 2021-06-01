package studentWork.FinalProject;

import java.util.Scanner;

public class Card {

    Scanner console = new Scanner(System.in);

    private int cardValue;
    private String cardSuit;

    public Card(int cardValue, String cardSuit) {
        
        this.cardValue = cardValue;
        this.cardSuit = cardSuit;
    }

    public int getValue(){

        return this.cardValue;
    }

    public int getPoint() {
        
        if(this.cardValue == 11){

            return 11;

        } else if(this.cardValue == 12) {

            return 12;

        } else if(this.cardValue == 13){

            
            return 99;

        } else if(this.cardValue == 2){
            
            return 2;

        } else if(this.cardValue == 3){

            return 3;

        } else if(this.cardValue == 4) {

            return -4;

        } else if(this.cardValue == 5) {

            return 5;

        } else if(this.cardValue == 6){

            return 6;

        } else if(this.cardValue == 7){

            return 7;

        } else if(this.cardValue == 8){

            return 8;

        } else if(this.cardValue == 9) {

            return 0;

        } else if(this.cardValue == 10){

            return -10;
        } else if(this.cardValue == 1) { 

            System.out.println("You are playing an Ace, do you want to pick 1 or 11");
            int playerDecision = console.nextInt();

            if(playerDecision == 1){
                return 1;
            } else{
                return 11;
            }
        } 
        return 0;
        }


    public String getSuit(){
        
        return this.cardSuit;
    }
    public String toString() {
        
        if(this.cardValue == 2) {

            String A = this.cardValue + " of " + this.cardSuit + " (will add 2 to the Deck)";
            return A;
        }
         else if(this.cardValue == 3){

            String A = this.cardValue + " of " + this.cardSuit + " (will add 2 to the Deck)";
            return A;
        }
        else if (this.cardValue == 4) {

            String A = this.cardValue + " of " + this.cardSuit + " (will sutract 4 from the Deck)";
            return A;
        }
        else if (this.cardValue == 5) {

            String A = this.cardValue + " of " + this.cardSuit + " (Will add 5 to the Deck)";
            return A;
        }
        else if (this.cardValue == 6) {

            String A = this.cardValue + " of " + this.cardSuit + " (Will add 6 to the Deck)";
            return A;
        }
        else if (this.cardValue == 7) {

            String A = this.cardValue + " of " + this.cardSuit + " (Will add 7 to the Deck)";
            return A;
        }
        else if (this.cardValue == 8) {

            String A = this.cardValue + " of " + this.cardSuit + " (Will add 8 to the Deck)";
            return A;
        }
        else if (this.cardValue == 9) {
            
            String A = this.cardValue + " of " + this.cardSuit + " (Skips your turn)";
            return A;

        }
        else if (this.cardValue == 10) {

            String A = this.cardValue + " of " + this.cardSuit + " (subtracts 10 froem the Deck)";
            return A;
        }

        else if (this.cardValue == 11 ) {

            String j = "Jack of " + this.cardSuit + (" (Will add 11 to the Deck)");
            return j;

        } else if(this.cardValue == 12) {

            String q = "Queen of " + this.cardSuit + " (will add 12 to the Deck)";
            return q;

        } else if(this.cardValue == 13){

            String k = "King of " + this.cardSuit + " (Will take the Deck to 99)";
            return k;

        } else if(this.cardValue == 1){

            String a = "Ace of " + this.cardSuit;
            return a;
        }

        return this.cardValue + " of " + this.cardSuit;
    }


    
}
