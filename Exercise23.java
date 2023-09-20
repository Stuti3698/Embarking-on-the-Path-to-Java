//To increment by 1 in all the digits of a number
package exercise23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exercise23 {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		//To extract digit one by one and increment them one by one
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number");
		int n=Integer.parseInt(br.readLine());
		int m=0;
		//int count=0;
		/*while(n>0) {
			n=n/10;
			count++;
		}*/
		int a=0;
		while(n>0) {
			a=n%10;
			a=a+1;
			m=m*10+a;
			n=n/10;	
		}
		
		n=m;
		m=0;
		while(n>0) {
			a=n%10;
			m=m*10+a;
			n=n/10;
			
		}
		System.out.println("Result"+m);

	}
	//br.close();

}
