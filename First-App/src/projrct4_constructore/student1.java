package projrct4_constructore;

public class student1 {
	
	  private String ID;
	  private String name;
	  private Long Salary;
	
	public student1() {
		
		ID ="118A2093";
		name ="Satish kumar";
		Salary= 1L;
	}
	
	public student1(String i , String n , Long s) {
	
	ID =i;
	name =n;
	Salary= s;
}

		public void setId(String i)
	    {
	    	ID = i;
	    }
	
		
		 public void setname(String n)
		    {
		    	name  = n;
		    }
			
		
		 public void setsalary(Long s)
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
