class sampleArray{
// static for global variables
  static int[] someData = new int[] {45, 23, 78, 99, 12};
  static int someDatasize = someData.length;

  public static void main(String[] args){
    printPartialArray(someData, someDataSize);
  }
//data is a parameter;int array --> comes from someData
  //precondition: Assumes array is filled
  public static void printArray(int[]data) {
    for(int i=0; i<data.length; i++){
      System.out.print(data[i] + " ") ;
    }
    System.out.println("");
  }
  //precondition: Assume array is partially filled.
  public static void printPartialArray(int[]data, int currSize) {
    for(int i=0; i<currSize; i++){
      System.out.print(data[i] + " ") ;
    }
    System.out.println("");
  }
}