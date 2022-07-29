import java.io.*;
import java.util.*;

public class Driver{

    public static void main(String[] args) {
    Stack s = new Stack();
      System.out.println ("Is Stack Empty:" + s.isEmpty());
      //s.push(5);
      //s.push(15);
      //s.push(10);
      System.out.println ("Is Stack Empty: " + s.isEmpty());
      System.out.println(s);
      System.out.println("Stack Size: "+s.size());
      System.out.println("Top Value: "+ s.pop());
      System.out.println("After pop:"+ s);
      System.out.println("Stack Size Now: "+s.size());

	   Queue q = new Queue();
	    System.out.println ("Is Queue Empty:" + q.isEmpty());
      q.enqueque(5);
      q.enqueque(15);
      q.enqueque(10);
      System.out.println ("Is Queue Empty: " + q.isEmpty());
      System.out.println(q);
      System.out.println("Queue Size: "+q.size());
      System.out.println("Top Value: "+ q.dequeue());
      System.out.println("After dequeue: "+ q);
      System.out.println("Queue Size Now: "+q.size());

    }
}