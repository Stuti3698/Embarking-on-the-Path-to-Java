//To read a grade and display an equivalent description
package exercise27;
import java.io.*;

import java.io.BufferedReader;

public class exercise27 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter grade scored by student: ");
		char a=(char)br.read();
		if(a=='A'||a=='a')
		{
			System.out.println("You have scored 90+");
		}
		else if(a=='B'||a=='b')
		{
			System.out.println("You have scored 80+");
		}
		else
		{
			System.out.println("you have scored <60");
		}

	}

}
