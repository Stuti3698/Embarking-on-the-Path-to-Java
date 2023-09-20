//GROSS PAY
package exercise33;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exercise33 {

	public static void main(String[] args)throws IOException
	{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the hours per day");
		float hours=Float.parseFloat(br.readLine());
		System.out.println("Enter the rate per hour ");
		float rate=Float.parseFloat(br.readLine());
		if(hours>40)
		{
			//float overtime=hours-40;
			float pay=(float) (hours*rate*1.5);
			System.out.println("THE GROSSS PAY WILL BE "+pay);
		}
		else {
			System.out.println("U didnot do overtime so no gross pay");
		}
		
		

	}

}
