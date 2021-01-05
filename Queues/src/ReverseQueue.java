import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {
	
	public static void  reverseQueue(Queue<Integer> q) {
		if(q.isEmpty()) {
			return;
		}
		
		int val = q.remove();
		reverseQueue(q);
		q.add(val);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<>();
		q.add(91);
		q.add(82);
		q.add(73);
		q.add(64);
		q.add(55);
		q.add(46);
		q.add(37);
		q.add(28);
		
		reverseQueue(q);
		
		while(!q.isEmpty()) {
			System.out.print(q.remove()+" ");
		}
		
	}

}
