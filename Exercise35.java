//Score with their grades
package exercise35;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exercise35 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter score b/w 0.0 and 1.0");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double score = Double.parseDouble(br.readLine());
		//System.out.println(score>=0.9);
		if (score > 0.0 && score < 1.0) {
			if (score >= 0.9) {
				System.out.println("A");
			} else if (score >= 0.8) {
				System.out.println("B");
			} else if (score >= 0.7) {
				System.out.println("C");
			} else if (score >= 0.6) {
				System.out.println("D");
			} else if (score < 0.6) {
				System.out.println("F");
			}
		} else {
			System.out.println("Bad Score");

		}

	}

}
