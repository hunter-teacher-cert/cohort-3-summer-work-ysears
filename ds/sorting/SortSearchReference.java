import java.io.*;
import java.util.*;

/* 
   Search Project:
   1. Complete the linear search (BASIC)
  2. Complete the binary search (Intermediate)
  3. Complete the recursive version of binary search (Advanced)
*/

public class SortSearchReference{

    /* Sort project starts here */
    
    /* Instance Variables */
    private ArrayList<Integer> data;  // to store the data
    
    private Random r; 

    
    public SortSearchReference(){
	data = new ArrayList<Integer>();
	r = new Random();
	for (int i=0;i<15;i++){
	    data.add(r.nextInt(20));
	}
	
    }
    
    public SortSearchReference(int size){
	data = new ArrayList<Integer>();
	r = new Random();
	for (int i=0;i<size;i++){
	    data.add(r.nextInt(20));
	}
	
    }

    /* Convenience function to get data out of the ArrayList from the driver */
    public int get(int index){
	return this.data.get(index);
    }
    


    /*
      return the index of the smallest data idem from index start to the end
      of the ArrayList. If there are multiple of the smallest value,
      return any of them.
      
      Example, if the arraylist has:
      5,3,10,6,8
      if start was 2 (start at index 2, value 10) then it would return 3
      which is the index of the value 6 which is the index with the
      smallest value from start to end

      On the otherh and, if start was 0, then the method would
      return 1 since the value 3 is in index 1 and that is the smallest.
      
    */
    public int findSmallestIndex(int start){
	int smallIndex = start;
	int i;
	for (i=start;i<data.size();i++){
	    if (data.get(i) < data.get(smallIndex)){
		smallIndex = i;
	    }
	    
	}
	
	return smallIndex;
    }


    /**
       Implement the selection sort algorithm by sorting the ArrayList
       data in place.

       Algorithm:
       Loop a variable that represents the ArrayList index from
       0 to the end of the ArrayList.
         For each index, find the smallest from that Location
	 to the end of the array and swap it with that index.

	 
       

    */
    public void sort(){
	int i;
	int tmp;
	int smallIndex;
	for (i=0;i<data.size();i++){
	    smallIndex = findSmallestIndex(i);
	    tmp = data.get(smallIndex);
	    data.set(smallIndex,data.get(i));
	    data.set(i,tmp);
	}
	

    }



    /* Search project starts here */
    
    /**
       performs a linear search. Returns the index of the first occurence of
       value in the ArrayList data or -1 if not found.

       This works by starting at the first element and searching one element at a time 
       until either the element is found or you've looked at all the elements.

       This algorithm works on any ArrayList.

    */
    public int linearSearch(int value){
	int i = 0;
	for (i=0;i<data.size();i++){
	    if (data.get(i)==value)
		return i;
	}
	return -1;
	
    }
    
    /**
       Implement a binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */
    public int binarySearch(int value){

	// create assign variables  representing the high, low and middle indices
	int high, low, middle;

	high = data.size();
	low  = 0;
	
	// while we're not done:
	//   if the item is at data.get(middle), return middle
	//   otherwise, update high, low, and middle
	while (high >= low){
	    middle = (high+low)/2;

	    if (data.get(middle)==value){
		return middle;
	    } else if (data.get(middle) > value){
		high = middle - 1;
	    } else {

		low = middle + 1;
	    }
	    
		}
	
	return -1;
	    
    }
    
    /**
       Implement a RECURSIVE binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */

    public int binarySearchRecursive(int value, int lowIndex, int highIndex){
	if (lowIndex > highIndex)
	    return -1;
	
	int middle = (lowIndex + highIndex)/2;

	if (data.get(middle)==value){
	    return middle;
	} else if (data.get(middle) > value){
	    return binarySearchRecursive(value,lowIndex,middle-1);
	} else {
	    return binarySearchRecursive(value,middle+1,highIndex);
	}
	
	    
    }
    public int binarySearchRecursive(int value){
	return binarySearchRecursive(value,0,data.size());
    }
    
	
    public String toString(){
	return ""+data;
    };


    public void builtinSort(){
	Collections.sort(data);
	
    }
    

    
}
