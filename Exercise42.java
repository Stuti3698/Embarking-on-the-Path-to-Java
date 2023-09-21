//To reverse a number
package exercise42;

import java.util.Scanner;

public class exercise42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=sc.nextInt();
		int sum=0;
		int a=0;
		while(n>0) {
			a=n%10;
			sum=sum*10+a;
			n=n/10;
		}
		System.out.println("The reversed number is "+sum);

	}

}

