//To illustrate various use of operators
package exercise8;

import java.util.Scanner;

public class exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean a=sc.nextBoolean();
		boolean b=sc.nextBoolean();
		boolean c=a|b;
		boolean f=a||b;
		boolean d=a&b;
		boolean g=a&&b;
		boolean e=a^b;
		System.out.println("The value of c is "+c);
		System.out.println("The value of f is "+f);
		System.out.println("The value of d is "+d);
		System.out.println("The value of g is "+g);
		System.out.println("The value of e is "+e);
		//System.out.println("The value of a is "+a);
		//System.out.println("The value of a is "+a);
		sc.close();
		

	}

}
