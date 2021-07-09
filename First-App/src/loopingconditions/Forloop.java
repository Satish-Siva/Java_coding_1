package loopingconditions;

import java.util.Scanner;

public class Forloop {
	
	public static void main (String[] arg) {
	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number");
	 
	int s = sc.nextInt();
	
	for(int k=0;k<=10;k=k+1) {
		System.out.println(k*s);
	}
	
//	int k =0;
//	
//	while(k<=10) {
//		
//		System.out.println(k*s);
//		k=k+1;

//	int k =0;
//	do {
//		
//		System.out.println(k*s);
//		k=k+1;
//	}while(k<=10);
//	
 
	}
}

