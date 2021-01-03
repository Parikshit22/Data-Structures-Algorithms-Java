
public class ReverseStack {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BuildStack s = new BuildStack();
		for(int i=0;i<5;i++) {
			s.push((i+1)*10);
		}
		s.display();
		reverseStack(s);
		System.out.println();
		s.display();
		
	}
	
	public static void insertAtBottom(BuildStack s,int val) throws Exception {
		if(s.isEmpty()) {
			s.push(val);
			return;
		}
		else {
			int x = s.pop();
			insertAtBottom(s,val);
			s.push(x);
		}
	}
	
	public static void reverseStack(BuildStack s) throws Exception {
		if(s.size()==1) {
			return;
		}
		int val = s.pop();
		reverseStack(s);
		insertAtBottom(s,val);
	}

}
