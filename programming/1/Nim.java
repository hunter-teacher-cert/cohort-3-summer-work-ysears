/**
 * Game of Nim by Team Room 1
 * Yanique Sears
 * collaborators: Seth Adams, William LaMorie, Christoper DeSilva, Latoya Boland
 */

import java.io.*;
import java.util.*;

public class Nim
{
public static void main(String [] args) 
  {
    int stones = 12;
    int stonesTaken;

    Scanner input = new Scanner(System.in);
      Random rand = new Random(); //random number for AI
    while(stones > 0 ){
        System.out.print("How many stones do you want to take first? 1-3 ");
      stonesTaken = input.nextInt(); //user's answer stored here
      while (stonesTaken > 3){
        System.out.print("Pick 1-3 stones please!");
        stonesTaken = input.nextInt();
      }
      stones -= stonesTaken; // calculates # of stones remaining
    if (stones <= 0) {
        System.out.println ("Player wins");
      break;
    }
        System.out.println(stones + " Remaining"); //will print # of stones remaining
      
    //Computer turn
        stonesTaken= rand.nextInt(3)+1; //+1 accounts for #3
      System.out.println( "The computer took "+ stonesTaken + " stones");
      if (stonesTaken>stones) {
        stonesTaken=stones; //if there are more stones taken than are left, the # will be set equal to whatever is left
      }
        stones -= stonesTaken; // will calculate stones remaining
        if(stones <=0) {
        System.out.println("Computer wins");
          break;
      }
        System.out.println(stones + " Remaining");


      
      // prompt user input (user turn)

      // calculate number of stone remaining, print

      //check for win

      //machine turn

      // calculate number of stone remaining, print

      //check win
      
    }
  
  }
  
}