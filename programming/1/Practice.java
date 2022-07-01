import java.io.*;
import java.util.*;

public class Practice{
  
  public static void main(String[] args){

  int MAX_SIZE = 1000;
  int theArray[] =new int[MAX_SIZE];
  int currSize = 0;
    
// Exercise 1
for (int i=0; i < currSize; i++ )
{ 
  System.out.print(theArray [i] +"");
} 
  System.out.println();


    
// Exercise 5 in slides
  int targetPosition;
    Scanner input= new Scanner(System.in);
    System.out.println("Enter the position of the number you want to delete ");
    targetPosition=input.nextInt();

    for (int i=targetPosition; i<currSize-1;i++) {
      theArray[i] = theArray[i+1];
    }
    currSize = currSize+1;
}



  
}