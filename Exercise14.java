//To find sum of even and odd numbers
package exercise14;

import java.util.Scanner;

public class exercise14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sum of even numbers and odd numbers
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int sumo=0;
		int sume=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<n;j++)
		{
			if(arr[j]%2==0)
			{
				sume+=arr[j];
			}
			else {
				sumo+=arr[j];
			}
				
		}
		System.out.println("The sum of even numbers is "+sume);
		System.out.println("The sum of odd numbers is "+sumo);
		sc.close();
		
		
	}

}
