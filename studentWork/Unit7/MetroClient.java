package studentWork.Unit7;

import java.util.Scanner;

public class MetroClient {
    public static void main(String[] args) {

        
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the ticket Ofiice! How many rides? ");
        int NumberOfRides = scan.nextInt();

        System.out.println("I'm buying a " + NumberOfRides + " ride ticket.");
        MetroTicket ticket = new MetroTicket(NumberOfRides);


        while (ticket.hasRides()) {
            System.out.println(" . . . ");
            System.out.println("I'd like a ride on the metro!");
            System.out.println("Here's my ticket: " + ticket);
            
            System.out.println("<*** PUNCH ***>");
            ticket.punch();
        }

        System.out.println(" ~ ~ ~ ");
        System.out.println("I'm all out of rides!");
        System.out.println("Final ticket: " + ticket);
    }
}

