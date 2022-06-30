
//Precondition: someString does not begin with spaces. Words are separated by spaces.
int i =0
  while (someString.charAt(i)!=''){
  i++
  }


//Postcondition: someString in position i IS a space. Go through all the spaces after the first word
while(someString.charAt(i)==''){
  i++
}


//Postcondition:someString in position i IS NOT a space. Go through the second word character by character and display each charaacter.
while (someString.charAt(i)!= '')