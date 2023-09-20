//To check if the given number is Armstrong number or not
package exercise40;

import java.util.Scanner;
//import java.lang.Math;

public class exercise40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		//to check whether the given number is armstrong nnumber or not
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int a=0;
		int sum=0;
		int m=n;
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		System.out.println("No of digits in a given number is "+count);
		n=m;
		while(n>0)
		{
			a=n%10;
			sum+=(int)Math.pow(a, count);
			n=n/10;
		}
		System.out.println("The sum of factors of a number is"+sum);
		if(m==sum)
		{
			System.out.println(m+ " is a Armstrong number");
		}
		else
			System.out.println("Not a Armstrong number");

		sc.close();
	}

}
