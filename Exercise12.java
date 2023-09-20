//To read student marks as input and calculate the total and average.
package exercise12;

import java.util.Scanner;

public class exercise12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float marks1,marks2,marks3;
		Scanner sc=new Scanner(System.in);
		marks1=sc.nextInt();
		marks2=sc.nextInt();
		marks3=sc.nextInt();
		float avg;
		avg=(marks1+marks2+marks3)/3;
		System.out.println("The avg is" +avg);

	}

}
