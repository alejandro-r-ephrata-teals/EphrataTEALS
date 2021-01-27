package studentWork.Work;

import java.util.Scanner;

public class Work2 {
    
    public static void main( String args[]){

        Scanner console = new Scanner(System.in);
        System.out.println("Type a number(or -1 to stop: ");
        int input = console.nextInt();
        int maximum = input;
        int minimum = input;


        while (input != -1){
            
            System.out.println("Type a number (or -1 to stop): ");
            input = console.nextInt();
            
            if (maximum >= input){
                minimum = input;
                
            } 

            }
            System.out.println("The maximum is " + input);
            System.out.println("Minimum was" + minimum);
            System.out.println();


            
            }
            
        }


