package studentWork.FinalProject;

import java.util.Scanner;

import java.util.ArrayList;

public class gameClient {

    public static void main(String[] args){
        // Introduction/rules to the game
        intro();

        // This will prompt the user for their name 
        Scanner console = new Scanner(System.in);
        System.out.print("Player 1 what is your name --->  ");
        String player1name = console.nextLine();
        System.out.print("Player 2 what is your name --->  ");
        String player2name = console.nextLine();
        // These varibles will be used to count and keep track of the number of rounds and the value of the deck
        int decknumber = 0;
        int round = 0;
        // This will be the deck that will be dealt to the players and will also shuffle it
        Deck dealingDeck = new Deck();
        dealingDeck.shuffle();
        // Every player is dealt 3 cards each
        Deck player1 = dealingDeck.deal(3);
        Deck player2 = dealingDeck.deal(3);
        // The deck will always start at 0
        System.out.println();
        System.out.println("Start of the Deck --->  0" );
        System.out.println();

        // this loop will run until the decknumber reaches over 100
        while(decknumber <= 99){
            // This will print out the decks of each player
            printDeck(player1name, player1, player2name, player2);
            // This will prompt the user of the card index they want to use 
            System.out.print(player1name + " please type the position(index) of the card you want to place ---> ");
            int player1Card = console.nextInt();
            
            boolean check = true;
            // This loop will make sure that the user does not go futher onto the program if they select an incorrect index
            while (check == true) {

                if (player1Card > 3 || player1Card < 1) {
                    System.out.print("Error, Please type in Again (1, 2, 3) --> ");
                    player1Card = console.nextInt();
                    System.out.println();

                } else {
                    check = false;
                   
                }
            }
            // These if-statements will make sure that the card index they chose will now be put into the decknumber
            // The card they chose will also be discarded from the deck and they will have a random card from the deck be placed into theirs
            if(player1Card == 1) {

               Card card = player1.get(player1Card - 1);
               
               int cardnumber = card.getPoint();
                // If the card value is equal to 99 we dont want to add 99 to the deck but set decknumber to 99
               if(cardnumber == 99) {

                decknumber = cardnumber;
             } else {
                 
             decknumber = decknumber + cardnumber;
             }

                player1.Remove(player1Card - 1);
                Card newcard = dealingDeck.Remove(0);
                player1.discard(newcard);
    
            } else if (player1Card == 2) {

                Card card = player1.get(player1Card - 1);
                
                int cardnumber = card.getPoint();
 
                if(cardnumber == 99) {

                    decknumber = cardnumber;
                 } else {
                     
                 decknumber = decknumber + cardnumber;
                 }

                player1.Remove(player1Card - 1);
                Card newcard = dealingDeck.Remove(0);
                player1.discard(newcard);
    
            } else if (player1Card == 3) {

                Card card = player1.get(player1Card - 1);
               
                int cardnumber = card.getPoint();
 
                if(cardnumber == 99) {

                    decknumber = cardnumber;
                } else {
                     
                 decknumber = decknumber + cardnumber;
                }

                player1.Remove(player1Card - 1);
                Card newcard = dealingDeck.Remove(0);
                player1.discard(newcard);

          }
          // This will print out the current deck number
          System.out.println();
          System.out.println("░█▀▀▄ █▀▀ █▀▀ █─█");
          System.out.println("░█─░█ █▀▀ █   █▀▄  ---> " + decknumber);
          System.out.println("░█▄▄▀ ▀▀▀ ▀▀▀ ▀─▀");
          // If player 1 ends up getting over 99, this will break out of the while loop and announce the winner
            if (decknumber > 99) {
                printwinner(player1name, player2name);
           
                break;
            }
          // Hence from here is simply repeated code for player 2
          System.out.println();
          printDeck(player1name, player1, player2name, player2);

            System.out.print(player2name + " please type in the position(index) of the card you want to place ---> ");
            int player2Card = console.nextInt();

            check = true;

            while (check == true) {

                if (player1Card > 3 || player1Card < 1) {
                    System.out.print("Error, Please type in Again (1, 2, 3) --> ");
                    player1Card = console.nextInt();
                    System.out.println();

                } else {
                    check = false;
                
                }
            }

            if(player2Card == 1) {

                Card card = player2.get(player2Card-1);
               
                int cardnumber = card.getPoint();
 
                if(cardnumber == 99) {

                    decknumber = cardnumber;
                 } else {
                     
                 decknumber = decknumber + cardnumber;
                 }

                 player2.Remove(player2Card - 1);
                 Card newcard = dealingDeck.Remove(0);
                 player2.discard(newcard);

             } else if (player2Card == 2) {
 
                 Card card = player2.get(player2Card - 1);
                
                 int cardnumber = card.getPoint();
                 if(cardnumber == 99) {

                    decknumber = cardnumber;
                 } else {

                 decknumber = decknumber + cardnumber;
                 }
                 player2.Remove(player2Card - 1);
                 Card newcard = dealingDeck.Remove(0);
                 player2.discard(newcard);
     
             } else if (player2Card == 3) {
 
                 Card card = player2.get(player2Card - 1);

                 int cardnumber = card.getPoint();
  
                 if(cardnumber == 99) {

                    decknumber = cardnumber;
                 } else {
                     
                 decknumber = decknumber + cardnumber;
                 }

                 player2.Remove(player2Card - 1);
                 Card newcard = dealingDeck.Remove(0);
                 player2.discard(newcard);
  
           } 
           round++;
           System.out.println();
           System.out.println();
           System.out.println("░█▀▀▄ █▀▀ █▀▀ █─█");
           System.out.println("░█─░█ █▀▀ █   █▀▄  ---> " + decknumber);
           System.out.println("░█▄▄▀ ▀▀▀ ▀▀▀ ▀─▀");
           System.out.println();
           System.out.println("round " + round + " has been completed");
           System.out.println();

           if (decknumber > 99) {
           
            printwinner(player2name, player1name);
            
        }
                 
            }

        }

