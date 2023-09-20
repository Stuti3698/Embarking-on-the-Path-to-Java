//To find if the given integer is divisible by 5
package exercise18;

import java.util.Scanner;

public class exercise18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to check if number is divisible by 5
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		if(n%5==0)
		{
			System.out.println("The given number " + n + "is divisible by 5");
		}
		else {
			System.out.println("The guven number "+n+ "is not divisible by 5");
		}
		sc.close();
	}

}
