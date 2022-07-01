/**
 * ArrayPractice 
 * Yanique Sears
 * collaborators: Jessica Novillo, Marieke Thomas
 */

/**
   INSTRUCTIONS:
   This file contains stubs (empty methods) for the following methods:
   1. buildIncreasingArray
   2. buildRandomArray
   3. printArray
   4. arraySum
   5. firstOccurence
   6. isSorted
   7. findMaxValue
   8. countOdds
   9. flip
   The stubs will have comments describing what they should do
   Levels:
   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   Basic:
   Complete these methods:
   - buildRandomArray
   - printArray
   - arraySum
   - firstOccurence
   - findMaxValue
   Intermediate:
   Complete all the methods for basic and also
   - buildIncreasingArray
   - isSorted
   - countOdds
   Advanced:
   Complete all the methods
*/

import java.util.*;
import java.io.*;

/**
     Parameters:
     size - how large the array should be
     startValue - the value of the first element
     step - the interval to the next value
     Returns:
     a new array of integers
     Examples:
     buildIncreasingArray(5,3,2) will return an array
     with the values 3,5,7,9,11 (five values, starting with 3 with a step size of 2)
  */
public class ArrayPractice
{ public static int[] buildIncreasingArray( int size, int startValue, int step )
  {
    int[] data = new int[size];
    for (int i=0; i<size;i++){
    //i is the index of the array
      // go to that index and put in the value
      data[i] = startValue + i*step;
    }
    return data;
  }


  // buildRandomArray method
  public static int[] buildRandomArray(int size, int maxValue )
  {Random r = new Random();
    int[] data = new int[size];
    for (int i=0; i<size; i++) {
      data[i] = r.nextint(maxValue); // no +1 bc not including max value.
    }
    return data;
  }
 
  //printArray method
  public static void printArray(int[] data )
  { for(int i=0; i< data.length;i++){
      System.out.print(data[i] + " ");//prints each number with a space
    }
    System.out.println();
  }

  //firstOccurence
  public static int firstOccurence( int[] data, int value )
  {for (int i=0; i<data.length; i++){
      if (data[i] == value){
        return i; 
      }
    }
  }

  //arraySum
  public static int arraySum( int[] data )
  { int sum = 0;
    for (int i=0; i<data.length; i++){
      sum + = data[i]; //cycles through and adds the values together
  }
    return sum;
  }

  /**
     Parameters:
     data - an array of integers
     Returns:
     true if the array is sorted, false otherwise
     That is, if each element is < the element to its right
     then the array is sorted.
     An array with values 5,6,10,15 is sorted
     An array with values 5,6,10,13,15 is not
  */
  public static boolean isSorted( int[] data )
  {
    /* YOUR BRILLIANT CODE HERE */

    return true; // replace this

  }

  /**
     Parameters:
     data - an array of integers
     Returns:
     value of the largest element in the array
  */
  public static int findMaxValue( int[] data ) {
    int m = Integer.MIN_VALUE; 
  for(int i=0; i<data.length; i++){
    if data[i] > m{
      m = data[i]; // overwrites m with higher value found for each index.
    }
  }
    return m;
  }


  /**
     Parameters:
     data - an array of integers
     Returns:
     the number of odd elements in the array
     Ex: if data holds 5,6,7,8,9,10 then the return value
     will be 3 since three of the elements are odd.
  */
  public static int countOdds( int[] data ) {
    int count;

    /* YOUR BRILLIANT CODE HERE */

    // Note the % operator is the modulo (basically remainder) function
    // in java. Use to determine if an integer is odd.

    return count;
  }

  /**
     Parameters:
     data - an array of integers
     Returns:
     no return value since this is a void function -- but
     you will manipulate the values in the array parameter
     Postcondition:
     elements of the input array are in reverse order
     Example:
     If the input array contains 5,8,13,7,27,2
     After the routine, the array will contain 2,27,7,13,8,5
  */
  public static void flip( int[] data )
  {
    /* YOUR BRILLIANT CODE HERE */
  }


  public static void main( String[] args )
  {

    // remove the comments as you complete each routine
    // and add more lines as you add additional routines.

    int[] data = buildRandomArray(10, 20);
    int[] data2 = buildincreasingArray(10,5,3);
    printArray(data);
    printArray(data2);

    // add calls to show that the methods you write work.
  }
}