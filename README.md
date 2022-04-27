# JavaGregorianCalenderProgram

Convert Time in Java with Gregorian Calendar

Part I: (The Myate class) Design a class named MyDate. The class contains:
•	The data fields year, month, and day that represent a date. Month is 0-based, i.e., 0 is for January.
•	A no-arg constructor that creates a MyDate object for the current date.
•	A constructor that constructs a MyDate object with a specified elapsed time since midnight, January 1, 1970, in milliseconds.
•	A constructor hat constructs a MyDate object with the specified year, month, and day.
•	Three getter methods for the data fields, year, month, and day, respectively.
•	A method named setDate(long elapsedTime) that  sets a enw date for the object using the elapsed time.
•	Write a test program that creates two MyDate objects (using new MyDate() and new MyDate(34355555133101L) and displays their year, month, and day.

Part II: (The Person, Student, Employee, Faculty, and Staff classes) Design a class named Person and its two subclasses named Student and Employee.
Make Faculty and Staff subclasses of Employee. A person has a name,  address, phone number, and email address. A student has a class status (freshman, sophomore, junior, or senior). 
Define the status as a constant. An employee has an office, salary, and date hired. Use the MyDate class defined in Part I to create an object for date hired. 
A faculty member has office hours and a rank. A staff member has a title.  Override the toString metod in each class to display the class name and the person’s name. 

Part III: Write a test program that creates a Person, Student, Employee, Faculty, and Staff, and invokes their toString() methods.

