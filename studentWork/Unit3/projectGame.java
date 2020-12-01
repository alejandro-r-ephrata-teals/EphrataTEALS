package studentWork.Unit3;

import  java.util.Scanner;

public class projectGame {

    public static void main(String args[]) {
        
        Scanner console = new Scanner(System.in);

        System.out.print("Hello, Player 1 what is your name? ");
        String player1 = console.nextLine();
        System.out.print("Hello, Player 2, what is your name? ");
        String player2 = console.nextLine();

        int points1 = 0;
        int points2 = 0;

        while (points1 < 10 || points2 < 10){
        System.out.print("Ok, player 1 please type \"!roll\" ");    //Must set a another variable == to the players rolls, then check every time to see if the previous roll was the same
        String roll1 = console.nextLine();
        int player1Roll = (int)(Math.random() * 6) + 1; 
        System.out.println(player1 + " rolled " + player1Roll);

        System.out.print("Ok, Player 2 please type \"!roll\" ");
        String roll2 = console.nextLine();
        int player2Roll = (int)(Math.random() * 6) + 1;
        System.out.println(player2 + " rolled " + player2Roll);
        

        if (roll1.equals("!roll") & roll2.equals("!roll")){

            
            if (player1Roll > player2Roll){

                points1 += 1;

                System.out.println(player1 + " Wins this round with a roll of " + player1Roll );
                System.out.println();
                System.out.println(player1 + " Now has " + points1 + " point(s)");

            } else if(player2Roll > player1Roll) {

                points2 += 1;

                System.out.println(player2 + " Wins this round with a roll of " + player2Roll );
                System.out.println();
                System.out.println(player2 + " Now has " + points2 + " point(s)");

            } else if (player1Roll == player2Roll) {

                points1 = (int)(Math.random() * 2) + 1 + points1;
                points2 = (int)(Math.random() * 2) + 1 + points2;

                System.out.println("You both tied!");
                System.out.println(player1 + " Has " + points1 + " Point(s)");
                System.out.println();
                System.out.println(player2 + " Has " + points2 + " Point(s)");


            }


        } else {
            System.out.println("You typed the wrong word, Try again");
        }
    } if (points1 > points2) {

        System.out.println(player1 + " Wins with a total of " + points1);

    } else if (points2 > points1) {

        System.out.println(player2 + " Wins with a total of " + points2);

    }else if (points1 == points2) {

        System.out.println("IT WAS A TIE!");

    }


    }


public static void intro() {
    System.out.println("Hello, welcome to, FIRST TO TEN, in this game");
    System.out.println("you will roll a dice by typing in \"!roll\", \nYour opponent will do the same \nWhoever rolls the biggest number receives 1 point ");
    System.out.println("If on the next roll you receive the same roll from the previous time \nYou will receive 2 points no matter what");
    System.out.println("First one to 10 points wins the game and becomes the king of luck :) \nHAVE FUN!");



}



}
