//To find prime numbers between the given range
package exercise36;

import java.util.Scanner;

public class exercise36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Prime numbers in a given rsnge
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lower bound : \n");
		int lower=sc.nextInt();
		System.out.println("Enter upper bound : \n");
		int upper=sc.nextInt();
		//int found=0;
		//int flag=0;
		for(int i=lower;i<=upper;i++)
		{
			int factor=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0) {
					factor++;
				}
					
			}
			if(factor==2)
				System.out.println(i+ "is prime");
			else
				System.out.println(i+" is not prime");
			
		}
		sc.close();

	}

}
