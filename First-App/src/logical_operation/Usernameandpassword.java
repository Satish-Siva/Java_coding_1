package logical_operation;

import java.util.Scanner;

public class Usernameandpassword {
	

	public static void main (String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		String username, password ;
		
		System.out.println("ENTER USERNAME AND PASSWORD");
	
		username = sc.next() ;
		password = sc.next() ;
		
				
		if (username.isEmpty()&& password.isEmpty()) 
		{
		   System.out.println("NAME AND PASSWORD IS EMPTY , PLEASE FILL THE PROPER USERNAME TO LOGIN");
		}
		
		else 
		{
			System.out.println("LOGIN SUCSESSFULL");
		}
		
		
	}
}
