//To swap two numbers
package exercise17;

import java.util.Scanner;

public class exercise17 {
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int temp=0;
		temp=m;
		m=n;
		n=temp;
		System.out.println("The swapped values are "+ m+ "," +n);
		sc.close();
		
	}
}
