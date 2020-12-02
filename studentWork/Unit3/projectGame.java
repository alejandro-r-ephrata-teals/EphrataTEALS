
package studentWork.Unit3;

import  java.util.Scanner;

public class projectGame {

    public static void main(String args[]) {
        
        Scanner console = new Scanner(System.in);

        intro1();
        intro2();

        System.out.print("Hello, Player 1 what is your name? ");
        String player1 = console.nextLine();
        System.out.print("Hello, Player 2, what is your name? ");
        String player2 = console.nextLine();

        int points1 = 0;
        int points2 = 0;

        int player1Roll = 0;
        int player2Roll = 0;

        int checkSameRoll1 = player1Roll;
        int checkSameRoll2 = player2Roll;
    

        while (points1 < 10 || points2 < 10){

        System.out.print( player1 + " please type \"!roll\" ");    //Must set a another variable == to the players rolls, then check every time to see if the previous roll was the same
        String roll1 = console.nextLine();
        player1Roll = (int)(Math.random() * 6) + 1; 
        System.out.println();
        System.out.println(player1 + " rolled " + player1Roll);

        System.out.print(player2 + " please type \"!roll\" ");
        String roll2 = console.nextLine();
        player2Roll = (int)(Math.random() * 6) + 1;
        System.out.println();
        System.out.println(player2 + " rolled " + player2Roll);
        System.out.println();

        char initialsOfPlayer1 = player1.charAt(0);
        char initialsOfPlayer2 = player2.charAt(0);

        if (roll1.equals("!roll") & roll2.equals("!roll")){


            
            if (player1Roll > player2Roll){

                points1 += 1;
                System.out.println(player1 + " Wins this round" );
                System.out.println();
                System.out.println("  " + initialsOfPlayer1 + "   " + initialsOfPlayer2);
                System.out.println("---------");
                System.out.println("| " + points1 + " | " + points2 + " |" );
                System.out.println("---------");

            } else if(player2Roll > player1Roll) {

                points2 += 1;

                System.out.println(player1 + " Wins this round" );
                System.out.println();
                System.out.println("  " + initialsOfPlayer1 + "   " + initialsOfPlayer2);
                System.out.println("---------");
                System.out.println("| " + points1 + " | " + points2 + " |" );
                System.out.println("---------");

            } else if (player1Roll == player2Roll) {

                points1 = (int)(Math.random() * 2) + 1;
                points2 = (int)(Math.random() *2) + 1;

                System.out.println("You both tied!");
                System.out.println();
                System.out.println(player1 + " Wins this round" );
                System.out.println();
                System.out.println("  " + initialsOfPlayer1 + "   " + initialsOfPlayer2);
                System.out.println("---------");
                System.out.println("| " + points1 + " | " + points2 + " |" );
                System.out.println("---------");

            }

            if (player1Roll == checkSameRoll1 ){

                points1 -= 1;
                System.out.println( player1 + " You had the same roll twice, therefore you loose 1 point Haha :)" + " You now have " + points1 + " point(s)");

            } else if (player2Roll == checkSameRoll2) {

                points2 -=1;
                System.out.println( player2 + " You had the same roll twice, therefore you loose 1 point Haha :)" + " You now have " + points2 + " point(s)");

            }

            checkSameRoll1 = player1Roll;
            checkSameRoll2 = player2Roll;


        } else {
            System.out.println("You typed the wrong word, Try again");
        }
    }

        if (points1 > points2) {

            System.out.println(player1 + " Wins with a total of " + points1);
            System.out.println();
            System.out.println("█   █  ███  █   █ █   █ █████ █   █ ");
            System.out.println(" █ █  █   █ █   █ █   █   █   ██  █ ");
            System.out.println("  █   █   █ █   █ █ █ █   █   █ █ █ ");
            System.out.println("  █   █   █ █   █ ██ ██   █   █  ██ ");
            System.out.println("  █    ███  █████ █   █ █████ █   █ ");


        } else if (points2 > points1) {

            System.out.println(player2 + " Wins with a total of " + points2);
            System.out.println();
            System.out.println("█   █  ███  █   █   █   █ █████ █   █ ");
            System.out.println(" █ █  █   █ █   █   █   █   █   ██  █ ");
            System.out.println("  █   █   █ █   █   █ █ █   █   █ █ █ ");
            System.out.println("  █   █   █ █   █   ██ ██   █   █  ██ ");
            System.out.println("  █    ███  █████   █   █ █████ █   █ ");

        } else if (points1 == points2) {

            System.out.println("IT WAS A TIE!");
            System.out.println();
            System.out.println("█████ █████    █   █  ███  █████     ███     █████ █████ █████ ");
            System.out.println("  █     █      █   █ █   █ █        █   █      █     █   █     ");
            System.out.println("  █     █      █ █ █ █████ █████    █████      █     █   ████  ");
            System.out.println("  █     █      ██ ██ █   █     █    █   █      █     █   █     ");
            System.out.println("█████   █      █   █ █   █ █████    █   █      █   █████ █████ ");

        } 

    }

public static void intro2() {

    System.out.println("");
    System.out.println("▀█▀ █▄ █ █▀▀ ▀█▀ █▀█ █ █ █▀▀ ▀█▀ ▀█▀ █▀█ █▄ █ █▀▀");
    System.out.println("▄█▄ █ ▀█ ▄██  █  █▀▄ █▄█ █▄▄  █  ▄█▄ █▄█ █ ▀█ ▄██ ");
    System.out.println("");
    System.out.println("Hello, welcome to, FIRST TO TEN, in this game");
    System.out.println("you will roll a dice by typing in \"!roll\", \nYour opponent will do the same \nWhoever rolls the biggest number receives 1 point ");
    System.out.println("If on the next roll you receive the same roll from the previous time \nYou will receive 2 points no matter what");
    System.out.println("First one to 10 points wins the game and becomes the king of luck :) \nHAVE FUN!");
    System.out.println();



}
public static void intro1() {

    System.out.println("____________________________________________________________________________");
    System.out.println("                              Welcome to The                                ");
    System.out.println();
    System.out.println("             ████  █████  ████ █████     ████  ███  █   █ █████  ");
    System.out.println("             █   █   █   █     █        █     █   █ ██ ██ █     ");
    System.out.println("             █   █   █   █     ████     █  ██ █████ █ █ █ ████  ");
    System.out.println("             █   █   █   █     █        █   █ █   █ █   █ █     ");
    System.out.println("             ████  █████  ████ █████     ███  █   █ █   █ █████ ");
    System.out.println("____________________________________________________________________________");
      

}



}





