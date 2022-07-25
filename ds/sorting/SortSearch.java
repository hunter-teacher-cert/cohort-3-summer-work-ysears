import java.io.*;
import java.util.*;

/*

Sort Project:

Part 1:  (BASIC)
  1. Analyze the two constructors - try to figure out how they work. DONE
  2. Compile and run the program (SortProjectDriver.java and SortProject.java) and confirm 
  the behavior of the constructors. DONE

  Part 2: (BASIC)
  1. Read the description of findSmallestIndex and complete the method. DONE
  2. Uncomment the lines in SortProjectDriver to test. DONE

  Part 3: (INTERMEDIATE)
  1. Complete the sort method - read comments for description DONE
  2. Uncomment the lines in sortProjectDriver to test. DONE



Search Project:
  1. Complete the linear search (BASIC) DONE
  2. Complete the binary search (Intermediate)
  3. Complete the recursive version of binary search (Advanced)
*/

public class SortSearch{

    /* Sort project starts here */
    
    /* Instance Variables */
    private ArrayList<Integer> data;  // to store the data
    
    private Random r; 

    
    // public SortSearch(){ //constructor that makes array list of integers
    // 	data = new ArrayList<Integer>(); //creates new list called data
    // 	r = new Random(); //creates (instantiates) new random object r
    // 	for (int i=0;i<15;i++){ //loops through array list indexes 0-14
    // 	    data.add(r.nextInt(20)); // does not including 20!
    // 	}
	
    // }
//Put this is to have a static array to test binary search
     public SortSearch(){
       data = new ArrayList<Integer>( Arrays.asList(new Integer[] { 0,1,2,3,4,5,6,7,8,9,10 } ) );
	
    }   
  
    public SortSearch(int size){ // makes an array list of a given size
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
      if (start < 0 || start > data.size() - 1){
        System.out.println("YO CHECK YOUR NUMBERS");// tells user that there's an error in their parameter (less than 0 or bigger than array)
        return -1;
      } else {
        int smallIndex = start;
      
        for (int i=start; i<data.size(); i++){ // loops through array, beginning at start parameter
          if (data.get(i) < data.get(smallIndex)){//if value at the index being checked is smaller than the current index, smallIndex is updated
            smallIndex = i;
          }
        }
      	return smallIndex;
      }
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
      int smallestIndex;
      for (int i=0; i<data.size();i++){
        smallestIndex = findSmallestIndex(i); //find smallest index starting at 0
        int temp = data.get(i); // temp variable holds the smallest index while traversing through
        data.set(i, data.get(smallestIndex)); //set index to traversed data from start
        data.set(smallestIndex, temp); //temp is updated  
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
	    for(int i=0; i<data.size(); i++){ //traverses array
        if (data.get(i) == value){ //if current index is equal to parameter, return it
          return i;
        }
      }	
	    return -1; // else if not found, return -1
    }
    
    /**
       Implement a binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */
    public int binarySearch(int value){

	// create assign variables  representing the high, low and middle indices 
	// while we're not done:
	//   if the item is at data.get(middle), return middle
	//   otherwise, update high, low, and middle

      int lowIndex = 0;
      int highIndex = data.size() - 1;
      int middleIndex = data.size()/ 2;//-1 one here?

      while (lowIndex <= highIndex){ 

        if (value == data.get(middleIndex)){
          return middleIndex;
        } else if (value > data.get(middleIndex)) {
          lowIndex = middleIndex + 1;
          middleIndex = (highIndex + lowIndex) / 2;
        	}else if (value < data.get(middleIndex)) {
          	highIndex = middleIndex - 1;
          	middleIndex = (highIndex + lowIndex) / 2;
        }
        // to test
        System.out.println("index" + lowIndex + " " + middleIndex + " " + highIndex);
      }
	    return -1;
	    
    }
    
    /**
       Implement a RECURSIVE binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */

    public int binarySearchRecursive(int value, int lowIndex, int highIndex){

	// refer to class discussion
	
	return 0;
	    
    }
    
	
    public String toString(){
	return ""+data;
    };


    public void builtinSort(){
	Collections.sort(data);
	
    }

   /* Merge Sort Stuff after here */
    /**
       Builds and returns an ArrayList that's already in increasing order.

       You can use this method to test your merge method.

    */
    public ArrayList<Integer> buildIncreasingList(int size){
	ArrayList<Integer>  newlist = new ArrayList<Integer>();
	Random r = new Random();
	int nextval = r.nextInt(20)+1;
	for (int i=0;i<size;i++){
	    newlist.add(nextval);
	    nextval = nextval + r.nextInt(20);
	}

	return newlist;
	}

    /**
       this routine should create and return a new ArrayList of
       integers and fill it by merging list1 and list2 into the new
       list.

       list1 and list2 are already sorted in increasing order.

       Example:
       If list1 contains [1,5,17,25]
       and list2 contains [3,6,10,30,40,50]

       The new list will contain:
       [1, 3, 5, 6, 10, 17, 25, 30, 40, 50]

       
    */
       // lists are already sorted, make another list by merging least to greatest
    public ArrayList<Integer> merge(ArrayList<Integer> list1,
				    ArrayList<Integer> list2){
      ArrayList<Integer> mergedList = new ArrayList<Integer>(list1.size() + list2.size());
      //compare list 1 and 2, make a temp array list to compare elem. 1 in each list, put the lower value in the new list
      int i = 0;
      int j = 0;
      while (i < list1.size() || j < list2.size()){
      if (i >= list1.size()){
        mergedList.add(list2.get(j));
        j++;
      } else if (j >= list2.size()){
        mergedList.add(list1.get(i));
        i++;        
      } else if (list1.get(i) < list2.get(j)){
        mergedList.add(list1.get(i));
        i++;
      } else {
        mergedList.add(list2.get(j));
        j++;
      }
    }
      /* while (i < list1.size() && j < list2.size()) {
        if(list1.get(i) < list2.get(j)){
          mergedList.add(list1.get(i));
          i++;
        }
        else {mergedList.add(list2.get(j));
          j++;
             }
        return mergedList;*/
      


}



    

