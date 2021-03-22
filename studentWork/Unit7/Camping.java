package studentWork.Unit7;

import java.util.Arrays;

public class Camping {
       public static void main(String[] args) {
    
    // dogNames array here
    String[] dogNames = new String[]{"Baby" , "Harlow" , "Hudson"};


    
    // babyGrowls array here and call countBabyGrowls Method
        int[] babyGrowls = new int[43];
        int a = 0;
        babyGrowls[0] = 1;
        for(int i = 0; i <= 41; i++) {
            a++;
            babyGrowls[a] = 1;
        }
        int Growls = 0;
        for (int numberofGrowls: babyGrowls){
          if(numberofGrowls == 1) {
            Growls++;
          }
        }
        System.out.println(dogNames[0] + " Growled " + Growls + " times!" );

    // harlowNaps array here and call increaseNap Method as well as minHarlowNaps and maxHarlowNaps Methods
    double[] harolwNaps = new double[]{1.5, .75, 2.25, .5, 3, .25};



    
    // holdHudson array here and call sumHudsonHold Method
    int[] holdHudson = new int[]{2, 3, 1};

    // Println statements here

    int sumholds = sumHudsonHolds(holdHudson);
  
    System.out.println(dogNames[2] + " was held " + sumholds + " times!" );
    
    /* Should output
    Baby growled 43 times!
    Harlow napped Minimum: 0.5 Maximum: 3.25
    Hudson was held 6 times!
    */

    


  } //end of main method
  
  // countBabyGrowls static method here
  






  
  // increaseNap static method here
  public static double[] increaseNAP(double[] nap) {
    int a = 0;
    for(int i = 0; i < 5; i++){

      nap[a] += .25;
    }
    return nap;
  }

  
  // minHarlowNaps static method here     
  







  
  // maxHarlowNaps static method here    
  



  
  
  // sumHudsonHold static method here  
  public static int sumHudsonHolds(int[] dogNames) {
      int sum = 0;
      sum = dogNames[0] + dogNames[1] + dogNames[2];
    return sum;
  }





  
}
