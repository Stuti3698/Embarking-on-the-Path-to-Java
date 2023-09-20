//To check whether the given number is perfect or not
package example39;

import java.util.Scanner;

public class example39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// To check if a number is perfect number or not
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int i=1;
		int factors=0;
		while(i<n) {
			int rem=n%i;
			if(rem==0)
				factors=factors+i;
			i++;
		}
		if(factors==n)
			System.out.println("Perfect number");
		else
			System.out.println("Not a perfect number");
		sc.close();
		
	}

}
