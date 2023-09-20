//To extract digits from a given number
package exercise22;

import java.util.Scanner;

public class exercise22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Extract digits from a given number
		int a=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int m=n;
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		n=m;
		System.out.println("Number of digits in a guven number"+count);
		while(n>0) {
			a=n%10;
			System.out.println("Digit at position "+count+" is "+a);
			n=n/10;
			count--;
		}
		
		sc.close();
	}

}