        public static void printDeck(String player1name, Deck player1, String player2name, Deck player2){
            System.out.print(player1name + "'s Deck --> ");
            player1.print();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.print(player2name + "'s Deck --> ");
            player2.print();
            System.out.println();
            System.out.println();
            System.out.println();
        }

        public static void printwinner(String option1, String option2) {
            System.out.println();
            System.out.println(option1);
            System.out.println();
            System.out.println("██╗░░░██╗░█████╗░██╗░░░██╗  ██╗░░░░░░█████╗░░██████╗████████  ██╗░░░░░░█████╗░░█████╗░░██████╗███████╗██████╗░");
            System.out.println("╚██╗░██╔╝██╔══██╗██║░░░██║  ██║░░░░░██╔══██╗██╔════╝╚══██╔══╝ ██║░░░░░██╔══██╗██╔══██╗██╔════╝██╔════╝██╔══██╗");
            System.out.println("░╚████╔╝░██║░░██║██║░░░██║  ██║░░░░░██║░░██║╚█████╗░░░░██║░░░ ██║░░░░░██║░░██║██║░░██║╚█████╗░█████╗░░██████╔╝");
            System.out.println("░░╚██╔╝░░██║░░██║██║░░░██║  ██║░░░░░██║░░██║░╚═══██╗░░░██║░░░ ██║░░░░░██║░░██║██║░░██║░╚═══██╗██╔══╝░░██╔══██");
            System.out.println("░░░██║░░░╚█████╔╝╚██████╔╝  ███████╗╚█████╔╝██████╔╝░░░██║░░░ ███████╗╚█████╔╝╚█████╔╝██████╔╝███████╗██║░░██║");
            System.out.println("░░░╚═╝░░░░╚════╝░░╚═════╝░  ╚══════╝░╚════╝░╚═════╝░░░░╚═╝░░░ ╚══════╝░╚════╝░░╚════╝░╚═════╝░╚══════╝╚═╝░░╚═╝");
            System.out.println();
            System.out.println(option2);
            System.out.println();
            System.out.println("██╗░░░██╗░█████╗░██╗░░░██╗  ░██╗░░░░░░░██╗██╗███╗░░██");
            System.out.println("╚██╗░██╔╝██╔══██╗██║░░░██║  ░██║░░██╗░░██║██║████╗░██║");
            System.out.println("░╚████╔╝░██║░░██║██║░░░██║  ░╚██╗████╗██╔╝██║██╔██╗██");
            System.out.println("░░╚██╔╝░░██║░░██║██║░░░██║  ░░████╔═████║░██║██║╚████║");
            System.out.println("░░░██║░░░╚█████╔╝╚██████╔╝  ░░╚██╔╝░╚██╔╝░██║██║░╚███");
            System.out.println("░░░╚═╝░░░░╚════╝░░╚═════╝░  ░░░╚═╝░░░╚═╝░░╚═╝╚═╝░░╚══╝");

        }

