
public class Demo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BuildQueue q = new BuildQueue(7);
		for(int i=0;i<5;i++) {
			q.add((i+1)*10);
		}
		q.display();
		System.out.println();
		
		System.out.println(q.remove());
		System.out.println(q.remove());
		q.display();
		System.out.println();
		q.add(2);
		System.out.println(q.rear);
		q.add(21);
		q.add(1);
		q.add(27);
		System.out.println(q.remove());
		q.add(7);
		System.out.println(q.peek());
		q.display();
	}

}
