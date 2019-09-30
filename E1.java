import java.util.Scanner;

public class E1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		while(true) {
			
			n = sc.nextInt();
			
			if(n != 42) {
				
			System.out.println(n);
			
			}
			else {
				
				n = sc.nextInt();
				break;
			
			}
		}
		
		sc.close();
	}

}
