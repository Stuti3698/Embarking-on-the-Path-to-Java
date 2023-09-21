//To print sum of n natural numbers sqaure
package exercise52;

import java.util.Scanner;

public class exercise52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the range ");
				int n=sc.nextInt();
				int i=1;
				int sum=0;
				while(i<=n) {
					sum=sum+(i*i);
					i++;
				}
				System.out.println("The sum of n natural numbers square is "+sum);

			}

		}


	}

}
