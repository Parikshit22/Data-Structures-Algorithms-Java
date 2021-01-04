import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
public class MaximumValueOfWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> q = new LinkedList<>();
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(1);
		arr.add(4);
		arr.add(5);
		arr.add(2);
		arr.add(3);
		arr.add(6);
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
			while(!q.isEmpty()&& arr.get(q.peekLast())<=arr.get(i)) {
				q.removeLast();
			}
			q.addLast(i);
			
		}
		System.out.print(arr.get(q.peekFirst())+ " ");
	}

}
