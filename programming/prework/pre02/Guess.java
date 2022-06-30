import java.util.Random;
import java.util.Scanner; 
public class Guess {
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        int myNumber = random.nextInt(100) + 1;
        int userguess,diffNum;
      Scanner input = new Scanner(System.in);
      
      System.out.print("I'm thinking of a number between 1 and 100(including both). Can you guess what it is? ");
      System.out.println ("Type a number:");
      userguess = input.nextInt(); 
     System.out.println("Your guess is: " + userguess);
      System.out.println("The number I was thinking of is: " + myNumber);
      
    // had this to find the difference but negative numbers were coming up. Searched up how to show the absolute value :)
      diffNum = Math.abs(myNumber - userguess); 
      System.out.println("You were off by: " + diffNum);
    }
}