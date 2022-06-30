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
      Random rand = new Random();
    while(stones > 0 ){
        System.out.print("How many stones do you want to take first? 1-3 ");
      stonesTaken = input.nextInt();
      while (stonesTaken > 3){
        System.out.print("Pick 1-3 stones please!");
        stonesTaken = input.nextInt();
      }
      stones -= stonesTaken; 
    if (stones <= 0) {
        System.out.println ("Player wins");
      break;
    }
        System.out.println(stones + " Remaining");
    //Computer turn
        stonesTaken= rand.nextInt(3)+1;
      System.out.println( "The computer took "+ stonesTaken + " stones");
      if (stonesTaken>stones) {
        stonesTaken=stones;
      }
        stones -= stonesTaken;
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