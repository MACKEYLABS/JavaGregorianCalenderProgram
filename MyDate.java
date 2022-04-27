import java.util.GregorianCalendar; //importing GregorianCalendar subclass
public class MyDate {//setting public class to MyDAte
	
	private int year; //access modifier for seeting int year to private 
	private int month; //access modifier for seeting int month to private
	private int day; //access modifier for seeting int day to private
	public MyDate() { //setting MyDAte to public

		GregorianCalendar calculate = new GregorianCalendar(); //setting constructor for GregorianCalendar

		year = calculate.get(GregorianCalendar.YEAR); //setting year for Gregorian calendar package
		month = calculate.get(GregorianCalendar.MONTH); //setting month for Gregorian calendar package
		day = calculate.get(GregorianCalendar.DAY_OF_MONTH); //setting day of the month for Gregorian calendar package
		}
	public MyDate(long elapsedTime) { //using long type for elapsedTime to convert GregorianCalendar

		GregorianCalendar since = new GregorianCalendar(1970, 1, 1); // sets the date for Greghorian Calendar
		GregorianCalendar calculate = new GregorianCalendar(); //constructor for calculate - new GregorianCalendar
		calculate.setTimeInMillis(since.getTimeInMillis() + elapsedTime); //setting the calendar time

		year = calculate.get(GregorianCalendar.YEAR); //setting year to calculate from Gregorian Calendar
		month = calculate.get(GregorianCalendar.MONTH); //setting month to calculate from Gregorian Calendar
		day = calculate.get(GregorianCalendar.DAY_OF_MONTH); //setting day to calculate from Gregorian Calendar
		}
		public MyDate(int yy, int mm, int dd) { //calling method MyDate and defining mm, yy, dd in MyDate

			year = yy; //sets the format for year as yy
			month = mm;// sets the format for month as mm
			day = dd; // sets the format for day as dd
		}
		public int getYear() { //compiles  and defines int getYear

			return year; //returns the year back
		}
		public int getMonth() { //pulls the month and sets as int type

			return month; //returns the month 
		}
		public int getDay() { //pulls the day and sets as int type

			return day; //returns the day
		}
		public void setDate(long elapsedTime) { //setting the date using elaspsedTime

			GregorianCalendar calculate = new GregorianCalendar(); //calling GregorianCalendar
			calculate.setTimeInMillis(elapsedTime);

			year = calculate.get(GregorianCalendar.YEAR);
			month = calculate.get(GregorianCalendar.MONTH);
			day = calculate.get(GregorianCalendar.DAY_OF_MONTH);
		}
		public String toString() { //creating a string and setting is as theString

			String date = "";

			//all code below for if/else statement is setting the months with the calendar number
			if(month == 0) 
				date += "January";
			else if(month == 1) 
				date += "February";
			else if(month == 2)
				date += "March";
			else if(month == 3)
				date += "April";
			else if(month == 4)
				date += "May";
			else if(month == 5)
				date += "June";
			else if(month == 6)
				date += "July";
			else if(month == 7)
				date += "August";
			else if(month == 8)
				date += "September";
			else if(month == 9)
				date += "October";
			else if(month == 10)
				date += "November";
			else if(month == 11)
				date += "December";
			else //If the month comes back as invalid it will display below
				date += "This is a invalid Month, we are using a be 0-based calendar."; 
				date += " " + getDay();
				date += ", " + getYear();

			return date; //returns back the date
}
}
