public class TestTheApp {

public static void main(String args[]) { //main method call

	//All output info below is for testing 
	Person person1 = new Person("Lindsay", "6018 Smithison Lane", 7041075, "manic@att.com"); 
	Student student1 = new Student("Josh", "3424 Easton Court", 7041275, "twinz22@gmail.com", 2);
	Employee employee1 = new Employee("Cami", "9231 Bay Hill Street", 5704133, "roblox4life@aol.com", "Office1", 60000);
	Faculty faculty1 = new Faculty("Dana", "1555 Trotem Lane", 6041336, "funtimes@gmail.com", "Office3", 10000, "09:00 - 13:00", "Teacher");
	Staff staff1 = new Staff("Thomas" , "8986 Oaken Cove Court" , 4041339, "bicycleclub4@aol.com", "Office2 " , 79000, "Substitute Teacher"); 
  
	//outputting strings created to console
	System.out.println(person1.toString());
	System.out.println(student1.toString());
	System.out.println(employee1.toString());
	System.out.println(faculty1.toString());
	System.out.println(staff1.toString()); 
}
}
