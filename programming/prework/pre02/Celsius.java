import java.util.Scanner;

class Celsius{
public static void main (String args[]){
  double cel;
  double farenheit;
  final double conversion = (9.0/5.0);
  Scanner in = new Scanner (System.in);
// user input below
  System.out.print ("What is the degrees in Celsius? ");
  cel = in.nextInt();
  farenheit = conversion*cel + 32;
 
  System.out.print(cel + " C = ");
  System.out.println(farenheit + " F");
  




  
}
}