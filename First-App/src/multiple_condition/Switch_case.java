package multiple_condition;

import java.util.Scanner;

public class Switch_case {
	
	public static void main (String[] arg)  {  
		
		Scanner sc = new Scanner (System.in);
		
		String language;
		
		System.out.println("1.ENGLISH 2.HINDI 3.MARATHI 4.TAMIL 5.TELUGU");
		 
	    language = sc.next() ;
	
		switch (language) {
		
		case "1" :
		
		System.out.println("YOUR CHOSEN LANGUAGE IS ENGLISH");
		break;
		
		case "2" :
		
		System.out.println("YOUR CHOSEN LANGUAGE IS HINDI");
		 break;
		 
		case"3" :
		
		System.out.println("YOUR CHOSEN LANGUAGE IS MARATHI");
		break;
		
		case"4" :
		
		System.out.println("YOUR CHOSEN LANGUAGE IS TAMIL");
		break;
		
		case"5" :
		System.out.println("YOUR CHOSEN LANGUAGE IS TELUGU");
		break;
		}
		System.out.println();
		
	}
}
	



