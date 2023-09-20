//To compare if both numbers are equal
package exercise19;

import java.util.Scanner;

public class exercise19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To check if two number are equal
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		if(m==n)
		{
			System.out.println("Both numbers are equal");
		}
		else {
			System.out.println("The two numbers are not equal");
		}
		sc.close();
		

	}

}
