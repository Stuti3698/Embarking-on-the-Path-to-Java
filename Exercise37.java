//To find whether the given number is prime or not
package Exercise37;

import java.util.Scanner;

public class Exercise37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TO CHECK WHETHER A NUMBER IS PRIME OR NOT
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int found = 0;
		for(int i=1;i<=n;i++){
			//int found;
			if(n%i==0) {
				System.out.print(i+ " ");
				 found++;
			}
		}
		System.out.println("\n");
		if(found==2)
			System.out.println(n+" is  a prime number");
		else
			System.out.println(n+ " is not a prime number");
		sc.close();

	}

}

/*   for(i=2;i<=n/2;i++){      
    if(n%i==0){      
     System.out.println(n+" is not prime number");      
     flag=1;      
     break;      
    }      
   }      
   if(flag==0)  { System.out.println(n+" is prime number"); }  
  }//end of else  
*/
