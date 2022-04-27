public class Staff extends Employee { //extending Employee with public class Staff

	String title; //setting String title

	public Staff(String name1, String address1, int phone, String email1, String office1, int salary1, String title1){ 


	super (name1,address1,phone,email1,office1,salary1); //creating constructor
	title = title1; //setting title to title1
	type = "Faculty"; //setting type to "Faculty"
	} 
	public String toString() { //setting String to toString
	
	return (super.toString() + " Title: " + title); //returning constructor toString
	}
	}
