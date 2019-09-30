    // Function to calculate sum of all proper 
    // divisors num --> given natural number

import java.util.Scanner;

public class sieveDivSum {

	static int divSum(int n) {
		// Final result of summation of divisors 
		int sum = 0;
		// find all divisors which divides
		if(n==1) {
			return 0;
		}
		else {
		for(int i=2; i<=Math.sqrt(n);i++) {
				
			if(n%i==0) {
				
                // if both divisors are same then  
                // add it only once else add both 
				if(i == n/i) {
						sum += i;
					}
					else {
						sum += i + n/i;
					}
				}
			}
        // Add 1 to the result as 1 is also 
        // a divisor 
		return sum + 1;
		}
	}
	public static void main(String[] args) {
		int t,n;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t>0) {
			n = sc.nextInt();
			System.out.println(divSum(n));
			t--;
		}
		 	sc.close();
	}

}
