import java.util.Scanner;

public class SegmentedS {
	
	static int[] array;
	static int[] primes;
	
	static void segmentedSieve(int n, int m) {
		
		int j = 0;
		
		int sqt = (int)Math.sqrt(m);
		
		array = new int[sqt+1];
		primes = new int[sqt+1];
		
	
		initialise(sqt + 1);
		
		for(int p = 2; p <= sqt; p++) {
			if(array[p]==1) {
				
				   primes[j] = p;
				   j++;
				   
				for(int i=2*p; i <= sqt; i+=p) {
					array[j] = 0;
				}
			}
		}
		
		int  diff = m - n + 1;
		array = new int[diff];
		initialise(diff);
		for(int i = 0; i<j; i++) {
			int div = n / primes[i];
			div *= primes[i];
			
			while(div <= m) {
				if(div >= n && div != primes[i]) {
					array[div-n] = 0;
				}
				div += primes[i];
		}
		}		
		
		for (int i = 0; i < diff; i++) {
			 if (array[i] == 1 && (i+n) !=1)
			 System.out.println(i + n );
			 }
	}
	
	static void initialise(int sqt) {
		for(int i=0; i< sqt ; i++) {
			array[i] = 1;
		}
	}
	
	
	public static void main(String[] args) {
		
		int t, n, m;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		
		while(t>0) {
			
			n = sc.nextInt();
			m = sc.nextInt();
			segmentedSieve(n, m);
			t--;
		}
		
		sc.close();
		
	}

}
