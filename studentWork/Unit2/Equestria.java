package studentWork.Unit2;

//Alejandro Ramirez

//Our main method will print all the neccessary statements

public class Equestria {
    public static void main(String[] args) {
        double diameter = 2.0;
        roadTrip(diameter);
        System.out.println("The distance from Baltimare (29,16) to Manehattan (34,8) " + distance(29, 16, 34, 8));
        System.out.println("The distance from Los Pegasus (6,19) to Neighagra Falls (22,7) " + distance(6, 19, 22, 7));
        System.out.println("The distance from Badlands (25,24) to Ponyvill (16,14) " + distance(25, 24, 16, 14));
        stopTour();
        System.out.println(" The total distance from Baltimare, to Los Pegasus to Badlands is " + totalTrip(29, 16, 6, 19, 25, 24));
        System.out.println("The shortest distance is " + shortestDistance(29, 16, 6, 19, 16, 14));


    }
        //EXERSISE 1

    public static double roadTrip(double diameter) {

        //creates a method for the diameter, it takes a parameter and multiplies it with Pi

        double circumferance = diameter * Math.PI;
        return circumferance;


    }
        //EXERSISE 2

    public static double distance(double x1, double y1, double x2, double y2) {

        //Takes in 4 parameters and creates the distance formula

            double output1 = (x2 - x1);
            double output2 = (y2 - y1);
            output1 = output1 * output1;
            output2 = output2 * output2;
            double output3 = output1 + output2;
            return Math.sqrt(output3);

    }
        //EXERSISE 3

    public static void stopTour()  {

        //this method is simply a print statement, for the distance between the 3 different cities

        System.out.println();
        System.out.println("The distance from Baltimare to Los Pegasus is " + distance(29, 16, 6, 19));
        System.out.println("The distance from Baltimare to Badlands is " + distance(29, 16, 25, 24));
        System.out.println("The distance from Los Pegasus to Badlands is " + distance(6, 19, 25, 24));
    }
        //EXERSISE 4
    
    public static double totalTrip(double x1, double y1, double x2, double y2, double x3, double y3) {

        //This method takes in 6 parameters since we want the total distance for all 3 places combined

        System.out.println();
        double trip1 = distance(x1, y1, x2, y2);
        double trip2 = distance(x2,y2, x3, y3);
        double trip3 = distance(x3, y3, x1, y1);

        return trip1 + trip2 + trip3;
    }

    //Extra Credit

    
    public static double shortestDistance(double x1, double y1, double x2, double y2, double x3, double y3) {

        //This method takes in 6 parameters, creates 2 distances, and checks which distance is the smallest number wise

        System.out.println();
        double pointAtoPointB = distance(x1, y1, x2, y2);
        double pointAtoPointC = distance(x1, y1, x3, y3);
        double shortest = Math.min(pointAtoPointB, pointAtoPointC);
        return shortest;


        


    }
}
