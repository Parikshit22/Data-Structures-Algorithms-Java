
public class Demo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedListQueue q = new LinkedListQueue();
		for(int i=0;i<5;i++) {
			q.enqueue((i+1)*10);
		}
		q.display();
		System.out.println();
		
		System.out.println(q.deqeue());
		System.out.println(q.deqeue());
		q.display();
		System.out.println();
		q.enqueue(2);
		System.out.println(q.rear);
		q.enqueue(21);
		q.enqueue(1);
		q.enqueue(27);
		System.out.println(q.deqeue());
		q.enqueue(7);
		System.out.println(q.peek());
		q.display();
	}

}
