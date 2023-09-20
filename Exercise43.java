//To check whether a given number is palindrome or not
package exercise43;

import java.util.Scanner;

public class exercise43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To find whether a given number is palindrome or not
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int a=0;
		int rev=0;
		int n=sc.nextInt();
		int m=n;
		while(n>0){
			a=n%10;
			rev=rev*10+a;
			n=n/10;
		}
		System.out.println(rev  +" is reverse");
		if(m==rev)
			System.out.println(m+" is a palindrome number");
		else
			System.out.println(m+ " is not a palindrome number");
		sc.close();
		

	}

}
