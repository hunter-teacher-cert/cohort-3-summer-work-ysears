import java.io.*;
import java.util.*;

class Methods{
public static void main (String[] args){
  System.out.println(isDivisible(4,2));
  System.out.println(isTriangle(5,5,5));
}
//Exercise 2
public static boolean isDivisible (int n, int m ) {
  if (n%m == 0){
    return true;
  }
  return false;
}
  //Exercise 3
  public static boolean isTriangle(int a, int b, int c){
    if((a+b)<c || (a+c)<b || (b+c)<a){
      return false;
    }
    return true;
  }
}



