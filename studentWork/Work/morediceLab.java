package studentWork.Work;

import java.util.Random;

import java.util.Scanner;

public class morediceLab {
    

    public static void main(String args[]) {
        printIntro();
        Scanner console = new Scanner(System.in);
        
        int playerArmies = 0;
        int computerArmies = 0;

        Random random = new Random();

// Uncomment the following lines once you finish Part 1
        // 
        System.out.println("Enter minimum number of Armies and Press ENTER.");
        int minimum = console.nextInt();
        System.out.println("Enter maximum number of Armies and Press ENTER.");
        int maximum = console.nextInt();

        // Also modify single parameter calls to initializeArmies with multiple parameters
        // See Part 1: add more Armies 1 where you need to modify the initializeArmies method
        playerArmies = initializeArmies(random, minimum, maximum);
        computerArmies = initializeArmies(random, minimum, maximum);

        printArmies(playerArmies, computerArmies);

        String userChoice = "";
        while(!userChoice.equalsIgnoreCase("quit")){ //while loop fixed

        System.out.println("Press ENTER to roll the dice. To end enter Quit");
        userChoice = console.nextLine().toLowerCase();

        int playerDie = rollDie(random);
        int computerDie = 0;

        // Modify to work with multiple dice being rolled
        // Three roles for player
        // Two roles for computer

      for(int i = 1; i <= 3; i++){

      }    
      for(int i = 1; i <= 2; i++){
          
      }

        System.out.println("The player rolled:   " + playerDie);
        System.out.println("The computer rolled: " + computerDie);
        System.out.println();

        // Add code here to determine the winner according to Part 3
        // Part 3: determine winner
        // ...
        String winner = "";
        if (computerArmies > 0 && computerDie >= playerDie && playerArmies > 0){
            winner = "Computer Wins!";
            playerArmies = playerArmies - 1;
        } else if (playerArmies > 0 && playerDie > computerDie && computerArmies > 0){
            winner = "Player Wins";
            computerArmies = computerArmies -1;
        } else {
            System.out.println("Game Over! To end enter Quit");
        }

        System.out.println("The winner is:   " + winner);

        printArmies(playerArmies, computerArmies);

        } //end of While
    }

    public static void printIntro() {
        System.out.println("Welcome to the");
        System.out.println("DDD  III  CCC EEEE");
        System.out.println("D  D  I  C    E ");
        System.out.println("D  D  I  C    EEE ");
        System.out.println("D  D  I  C    E ");
        System.out.println("DDD  III  CCC EEEE");
        System.out.println();
        System.out.println("L      A    BBBB");
        System.out.println("L     A A   B   B");
        System.out.println("L    AAAAA  BBBB");
        System.out.println("L    A   A  B   B");
        System.out.println("LLLL A   A  BBBB");
        System.out.println();
    }

    public static void printArmies(int playerArmies, int computerArmies) {
        System.out.println("Player armies . . . . " + playerArmies);
        System.out.println("Computer armies . . . " + computerArmies);
        System.out.println();
    }

    // Part 1: add more Armies 1
    public static int initializeArmies(Random random, int min, int max) {
        // Generate random number between 5 to 10 

        //int armies = (int)(Math.random() * (max - min + 1)) + min;
        int armynum = random.nextInt(max - min + 1) + min;
        return armynum;
    }
    
    
    /*public static int initializeArmies2(Random random) {
        // Generate random number between 5 to 10 
        int min = 5;
        int max = 10;
        //int armies = (int)(Math.random() * (max - min + 1)) + min;
        int armynum = min + random.nextInt(max - min + 1);
        return armynum;
    } */
    

    public static int rollDie (Random random) {
        // Generate random number between 1 to 6 
        //int dicenum = (int)(Math.random() * (max - min + 1)) + min;
        int dicenum = random.nextInt(2) + 5;
        return dicenum;
    }

    /*
    public static int rollDie2 (Random random) {
        // Generate random number between 1 to 6 
        int min = 1;
        int max = 6;
        //int dicenum = (int)(Math.random() * (max - min + 1)) + min;
        int dicenum = min + random.nextInt(max - min + 1);
        return dicenum;
    }
    */
          
            
} 



