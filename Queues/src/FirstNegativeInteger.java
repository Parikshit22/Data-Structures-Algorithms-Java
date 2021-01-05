import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class FirstNegativeInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Deque<Integer> q = new LinkedList<>();
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(12);
		arr.add(-1);
		arr.add(-7);
		arr.add(8);
		arr.add(-15);
		arr.add(30);
		arr.add(16);
		arr.add(28);
		
		int k = 3;
		
		int i=0;
		for(;i<k;i++) {
			if(arr.get(i)<0) {
				q.addLast(i);
			}
		}
		
		for(;i<arr.size();i++) {
			if(q.isEmpty()) {
				System.out.print(0+ " ");
			}
			else {
				System.out.print(arr.get(q.getFirst())+ " ");
			}
			
			if(!q.isEmpty() && q.getFirst()<=i-k) {
				q.removeFirst();
			}
			if(arr.get(i)<0) {
				q.addLast(i);
			}
		}
		if(q.isEmpty()) {
			System.out.print(0+ " ");
		}
		else {
			System.out.print(arr.get(q.getFirst())+ " ");
		}
	}

}
