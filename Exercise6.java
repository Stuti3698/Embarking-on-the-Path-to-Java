//Java program to use the arithmetic operators
package exercise6;

import java.util.Scanner;

public class exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int choice;
		choice=sc.nextInt();
		System.out.println("Enter wt u want to do"+choice);
		//1.ADDITION
		//2.SUBTRACTION
		//3.MULITPLICATION
		//4.DIVISION
		//exit
		switch(choice)
		{
		case 1:
			int c=a+b;
			System.out.println("The sum of a  and b is "+c);
			break;
		case 2:
			int d=a-b;
			System.out.println("The subtraction of a and b is "+d);
			break;
		case 3:
			int e=a*b;
			System.out.println("The product of a and b is" +e);
			break;
		case 4:
			int f=a/b;
			System.out.println("The division of a and b is "+f);
			break;
		default:
			System.out.println("Error,wrong input");
		
		}
		

	}

}
