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

		
}
