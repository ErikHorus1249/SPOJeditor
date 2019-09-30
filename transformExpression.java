
import java.util.Scanner;
import java.util.Stack;

public class transformExpression {

	static boolean isOperand(char ch) {
		if(ch >= 'a' && ch <='z') {
			return true;
		}
		else return false;
	}
	
	static boolean isOperator(char ch) {
		if( ch == '*' || ch == '/' || ch == '+' || ch == '-'|| ch == '^') {
			return true;
		}
		else return false;
	}
	
	static int GetPriority(char ch) {
		if(ch == '+') return 1;
		if(ch == '-') return 2;
		if(ch == '*') return 3;
		if(ch == '/') return 4;
		if(ch == '^') return 5;
			return 0; 
	}
	
	public static void main(String[] args) {
		int t;
		Stack<Character> s = new Stack<Character>();
		String polish;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t>0) {
			polish = sc.next();
			for(int i = 0; i<polish.length();i++) {
				if(isOperand(polish.charAt(i))) {
					System.out.print(polish.charAt(i));
				}
				else if(polish.charAt(i)=='(') {
					s.push('(');
				}
				else if(polish.charAt(i)==')') {
					 char key = ' ';
					 while(key!='('){
						key = s.pop();
						if(key!='(') {
						System.out.print(key);
						}
					}
					
				}
				else 
					if(isOperator(polish.charAt(i))){
					while(isOperator(s.peek()) && GetPriority(s.peek())>=GetPriority(polish.charAt(i))) {
						System.out.print(s.pop());
					}
					s.push(polish.charAt(i));
					
				}
			}
			t--;
		}
		 sc.close();
	}

}
