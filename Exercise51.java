//To print first n square numbers
package exercise51;

import java.util.Scanner;

public class exercise51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range ");
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			System.out.println(i*i);
			i++;
		}
		//System.out.println("The sum of n natural numbers square is "+sum);

	}

}
