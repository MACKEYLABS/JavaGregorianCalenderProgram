public class Person {

	String name; // setting name of the person
	String adress; //setting the address
	int phonenumber; //setting the phone number
	String email; //setting the email
	String type; //setting what year they are in
	
	public Person(String name1, String address1, int phone, String email1) { //setting Person class

		name = name1; //name is set to new name1
		adress = address1; //address is set to new address1
		phonenumber = phone; //phonenumber is set to new phone
		email = email1; //email is set to email1
		type = "Person"; //setting type to defined "Person" 
	}
	public String toString(){ //setting toString
	//code below will return toString methods in following format
		return ("Name: " + name + " Address: " + adress + " Phone #: " + phonenumber + " Email: " + email);
}
}
