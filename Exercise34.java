//Leap year
package exercise34;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exercise34 {

	public static void main(String[] args)throws IOException
	{
		// TODO Auto-generated method stub
		//TO CHECK IF A GIVEN YEAR IS LEAP YEAR OR NOT
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a year ");
		int year=Integer.parseInt(br.readLine());
		if(year%4==0)
		{
			System.out.println(year+" is a leap year");
		}
		else if(year%400==0) {
			System.out.println(year+" is a leap year");
		}
		else if(year%100==0) {
			System.out.println(year+" is not a leap year");
		}
		
		else {
			System.out.println(year+ " is not a leap year");
		}
		
	}

}
