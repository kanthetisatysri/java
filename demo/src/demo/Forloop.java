package demo;

public class Forloop {

	public static void main(String[] args) {
		int number = 12 ;
		boolean iseven = true;
		for(int i=2;i<number/2;i++)
		{		  
			if(number%i==0)
			{
				iseven=false;
			}
			}
		if(iseven == true)
		{
			System.out .println("the given number is even");
			}
		else
			System.out. println("the given number is not even");
			
		}

	}





