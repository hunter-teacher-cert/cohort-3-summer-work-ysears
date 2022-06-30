import java.io.*;
import java.util.*;

public class Array{
  public static void main(String[] args){
    double[] a = {0, 1, 2, 3};
    powArray (a,3);
    int[]scores = {};
    histogram(scores, 100);
  }


//Exercise 1.1 
  public static void powArray(double[] a, int power){
    double[] b = new double[a.length];
    for (int i = 0; i < a.length; i++) { 
      b[i] = Math.pow(a[i], power);
    }
    System.out.println(Arrays.toString(b)); 
  }
  //Exercise 1.2- still figuring this out
  public static void histogram(int[]scores, int counter){
    int[]counts = new int [counter];
    for (int score : scores) {
      counts[score]++;
      }
    System.out.println(Arrays.toString(counts));
    }
}