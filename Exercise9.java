//To find largest of three numbers using ternary operators
package exercise9;

import java.util.Scanner;

public class exercise9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,result;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		result=c>(a>b?a:b)? c:(a>b?a:b);
		System.out.println("The value of d is" +result);
		sc.close();
		

	}

}
