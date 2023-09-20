//To check whether a given number is odd or even
package exercise13;

import java.util.Scanner;

public class exercise13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To check whether a given integer is odd or even
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println(num + " is a even number");
		}
		else
		{
			System.out.println(num +" is a odd number");
		}
		
		sc.close();

	}

}
