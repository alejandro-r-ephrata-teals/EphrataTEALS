package studentWork.Unit2;

//This will import the scanner, we use this to have user interaction

import  java.util.Scanner;

//This main method will print the important lines of code :)

public class pokemonBattle {

    public static void main(String args[]) {

        Scanner console = new Scanner(System.in);

        //this part of the main will call battle start then continue telling you the next steps

        String Pokemon = battleStart();
        System.out.println("You Chose " + Pokemon + " !");
        System.out.println("It's a Pokemon Battle Between " + Pokemon + " Zebrstrika! GO!");
        int Hp = damage(Pokemon);

        //This line of code will simply show the Hp left

        System.out.println("Hp after damage, are now " + Hp + ".");

        //statsTable will take in the pokemon name, Hp left, and a string that has some learned moves as parameters

        statsTable(Pokemon, Hp, "Quick attack, Electric Blast, Tail wip, Thunderbolt");
        


    }

    //Exercise 1

    public static String battleStart() {

        Scanner console = new Scanner(System.in);

        //This here will Ask your pokemon name and will return the value

        System.out.println("Another Trainer Is Issuing A challange!");
        System.out.println("Zebstrika appeared");
        System.out.println("Which pokemon do you choose? ");
        System.out.println();
        String Pokemon = console.nextLine();
        return Pokemon;



    }

    //Exercise 2

    public static int damage(String pokemon) {

        Scanner console = new Scanner(System.in);

        //This will ask for your pokemons stats, and will then place all those stats into the modifier, experience, power, and damage

        System.out.println("Zebstrika used Thunderbolt! ");
        System.out.println("Trainer Whats is Your " + pokemon + "s" + " Stats? ");
        System.out.println();

        System.out.print("Level: ");
        int Level = console.nextInt();
        System.out.print("Attack: ");
        int Attack = console.nextInt();
        System.out.print("Defence: ");
        int Defence = console.nextInt();
        System.out.print("Base : ");
        int Base = console.nextInt();
        System.out.print("Hp: ");
        int Hp = console.nextInt();

        double modifier = ((Math.random() * 0.5 + 0.5));
        double experience = ((2 * Level + 10)/250);
        double power = ((Attack / Defence) * Base + 2);
        double damage = ((experience + power) * modifier);

        //This code here will turn the damage into an int since the instructions specificaly said to round the damage down

        int intDamage = (int) damage;

        System.out.println("The pokemon substained " + intDamage + " Damage.");

        Hp = Hp - intDamage;

        //This will create the hp left 
    
        return Hp;
    }

    //Exercise 3

    public static void statsTable(String pokemon, int stats, String learnedMoves) {

        //This here will print out the final results of your pokemons stats

        System.out.println("Name          " + pokemon);
        System.out.println("Level         90");
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println("Hp            " + stats);
        System.out.println("Attack        60");
        System.out.println("Defence       30");
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println("Moves Learned:   " + learnedMoves);







    }



    
}
