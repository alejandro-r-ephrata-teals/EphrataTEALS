package studentWork.Unit8;

import java.util.Arrays;

public class Student {

    private String name;
    private int studentNumber;
    private String[] classSchedule = new String[8];

    public Student(String newName, int NewstudentNumber){

        name = newName;
        studentNumber = NewstudentNumber;
        Arrays.fill(classSchedule, "free");
    
    }

   public String getname() {
        return name;
   }

   public String[] getSchedule() {
       return classSchedule;
   }

   public void studentSchedule(String courseName, int periodNumber) {

    classSchedule[periodNumber] = courseName;
    System.out.println(name + " - " + studentNumber);
    for(int i = 0; i < classSchedule.length; i++) {
        System.out.println("Period " + i + " : " + classSchedule[i]);

    }

   }
    
}
