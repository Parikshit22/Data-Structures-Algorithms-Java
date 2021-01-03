
public class Demo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynamicStack s = new DynamicStack(5);
		for(int i=0;i<10;i++) {
			s.push((i+1)*10);
		}
		System.out.println(s.top());
		s.display();
		
	}

}
