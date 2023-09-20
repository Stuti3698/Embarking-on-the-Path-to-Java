//To check whether the given alphabets are uppercase or lowercase
package Exercise29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise29 {

	public static void main(String[] args)throws IOException
	{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		char c=(char)br.read();
		if(c>=65 && c<=96)
		{
			System.out.println(c+" is a uppercase alphabet");
		}
		else if(c>=97 && c<=123)
		{
			System.out.println(c+" is a lowercase alphabet");
		}
		else if(c>=48 && c<=57)
		{
			System.out.println(c + " is a digit");
		}
		else
		{
			System.out.println("Invalid");
		}

	}

}
