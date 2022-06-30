class Time {
public static void main (String [] args){

int hour, minute, second, totalminutes, totalseconds;
hour = 11;
minute = 24;
second = 32;

totalminutes = (hour * 60 + minute);
totalseconds = (totalminutes * 60 + second);

System.out.print("Number of seconds since midnight: ");
System.out.println(totalseconds);

System.out.print("Percent of the day that has passed: ");
System.out.println(totalseconds * 100 /86400);

int hour2, minute2,second2;
hour2 = 13;
minute2 = 30;
second2 = 50;

System.out.print("Time elapsed since beginning exercise: ");
System.out.print(hour2-hour + " hours ");
System.out.print(minute2-minute + " minutes ");
System.out.println(second2-second + " seconds");

  
}


  
}