package studentWork.CardLab;

import java.util.Arrays;

public class CardClient {

    public static void main (String[] args) {

        int[] values = {4, 5, 7};
        String[] suits = {"Hearts", "Spades"};

        Card queen = new Card (12, "dimonds");
        

        Card hearts = new Card(5, "hearts");
        

        Card ace = new Card(1, "Clubs");

        System.out.println(queen + ", " + hearts + ", " + ace);

        Deck a = new Deck(values, suits);
        System.out.println(a);
        
        
        
        
    }
    
}
