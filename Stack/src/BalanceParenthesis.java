import java.util.Stack;

public class BalanceParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "{{()}[]}}";
		Stack<Character> st = new Stack<>();
		boolean flag = true;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==('[')||s.charAt(i)==('{')||s.charAt(i)==('(') ) {
				st.push(s.charAt(i));
			}
			else if(s.charAt(i)==(']')) {
				if( !st.isEmpty() && st.peek()=='[') {
					st.pop();
				}
				else {
					flag = false;
					break;
				}
			}
			else if(s.charAt(i)==('}')) {
				if( !st.isEmpty() && st.peek()=='{') {
					st.pop();
				}
				else {
					flag = false;
					break;
				}
			}
			else if(s.charAt(i)==(')')) {
				if( !st.isEmpty() && st.peek()=='(') {
					st.pop();
				}
				else {
					flag = false;
					break;
				}
			}
		}
		if(!st.isEmpty() || !flag) {
			System.out.println("NO");
		}
		else {
			System.out.println("YES");
		}
	}

}
