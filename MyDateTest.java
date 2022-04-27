public class MyDateTest { //setting public class

public static void main(String[] args) { //main method 

	MyDate myDate1 = new MyDate(); //constructor for new object MyDate
	System.out.println("The 1st Date converted is: " + myDate1 + " (Current Date)");//outprinting date to console

	MyDate myDate2 = new MyDate(34355555133101L); //setting myDate2 to new MyDate for time given
	System.out.println("The 2nd Date converted is: " + myDate2 + " (34355555133101L since 1/1/1970 midnight)");

	MyDate myDate3 = new MyDate(2011, 11, 11); //constructor for new object MyDate, setting (year, month, day)
	System.out.println("The 3rd Date converted is: " + myDate3 + " (12/11/2011)");

	MyDate myDate4 = new MyDate(); //constructor for MyDate4 
	myDate4.setDate(561555550000L); //getting the date using Gregorian Calendar from specified time
	System.out.println("The 4th Date converted is: " + myDate4 + " (561555550000L)"); //print to console
}
}
