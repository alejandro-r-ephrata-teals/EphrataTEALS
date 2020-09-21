package studentWork.Unit1;

//Alejandro Ramirez//

//This class will call out the directions stated below, which will spell out MISSISSIPI//

public class DrawMississippi {  

    public static void main(String[] args) { //In the main method it will call each static method followed by a blank(System.out.println();) line for spacing//
        
        M();                                 //This will call the static method "M()" and preform what ever it has inside, it will then proceed onto the next line in the main and continue
        System.out.println();
        I();
        System.out.println();
        S();
        System.out.println();
        S();
        System.out.println();
        I();
        System.out.println();
        S();
        System.out.println();
        S();
        System.out.println();
        I();
        System.out.println();
        P();
        System.out.println();
        P();
        System.out.println();
        I();


    }

    public static void M() {
        System.out.println("M     M");
        System.out.println("MM   MM");
        System.out.println("M M M M");
        System.out.println("M  M  M");
        System.out.println("M     M");
        System.out.println("M     M");
        System.out.println("M     M");
    }
    public static void I() {
        System.out.println("IIIII");
        System.out.println("  I  ");
        System.out.println("  I  ");
        System.out.println("  I  ");
        System.out.println("  I  ");
        System.out.println("  I  ");
        System.out.println("IIIII");
    }

    public static void S() {
        System.out.println(" SSSS ");
        System.out.println("S    S");
        System.out.println("S     ");
        System.out.println(" SSSS ");
        System.out.println("     S");
        System.out.println("S    S");
        System.out.println(" SSSS ");

    }

    public static void P() {
        System.out.println("PPPPPP ");
        System.out.println("P     P");
        System.out.println("P     P");
        System.out.println("PPPPPP ");
        System.out.println("P");
        System.out.println("P");
        System.out.println("P");
    }



}