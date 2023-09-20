//BURGER ORDER BILL
package exercise32;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exercise32 {

	public static void main(String[] args)throws IOException
	{
		// TODO Auto-generated method stub
		//Mini Burger M:$5
		//Normal Burger N: $8
		//Large Burger L:$10
		//Add mushroom:for mini and normal 1$
		//for large:$2
		//extra cheese:$1
		int Mprice=410;
		int Nprice=656;
		int Lprice=820;
		int Muprice=82;
		int LMuprice=164;
		int Cprice=82;
		int M=0;
		int N=0;
		int L=0;
		int Mu=0;
		int LMu=0;
		int C=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total=0;
		System.out.println("What would u like to order??????");
		System.out.println("1.MINI BURGER M:$5");
		System.out.println("2.NORMAL BURGER N:$8");
		System.out.println("3.LARGE BURGER L:$10");
		System.out.println("4.ADD MUSHROOM FOR MINI ND NORMAL 1$ 5.FOR LARGE $2");
		System.out.println("6.ADD CHEESE $1");
		char ch=0;
		int choice=Integer.parseInt(br.readLine());
		System.out.println("How many would u like to order");
		switch(choice)
		{

		case 1:
			System.out.println("Enter quantity of Mini burgers");
			 M+=Integer.parseInt(br.readLine());
		case 2:
			System.out.println("Enter quantity of Normal burgers");
			N+=Integer.parseInt(br.readLine());
		case 3:
			System.out.println("Enter quantity of Big burger");
			L+=Integer.parseInt(br.readLine());
		case 4:
			System.out.println("Enter quantity if u want some mushroom (y/n)");
			ch=(char) br.read();
			if(ch=='y'||ch=='Y') {
				System.out.println("Do u want small mushrooms or large mushrooms");
				Mu+=Integer.parseInt(br.readLine());
			}
			else {
				break;
			}
			
			

		case 5:
			System.out.println("Enter quantity if u want large mushrooms");
			LMu+=Integer.parseInt(br.readLine());
		case 6:
			System.out.println("Do u want extra cheese");
			C+=Integer.parseInt(br.readLine());
		default:
			System.out.println("Exit");
			
		}
		total=Mprice*M+N*Nprice+L*Lprice+Mu*Muprice+LMu*LMuprice+C*Cprice;
		System.out.println("The final bill for ur burger order is "+total);
		
		

	}


}


