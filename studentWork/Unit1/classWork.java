package studentWork.Unit1;

    import java.util.Scanner;

    public class classWork {


    
    public static void main (String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Enter your test score ");
        double testscore1 = console.nextDouble();

        System.out.println("Enter your test score ");
        double testscore2 = console.nextDouble();
        console.close();

        System.out.println("The average score " + totalScore(testscore1, testscore2));
        
        

     
        

    }

    public static double totalScore(double testscore1, double testscore2) {

        return (testscore1 + testscore2)/2;

    }
        



}