        public static void intro(){
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("                              ░██╗░░░░░░░██╗███████╗██╗░░░░░░█████╗░░█████╗░███╗░░░███╗███████╗  ████████╗░█████╗");
            System.out.println("                              ░██║░░██╗░░██║██╔════╝██║░░░░░██╔══██╗██╔══██╗████╗░████║██╔════╝  ╚══██╔══╝██╔══██╗");
            System.out.println("                              ░╚██╗████╗██╔╝█████╗░░██║░░░░░██║░░╚═╝██║░░██║██╔████╔██║█████╗░░  ░░░██║░░░██║░░██║");
            System.out.println("                              ░░████╔═████║░██╔══╝░░██║░░░░░██║░░██╗██║░░██║██║╚██╔╝██║██╔══╝░░  ░░░██║░░░██║░░██║");
            System.out.println("                              ░░╚██╔╝░╚██╔╝░███████╗███████╗╚█████╔╝╚█████╔╝██║░╚═╝░██║███████╗  ░░░██║░░░╚█████╔╝");
            System.out.println("                              ░░░╚═╝░░░╚═╝░░╚══════╝╚══════╝░╚════╝░░╚════╝░╚═╝░░░░░╚═╝╚══════╝  ░░░╚═╝░░░░╚════╝");
            System.out.println("");
            System.out.println("");
            System.out.println("");
           

            System.out.println("                                                    999999999          999999999");
            System.out.println("                                                   99:::::::::99      99:::::::::99   ");
            System.out.println("                                                  99:::::::::::::99  99:::::::::::::99");
            System.out.println("                                                  9::::::99999::::::99::::::99999::::::9");
            System.out.println("                                                  9:::::9     9:::::99:::::9     9:::::9");
            System.out.println("                                                  9:::::9     9:::::99:::::9     9:::::9");
            System.out.println("                                                   99::::::::::::::9  99::::::::::::::9");
            System.out.println("                                                     99999::::::::9     99999::::::::9");
            System.out.println("                                                          9::::::9           9::::::9  ");
            System.out.println("                                                         9::::::9           9::::::9");
            System.out.println("                                                        9::::::9           9::::::9");
            System.out.println("                                                       9::::::9           9::::::9");
            System.out.println("                                                      99999999           99999999");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();

            System.out.println("                                                ██████╗░██╗░░░██╗██╗░░░░░███████╗░██████╗");
            System.out.println("                                                ██╔══██╗██║░░░██║██║░░░░░██╔════╝██╔════╝");
            System.out.println("                                                ██████╔╝██║░░░██║██║░░░░░█████╗░░╚█████╗░");
            System.out.println("                                                ██╔══██╗██║░░░██║██║░░░░░██╔══╝░░░╚═══██╗");
            System.out.println("                                                ██║░░██║╚██████╔╝███████╗███████╗██████╔");
            System.out.println("                                                ╚═╝░░╚═╝░╚═════╝░╚══════╝╚══════╝╚═════╝░");
            System.out.println();
            System.out.println(" ____________________________________________________________________________________________________________________________________________________");
            System.out.println("|                                                                                                                                                    |");
            System.out.println("|    The Objective Of the game is to Keep the total at or less than 99                                                                               |");
            System.out.println("|    The point total starts at zero and each card adds its face value in points                                                                      |");
            System.out.println("|    Example: a 5 is worth five points,A face card is worth 10 points) except for certain cards that have special values or meanings:                |");
            System.out.println("|    A 4 subtracts 4 points from the total                                                                                                           |");
            System.out.println("|    A 9 is a pass (and does not change the total number of points)                                                                                  |");
            System.out.println("|    A 10 subtracts 10 points from the total                                                                                                         |");
            System.out.println("|    A King takes the point total to 99 (or keeps it 99 if the total is already 99)                                                                  |");
            System.out.println("|    An Ace adds either 1 or 11 points, announced by the player who plays it                                                                         |");
            System.out.println("|    After each card is played, the player announces the new total to the table and draws a replacement card                                         |");
            System.out.println("|    Each player must play a card without sending the total number of points higher than 99                                                          |");
            System.out.println("|    If a player cannot play a card that keeps the total at or less than 99, that player loses                                                       |");
            System.out.println("| ___________________________________________________________________________________________________________________________________________________|");
            System.out.println("");

        }
            
            
    }

    

    

