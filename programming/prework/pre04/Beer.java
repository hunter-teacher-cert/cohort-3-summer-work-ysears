import java.io.*;
import java.util.*;

class Beer {
  public static void main (String [] args) {
    keyverse(3);
  }

  public static void keyverse(int num){
    if(num > 0) {
      System.out.println(num + " bottles of beer on the wall, ");
      System.out.println(num + " bottles of beer");
      System.out.println("ya' take one down, pass it around,");
      System.out.println((num-1) + " bottles of beer on the wall.");
      System.out.println("");
      keyverse(num-1);}
      else{
          System.out.println("No bottles of beer on the wall");
          System.out.println("No bottles of beer,");
          System.out.println("ya’ can’t take one down, ya’ can’t pass it around,");
          System.out.println("’cause there are no more bottles of beer on the wall!");
          
    }
}
}
    
  