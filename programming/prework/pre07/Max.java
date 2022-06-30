import java.io.*;
import java.util.*;
//Exercise 4   Write a method called indexOfMax that takes an array of integers and returns the index of the largest element. Can you write this method using an enhanced for loop? Why or why not?
public class Max{
  public static void main(String[] args){
    int[]a ={2,4,6};
    System.out.println(indexofMax (a));
    }

  public static int indexofMax(int[]a) {
    int index = a[0];
    int maxnum = 0;
    for (int i = 0; i < a.length; i++) {
        if (a[i] > maxnum) {
          maxnum = a[i];
          }
        }
      return index;
    }
}