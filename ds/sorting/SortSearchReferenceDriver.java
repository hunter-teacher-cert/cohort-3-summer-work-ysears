import java.io.*;
import java.util.*;

public class SortSearchReferenceDriver {
    public static void main(String[] args) {


	int size = 1000;

	SortSearchReference ss = new SortSearchReference(size);

	
	
	// printing is really slow so we don't want
	// to print when testing time.
	// System.out.println(ss);
		
	long start,elapsed;
// this is the sort time
	start = System.currentTimeMillis();
	ss.sort();
  System.out.println (" Time that it took to sort the integers in the array list: ");

	// System.out.println(ss);
	elapsed = System.currentTimeMillis() - start;
	System.out.println("Size: " + size + " Time in ms: " + elapsed);

  //linearSearch time
    start = System.currentTimeMillis();
		System.out.println (" Time that it took to use a linear search: ");
      ss.linearSearch(ss.get(500));
      elapsed = System.currentTimeMillis() - start;
	System.out.println("Size: " + size + " Time in ms to search for 500th index: " + elapsed);



	      

    }
}