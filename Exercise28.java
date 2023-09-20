//To check whether a character is a vowel or consonant or diigit
package exercise28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exercise28 {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		//To check whether a char is vowel or consonant or digit
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a character");
		char c=(char)br.read();
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		{
			System.out.println(c+ " is a vowel");
		}
		else if(c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'||c=='0')
		{
			System.out.println(c+" is a digit");
		}
		else {
			System.out.println(c+" is a consonant");
		}

}
}
