package multipleif;

public class Assigment {
	
	public static void main (String[] arg) {
		
		int unit;
		unit = 675;
		
		if(unit>0 && unit<100)
		{
			System.out.println("The charge of this is 3.44 per Unit");
		}
		if(unit>101 && unit<300)
		{
			System.out.println("The charge of this is 7.34 per Unit");
		}
		if(unit>301 && unit<500)
		{
			System.out.println("The charge of this is 10.36 per Unit");
		}
		if(unit>501 && unit<1000)
		{
			System.out.println("The charge of this is 11.82 per Unit");
		}
		if(unit>1000 )
		{
			System.out.println("The charge of this is 11.82 per Unit");
		}
	}

}
