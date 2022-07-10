import java.io.*;
import java.util.*;


/**
 * Driver class for Time class  by Team LucidThinkeren
 * First Last
 * collaborators: First Last, First Last
 */

/**
   INSTRUCTIONS:

   This file contains the Driver starter code for our Time class.
   
   Add code in main to test all your methods
   
   Place this file in a folder named programming/5/Driver.java

*/


public class Driver {

    public static void main(String[] args) {

	//declare a var of appropriate type to assign an instance of Time to
	Time t;
  Time t2;

	//assign var the address of a newly-apportioned Time object
	t = new Time(9,30,15);
  t2 = new Time(5,29, 20);

      //Testing toString method
      System.out.println(t.toString());
      System.out.print(t.equals(t2));

      //.equals isn't functioning correctly
      
    }//end main()

}//end class