//To print sum of n natural numbers
package exercise49;

import java.util.Scanner;

public class exercise49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a range till where u want to sum");
		int n=sc.nextInt();
		int i=1;
		int sum=0;
		while(i<=n) {
			sum=sum+i;
			i++;
		}
		System.out.println("The sum of natural numbers is "+sum);
		

	}

}
