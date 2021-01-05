import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
public class MaximumValueOfWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> q = new LinkedList<>();
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(91);
		arr.add(82);
		arr.add(73);
		arr.add(64);
		arr.add(55);
		arr.add(46);
		arr.add(37);
		arr.add(28);
		
		int k = 3;
		int i;
		for(i=0;i<k;i++) {
			if(!q.isEmpty() && arr.get(q.peekLast())<=arr.get(i)) {
				q.removeLast();
			}
			q.addLast(i);
		}
		
		
		for(;i<arr.size();i++) {
			
			System.out.print(arr.get(q.peekFirst())+ " ");
			if(!q.isEmpty()&& q.peekFirst()<=i-k) {
				q.removeFirst();
			}
			
			while(!q.isEmpty()&& arr.get(q.peekLast())<=arr.get(i)) {
				q.removeLast();
			}
			q.addLast(i);
			
		}
		
		System.out.print(arr.get(q.peekFirst())+ " ");
		System.out.println();
		System.out.println(q.size());
	}

}
