package logical_operation;

import java.util.Scanner;

public class Using_multipleconditions {
	
	public static void main(String arg[]) {

		Scanner sc = new Scanner (System.in);
		
	    int year ;
		
		System.out.println(" CHOOSE A YEAR ");
		
		year =sc.nextInt();
		
		if (year%4==0) 
		{
				
				System.out.println("THE YEAR U HAVE ENTERED IS LEAP YEAR");
		}
		else 
		{
		
			System.out.println("THE YEAR U HAVE ENTERED IS  NOT LEAP YEAR");
		}
		
		
	}

}
