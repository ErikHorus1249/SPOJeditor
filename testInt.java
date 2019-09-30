import java.util.Scanner;

public class testInt {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.hashCode();
		System.out.println(a+b);
		sc.close();
	}

}
