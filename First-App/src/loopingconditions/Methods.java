package loopingconditions;

import java.util.Scanner;

public class Methods {
	
	public static void main (String[] arg) {
		
		int num1,num2;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		
		int s = sc.nextInt(); 
		int w = sc.nextInt(); 
		
		int ans=getaddition(s,w);
		System.out.println(ans);
	}

	public static int getaddition( int num1,int num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}
	}
		
		