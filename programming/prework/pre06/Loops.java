import java.io.*;
import java.util.*;

public class Loops{
  public static void main(String[] args){
    System.out.println(squareRoot(9));
    System.out.println(power(2.3,4));
    System.out.println(factorial (3));
  
  }
  
//Exercise 2
  public static double squareRoot(double a){
    double guess1 = a/2;
    double guess2 = ((guess1 + (a/guess1))/2);

    while(Math.abs(guess1-guess2)>0.0001){
      guess1 = guess2;
      guess2 = ((guess1 + (a/guess1))/2);
    }
    return guess2;
  }

//Exercise 3
  public static double power(double x, int n){
    double answer = x;
    for(int i=1; i<n;i++){
      answer = answer * x;
    }
    return answer;
  }


  //Exercise 4
  public static int factorial (int n){
    int answer = n;
    for(int i = 1; i<n; i++){
      answer = answer * i;
    }
    return answer;
  }
  
}
