package studentWork.Work;

import java.util.Arrays;

public class Calander {
public static void main(String[] args) {


    Calender();
}

public static void Calender() {

    String[] daysOfTheWeek = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    String[] months = new String[]{"January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    int[] daysInAMonth = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int date = 0;
    int weekday = 5;
    int a = 0;

    for(String month : months) {

         for(int i = 0; i < daysInAMonth[a]; i++) {

             String dayoftheweek = daysOfTheWeek[weekday];
                weekday++;
                date ++;
                if( weekday == 7) {
                    weekday = 0;
                }
                System.out.println("");  
                System.out.println( dayoftheweek + " " + month + " " + date);

                }
                a++;
                date = 0;

            }
            }
    }




