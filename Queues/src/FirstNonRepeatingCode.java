import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingCode {
	public static void main(String[] args) {
		String str = "caacbdecdber";
		HashMap<Character, Integer> map = new HashMap<>();
		Queue<Character> q = new LinkedList<>();
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
				map.replace(str.charAt(i),map.get(str.charAt(i))+1) ;
			}
			else {
				map.put(str.charAt(i), 1);
			}
			q.add(str.charAt(i));
			
			while(!q.isEmpty()&&map.get(q.peek())>1) {
				q.remove();
			}
			
			if(q.isEmpty()) {
				System.out.print(-1+" ");
			}
			else {
				System.out.print(q.peek()+" ");
			}
			
			
		}
	}
}
