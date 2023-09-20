//To find sum of digits of a number
package exercise20;

import java.util.Scanner;

public class exercise20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sum of digits of a  number
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int n=sc.nextInt();
		while(n>0)
		{
			int a=n%10;
			sum=sum+a;
			n=n/10;
			
		}
		System.out.println("The sum of digits of a number is: "+ sum);
		sc.close();
	}

}
