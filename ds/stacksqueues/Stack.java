import java.io.*;
import java.util.*;

//ArrayLists implemented here.
//A stack is a Last In First Out structure.

public class Stack{
  
// Place private instance variables here
  private ArrayList <Integer> s;
  private int top;
  
// Place constructors here
  public Stack (){
    s = new ArrayList<Integer>();
    top = -1; //list doesn't exist yet
  } // end of constructor

// Place methods here

  //add value to top of stack
  public void push (int value){
    top++;
    s.add(top, value);
} //end of push
  
//remove and return the top value from the stack
  public int pop(){
    if(top == -1){
      return 0;
    }
    else{
    int val = s.get(top);
    s.remove(top);
    top--;
    return val; 
    }
  } // end of pop

// return but do not remove the top value from the stack
  public int top(){
    return s.get(top);
  } // end of top

//return true of the stack if the stack is empty
// false otherwise
  public boolean isEmpty(){
    if (top == -1){
      return true;
    }
      return false;
  } // end of isEmpty

  
//return the number of elements currently in the stack
  public int size(){
    return s.size();
  } //end of size

//return a string with all the data in the stack
  public String toString(){
    return s.toString();
  } //end of toString
  
}



//ArrayList b/c you're adding and removing from the end. You also don't have to worry about the size; it's flexible.


