package project2;

import project1.Student;

public class Employee {
	
	// EMPLOYEE INFORMATION
	
    private String ID;
    
    public void IDnumber(String i)
    {
    	ID = i;
    }
	
    private String name;
	
	 public void employename(String n)
	    {
	    	name  = n;
	    }
		
	private int Salary;
	
	 public void income(int s)
	    {
	    	Salary = s;
	    }
		
	 public void display()
		{
		System.out.println("ID :" +ID);
		System.out.println("NAME :"  +name);
		System.out.println("SALARY :" +Salary);
		}

		public static void main (String[] args) {

			Employee E1= new Employee();


			E1.ID="118A2093";
			E1.name="Satish kumar sivaraman";
			E1.Salary=123456;
		
			E1.display();
		}
}
