package loopingconditions;

import java.util.Scanner;

public class Methods {
	
	public static void main (String[] arg) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		
		int s = sc.nextInt(); 
		
		int ans=getaddition(s);
		System.out.println(ans);
	}

	public static int getaddition(int num) {
		// TODO Auto-generated method stub
		return num*num;
	}
	}
		
		