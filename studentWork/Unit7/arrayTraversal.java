package studentWork.Unit7;

import java.util.Arrays;

public class arrayTraversal {

    public static void main(String[] args) {
        int[] list = {0, 0, 3};
        int[] list2 = {1, 9, 5};
        double[] list3 = {0.5, 1.5, 5.0};
        int[] list4 = {-1, -2, -5 , -6};

        int[] list5 = {1, 2, 3, 4, 5};
        int[] list6 = {1, 2, 3, 4, 5, 6};
       

        swapPairs(list6);
        

        divide2(list3);
        System.out.println(Arrays.toString(list3));

        int indexForPositive = indexofPositive(list4);
        System.out.println(indexForPositive);
        

        int oddResults = sumOdds(list2);
        System.out.println(oddResults);

        int result = countEvens(list);
        System.out.println(result);

        boolean check = allGreaterThan(list5, list6);
        System.out.println(check);

    }

    public static int countEvens(int[] list){
        int count = 0;
        for(int x : list) {
            if(x % 2 == 0) {
                count++;
            }
        }
        return count;

    }

    public static int sumOdds(int[] list){
        int sumOdd = 0;
        for(int x : list ) {
            if(x % 2 == 1) {
                sumOdd = sumOdd + x;
            }
        }
        return sumOdd;
    }

    public static void divide2(double[] list) {
        int x = 1;
        list[0] /= 2;
        for(int j = 0; j <= list[x] ; j++) {
            list[x] /= 2;
            if(x == list.length-1){
                x = 0;
            }
            x++;
           
            
        }
    }

    public static int indexofPositive(int[] list){

        for(int i = 0; i < list.length; i++) {

            if(list[i] > 0){

                return i;

            } 
  
        }

       return -1;    
    } 

    public static boolean allGreaterThan(int[] list1, int[] list2) {
        
        for(int i = 0; i < list1.length; i++){
            if(list1[i]!= list2[i]){
                return false;
            }
        }

    return true;
    }

    public static void swapPairs(int[] list){

        for(int i = 0; i < list.length; i = i + 2){
            int temp = list[i];
            list[i] = list[i + 1];
            list[i + 1] = temp;
            
        }
        System.out.println(Arrays.toString(list));
    }
    
}

    




    

