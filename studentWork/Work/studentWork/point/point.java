package studentWork.point;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class point{

  private int x;
  private int y;
  private int z;

  public point(int x, int y, int z){
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public int getx(){
    return this.x;
  }

  public int gety(){
    return this.y;
  }

  public int getz(){
    return this.z;
  }

  public String toString(){
    String s = "Distance --> " + this.x + ", "+ this.y + ", "+ this.z;
    return s;
  }

  public double distance(point p) {
    
    Double a = Math.sqrt(Math.pow(this.x - p.getx(), 2) + Math.pow(this.y - p.gety(), 2) + Math.pow(this.z - p.getz(), 2));
    return a;
  }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(4);
        list.add(1);
        list.add(9);
        order(list);


       
    } 
    public static void order(ArrayList<Integer> ArrayList) {

      int list =  Collections.min(ArrayList);
      int index = ArrayList.indexOf(list);
      ArrayList.remove(index);
      ArrayList.add(0, list);
      System.out.println(ArrayList.toString());
      
    }

}

