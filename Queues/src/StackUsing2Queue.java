import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Queue {
	Queue<Integer> q1 ;
	Queue<Integer> q2 ;
	
	public StackUsing2Queue() {
		q1= new LinkedList<>();
		q2= new LinkedList<>();
	}
	
	public void push(int val) {
		q1.add(val);
	}
	
	public int pop() throws Exception {
		if(q1.isEmpty()) {
			throw new Exception("No element in stack");
		}
		while(q1.size()!=1) {
			int val = q1.remove();
			q2.add(val);
		}
		int val = q1.remove();
		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;
		return val;
	}
	
	public int top() throws Exception {
		if(q1.isEmpty()) {
			throw new Exception("No element in stack");
		}
		while(q1.size()!=1) {
			int val = q1.remove();
			q2.add(val);
		}
		int val = q1.remove();
		q2.add(val);
		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;
		return val;
	}
	

}
