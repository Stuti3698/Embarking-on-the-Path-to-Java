//BMI INDEX CALCULATOR
package exercise31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exercise31 {

	public static void main(String[] args)throws IOException 
	{
		// TODO Auto-generated method stub
		//BMI index calculator
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		float weight=Float.parseFloat(br.readLine());
		float height=Float.parseFloat(br.readLine());
		float BMI=((weight)/(height*height));
		System.out.println("Body Mass Index is:"+BMI);
		if(BMI<18.5)
		{
			System.out.println("You are underweight");
		}
		else if(BMI>18.5 && BMI<25)
		{
			System.out.println("You are normal");
		}
		else if(BMI>25 && BMI<30)
		{
			System.out.println("You are overweight");
		}
		else if(BMI>30 && BMI<35)
		{
			System.out.println("You are obese");
		}
		else
		{
			System.out.println("Error");
		}
	}

}

