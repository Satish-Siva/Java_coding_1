package project1;

public class Student {
	
	// STUDENTS DATA REQUIRED

	public String firstname;
	public String lastname;
	public String email;
	public String age;

	// BEHAVIOUR

	public void display()
	{
	System.out.println("FIRST NAME :" +firstname);
	System.out.println("LAST NAME  :"  +lastname);
	System.out.println("EMAIL :" +email);
	System.out.println("AGE :" +age);

	}


	public static void main (String[] args) {

	Student S1= new Student();


	       S1.firstname="Sivaraman";
	S1.lastname="P";
	S1.email="satishprince1999@gmail.com";
	S1.age="22";
	S1.display();
	}
}

