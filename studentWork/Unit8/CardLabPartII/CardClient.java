package studentWork.Unit8.CardLabPartII;

import java.util.Arrays;


public class CardClient {

    public static void main (String[] args) {

        int[] values = {4, 5, 6};
        String[] suits = {"Hearts", "Spades"};

        Card queen = new Card (12, "dimonds");
        

        Card hearts = new Card(5, "hearts");
        

        Card ace = new Card(1, "Clubs");

        System.out.println(queen + ", " + hearts + ", " + ace);

        Deck a = new Deck(values, suits);

        a.shuffle();

        a.print();

        System.out.println(a);

        Deck b = new Deck();

        b.shuffle();

        System.out.println(b);

        Card firstCard = b.Draw();

        Card secondCard = b.Draw();

        
        System.out.println(firstCard + " is the top card, and " + secondCard + " is the second card");

        int first = firstCard.getValue();

        int second = secondCard.getValue();

        if(first > second) {

          System.out.println(firstCard + " has a higher value");
          
        } else {

          System.out.println(secondCard + " has a higher value");
        }

        discard(secondCard);

        

        

       

        
        
        
        
    }

    

    
    
}
