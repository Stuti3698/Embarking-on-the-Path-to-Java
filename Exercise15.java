//To check whether a number is negative or positive
package exercise15;

import java.util.Scanner;

public class exercise15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To check if a number is positive and negative
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		if(num<0)
		{
			System.out.println("The given number "+ num + " is negative");
		}
		else {
			System.out.println("The given number is "+num+ " is positive");
		}
		sc.close();
		
		

	}

}
