package studentWork.Work;

import java.util.Scanner;  // Import the Scanner class
public class Work {
   public static void main(String[] args) {
       Scanner console = new Scanner(System.in);
       // Prompt for User Choice
       System.out.print("Choose Rock, Paper, or Scissors; To end enter Quit: ");
       String userChoice = console.next().toLowerCase();    
       double computerChoice = Math.random();
       String computerChoiceString = "";
 
       if (computerChoice < 0.34) {
           computerChoiceString = "rock";
       } else if(computerChoice <= 0.67) {
           computerChoiceString = "paper";
       } else {
           computerChoiceString = "scissors";
       }
       String winner = whoWon(userChoice,computerChoiceString);
	System.out.println(winner);     
   }
   public static String whoWon(String choice1, String choice2) {
       String x = "You chose: " + choice1 + " and the Computer chose: " + choice2;
	return x;
	}
}

