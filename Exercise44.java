//To reverse a number and find its sum using do-while loop
package exercise44;

import java.util.Scanner;

public class exercise44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=0;
		int rev=0;
		int sum=0;
		
		int n=sc.nextInt();
		do {
			a=n%10;
			rev=rev*10+a;
			sum=sum+a;
			n=n/10;
			
			
		}while(n>0);
		System.out.println("The reversed number is "+rev);
		System.out.println("The sum of reversed number digits is "+sum);
		

	}

}
