//Print armstrong numbers between 1 and 1000
package Exercise41;

public class Exercise41 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Printing armstrong numbers between 1 and 1000");
		for (int i = 1; i < 1000; i++) {
			int j = i;
			int n = String.valueOf(i).length();
			//i = j;
			int a = 0;
			int sum = 0;
			while (i > 0) {
				a = i % 10;
				sum = (int) (sum + Math.pow(a, n));
				i = i / 10;
			}
			i=j;
			if (j == sum) {
				//System.out.println("Armstrong");
				System.out.println(j);
			}
		}
	}
}
