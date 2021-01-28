package studentWork.Work;

import java.util.Random;

import java.util.Scanner;

public class Work {
    
    
    public static void main(String args[]) {

        
        Scanner console = new Scanner(System.in);

        Random rand = new Random();

            // 1. Choose a spell from the list provided. Spell chosen: Magic Missle
    
            // 2. For your spell, calculate the damage range. For example, for a spell
            // that does 1d6 fire damage, the damage range is 1 to 6
            // Damage range: 1 to 4 + 1
    
            // 3. Use Random to calculate the damage for one casting of the spell.
             
            //int castSpell = rand.nextInt(4) + 2;
            //System.out.println("Your spell casted " + castSpell + " damage");

        
            // 4. Player's choice! Expand your program - be as creative as you'd like
            // and/or choose one of the following:
            
            boolean play = true;

            while (play == true) {

             
            System.out.print("Do you want to cast your spell? --> ");
            String castSpell = console.nextLine();

            if (castSpell.equals("yes")) {
                
            int dart1 = rand.nextInt(4) + 2;
            int dart2 = rand.nextInt(4) + 2;
            int dart3 = rand.nextInt(4) + 2;
            System.out.println("Now a dice will be rolled");
            int diceRoll = rand.nextInt(20) + 1;
            System.out.println("You rolled " + diceRoll);

            if (diceRoll >= 10){
                System.out.println("All three of your darts hit with a damage of " + (dart1 + dart2 + dart3));
            } else {
                System.out.println("Your spell did not hit!");
            }
            

            } else {
                System.out.println("Ok Fine!");
                play = false;
            }

      
            //      a. Implement the "Advanced" feature for your chosen spell
            //      b. Add print statements to tell a story featuring your spell
            //      c. In D&D, you roll a d20 to see if your spell hits its target.
            //         If you roll a 10 or higher, your spell hits! If not, it
            //         misses and no damage is dealt.
            //      d. Cast your spell multiple times (loop)
            //      e. Incorporate user interaction
        }
    }
        
        

    } 






 




   


  



  



