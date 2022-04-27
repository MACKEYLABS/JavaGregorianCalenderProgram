public class Employee extends Person { //setting subclass Employee of Person

	String office; //setting work hours
	int salary; //setting salary of employee
	public Employee(String name1, String address1, int phone, String email1, String office1, int salary1) { //setting Employee string 

		super( name1, address1, phone, email1 ); //setting constructor
		office = office1; //setting office to office1
		salary = salary1; //setting salary to salary1
		type = "Employee"; //setting type to "Employee"
	}
	public String toString() { //setting toString

		return (super.toString() + " Office: " + office + "Salary: " + salary); //output when called
}
}
public class Faculty extends Employee { //setting subclass of Employee

	String officehours; //hours at office
	String title; //setting string to title
	public Faculty(String name1, String address1, int phone,String email1,String office1, int salary1, String officehours1,String title1){

		super(name1,address1,phone,email1,office1,salary1); //setting constructor
		officehours = officehours1;  //setting officehours to officehours1
		title = title1; //setting title to title1
		type = "Faculty"; //setting faculty to type of person
	}
	public String toString() { //adding to toString

		return (super.toString() + " Office Hours: " + officehours + " Title: " + title); // will display when called
}
}
