/**
 * SuperArray by Team 1
 * Yanique Sears
 * collaborators: Latoya Boland, Stephen Sabaugh, Yenmin Young 
 */

/**
   SKELETON
   SuperArray is a wrapper class for an array.
   Provides "pass-thru" accessibility to pre-existing array capabilities:
   - get/set by index
   - get length
   Adds functionality:
   - dynamic capacity
   - auto-grow capacity if necessary
*/

import java.io.*;
import java.util.*;

public class SuperArray
{
  //SUBGOAL:declare instance vars...and initialize?
  //instance vars
  private int[] data;           // "interior"/"underlying" data container
  private int numberElements;   // number of "meaningful" elements


  // ~~~~~~~~~~~~~~~ CONSTRUCTORS ~~~~~~~~~~~~~~~
  /*Basic constructor that:
      1. Creates a new array of size 10 and assign data to refer to it. 
      2. Sets the numberElements variable to 0.*/
  public SuperArray()
  {
    data = new int [10]; //init underlying/inner storage of capacity 10
    numberElements = 0; //init instance vars
  }

  /*Constructor that:
*     1. Creates a new array of size and assign data to refer to it. 
      2. Sets the numberElements variable to 0.*/
  public SuperArray( int size )
  {
    data = new int [size]; //init underlying/inner storage of specified capacity
    numberElements = 0; //init instance vars
  }

  // ~~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~
  public void add(int value )
  {//adds value to the end of the SuperArray (after the last added element)
  // test to see if we need to grow, then grow
  
    if (data.length <= numberElements){ // should change <= to = bc of narrowest condition
      grow();
    }
    data[numberElements] = value; // add item

    numberElements ++; // increment numberElements

  }//end add()


  public boolean isEmpty()
  { //return true if the SuperArray is empty, false otherwise.
    //return numberElements == 0;
    for(int i = 0;i < data.length;i++){
      if (data[i] != 0){
        return false;
      }
    } return true;
  }

  public int get(int index)
  {
    return data[index]; //return the value at location index 
  }

  public String toString()
  { // return a String version of SuperArray in human-readable format
    String arrayString = "";
    for (int i = 0; i < data.length; i++){
      arrayString = arrayString + Integer.toString(data[i]) + " ";
    }
    return arrayString;
  }


  // return Stringified version of this Object,
  // with extra debugging info
  // (helper method for debugging/development phase)
  public String debug()
  {
    String s = "";
    s = "Size: " + this.data.length;
    s = s + " LastItem: " + numberElements + "  Data: ";
    for (int i = 0; i < numberElements; i++) {
      s = s + data[i] + ", ";
    }
    s = s + "\n";
    return s;
  }//end debug()


  public void remove(int index)
  {
    // shift items down to remove the item at index
    /* Diagram by group!
      NumberElements = 4
      Goal: Remove index 1
      3 7 10 4 0 0 0

      Index 1 = index 2
      3 10 10 4 0 0 0

      Index 2 = index 3
      3 10 4 4 0 0 0

      Index 3 = 0
      3 10 4 0 0 0 0
    */

    /* 3 7 10 4
      Index = 1
      NumberElements = 4
      data.length = 4
      Goal: Remove index 1
      3 7 10 4
      Index 1 = index 2
      3 10 10 4
      Index 2 = index 3
      3 10 4 4
      Index 3 = 0
      3 10 4 0
    */
    
    for (int i = index; i < numberElements-1; i++){
        data[i] = data[i+1];
      }
    data[numberElements-1] = 0;
    
    // subtract fom numElements;
    numberElements --;
  }


  public void add(int index, int value)
  {
    /* Diagram by Yenmin!
      3 7 10 4 0 0 0
      NumberElements = 4
      Goal: Add to index 1 value 5
      3 7 10 4 0 0 0

      Index 4 = Index 3
      3 7 10 4 4 0 0

      Index 3 = Index 2
      3 7 10 10 4 0 0

      Index 2 = Index 1
      3 7 7 10 4 0 0

      Index 1 = value
      3 5 7 10 4 0 0
    */
    
    // see if there's enough room
    if (data.length<=numberElements){
      grow();
    }

    // shift elements toward the end of the array
    for (int i = numberElements; i > index; i--){
      data[i] = data[i-1];
    }

    data[index] = value;  // insert new element

    numberElements++;   // increment numElements
  }

  private void grow()
  { /*Enlarges the SuperArray. It should:
*      Create a new array, 5 units larger
*      Copy the old data to the new array
*      Set the data instance variable to point to the new array*/
    
    // create a new array with extra space
    // Q: How did you decide how much to increase capacity by? chose 1 at first!
    int newArray[] = new int [numberElements+1];

    // copy over all the elements from the old array to the new one
    for (int i = 0; i<data.length; i++){
      newArray[i] = data[i];
    }

    // point data to the new array
    data = newArray;
    
  }//end grow()

}//end class