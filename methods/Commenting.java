  public int linearSearch(int value, ArrayList<Integer> data) {

    int foundIndex = -1;

    for (int i=0; i < data.size(); i++) {

      int element = data.get(i);

      if (element == value) {
        foundIndex = i;
        break;
        }
      }
    return foundIndex;
  }