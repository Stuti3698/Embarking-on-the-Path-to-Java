//To find sum of first n cube of natural numbers
package exercise53;

import java.util.Scanner;

public class exercise53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a range");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		int sum=0;
		while(i<=n) {
			sum=sum+(i*i*i);
			i++;
		}
		System.out.println("The sum of n cube numbers is "+sum);

	}

}
