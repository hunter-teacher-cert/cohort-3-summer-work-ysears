import java.io.*;
import java.util.*;

public class Queue{
    // Place private instance variables here
  private ArrayList<Integer> q;
  private int stub;

    // Place constructors here
  public Queue(){
    q= new ArrayList <Integer>();
    stub = -1;
  }
// Place methods here
  
//add value to the end of the queue
  public void enqueque (int value){
    stub++;
    q.add(0,value);
  }
  
//remove and return the top value from front of the queue
  public int dequeue(){
     if(stub == -1){
      return 0;
    }
    else{
    int val = q.get(stub);
    q.remove(stub);
    stub--;
    return val; 
    }
  }
  //return but do not remove the top value from the front of the queue
  public int front(){
    return q.get(stub);
  }

// return true of the queue is empty, false otherwise
  public boolean isEmpty(){
    if (stub == -1){
      return true;
    }
      return false;
  }

 //return the number of elements currently in the queue
  public int size(){
    return q.size();
  }

//return a string with all the data in the stack
  public String toString(){
    return q.toString();
  }
  
}

/*
Recall, a queue is a First In First Out structure.

You should implement the following methods

A constructor with no parameters
void enqueue(int value) - add value to the end of the queue
int dequeue() - remove and return the top value from front of the queue
int front() - return but do not remove the top value from the front of the queue
boolean isEmpty() - return true of the queue is empty, false otherwise
int size() - return the number of elements currently in the queue
boolean isFull() - returns true if the queue is full, false otherwise - only implement this if you use an array for implementation
toString() - return a string with all the data in the stack */