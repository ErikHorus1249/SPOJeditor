import java.util.Scanner;

public class TheNextPalindrome {
	
	static boolean AllNine(String str) {
		for(int i =0; i<str.length();i++) {
			if(str.charAt(i)=='9') {
				return true;
			}
		}
		return false;
	}
	static void Process(String str) {
		int n = str.length();
		int[] ans = new int[n+1];
		if(AllNine(str)) {
			ans[0] = 1;
			ans[n] = 1;
			for(int i = 1; i<n; i++) {
				ans[i] = 0;
			}
			for(int j = 0; j<ans.length;j++) {
				System.out.print(ans[j]);
			}
		}
		else {
			int i,j;
			int num;
			i = n/2;
			j=i;
			if(n%2==0) {
				i--;
			}
			while(i>=0&&str.charAt(i)==str.charAt(j)) {
				j++;      //checking for equal from middle
				i--;	  // <---i    j---> 
			}
			if(i<0||str.charAt(i)<str.charAt(j)) {
				i = n/2;
				j=i;
				if(n%2==0) {
					i--;
				}
				int carry = 1;
				while(i>=0) {
	                num=((str.charAt(i)-'0')+carry);
	                carry=num/10;
	                int a=(num%10)+'0';
	                int b=str.charAt(i);
	                i--;
	                j++;
				}
			}
		}
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	while(n>0) {
		String str = sc.next();
		Process(str);
		n--;
	}
	sc.close();
	}

}
