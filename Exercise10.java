//To illustrate use of pre increment and post incremental operators
package exercise10;

import java.util.Scanner;

public class exercise10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int c;
		int d;
		int e;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("The value of ++a is "+(++a));
		b=++a;
		System.out.println("The value of b is " +b);
		c=a++;
		System.out.println("The value of a++ is "+(a++));
		System.out.println("The value of c is "+c);
		d=--a;
		System.out.println("The value of --a is"+(--a));
		System.out.println("The value of d is "+d);
		e=a--;
		System.out.println("The value of a-- is "+(a--));
		System.out.println("The value of e is" +e);
		sc.close();
		
		

	}

}
