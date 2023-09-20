//Greater or less or equal
package Exercise30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise30 {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		//compare two numbers
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int c=Integer.parseInt(br.readLine());
		int d=Integer.parseInt(br.readLine());
		if(c==d)
		{
			System.out.println("Two numbers are equal");
		}
		else if(c<d)
		{
			System.out.println(c+ " is less than "+d);
		}
		else {
			System.out.println(c+" is greater than "+d);
		}
		

	}

}
