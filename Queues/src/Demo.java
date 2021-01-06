
public class Demo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		QueueUsing2Stack s = new QueueUsing2Stack();
		for(int i=0;i<5;i++) {
			s.add((i+1)*10);
		}
		
		
		s.display();
		System.out.println();
		System.out.println(s.remove());
		System.out.println();
		System.out.println(s.remove());
		System.out.println();
		s.add(2);
		s.display();
		System.out.println();
		System.out.println(s.peek());
		
	}

}
