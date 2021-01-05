
public class Demo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StackUsing2Queue s = new StackUsing2Queue();
		for(int i=0;i<5;i++) {
			s.push((i+1)*10);
		}
		
		System.out.println();
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println();
		s.push(2);
		System.out.println(s.top());
		
	}

}
