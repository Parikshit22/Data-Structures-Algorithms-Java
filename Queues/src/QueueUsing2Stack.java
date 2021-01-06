import java.util.Stack;

public class QueueUsing2Stack {
	Stack<Integer> primary ;
	Stack<Integer> secondary ;
	
	QueueUsing2Stack(){
		primary = new Stack<>();
		secondary = new Stack<>();
	}
	
	public void add(int val) {
		primary.push(val);
	}
	
	public int remove() throws Exception {
		if(primary.isEmpty()) {
			throw new Exception("Queue is empty");
		}
		
		while(primary.size()!=1) {
			int val = primary.pop();
			secondary.push(val);
		}
		int val = primary.pop();
		while(!secondary.isEmpty()) {
			int temp = secondary.pop();
			primary.push(temp);
		}
		return val;
	}
	
	public int peek() throws Exception {
		if(primary.isEmpty()) {
			throw new Exception("Queue is empty");
		}
		
		while(primary.size()!=1) {
			int val = primary.pop();
			secondary.push(val);
		}
		int val = primary.pop();
		secondary.push(val);
		while(!secondary.isEmpty()) {
			int temp = secondary.pop();
			primary.push(temp);
		}
		return val;
	}
	
	public void display() {
		while(!primary.isEmpty()) {
			int val = primary.pop();
			secondary.push(val);
		}
		while(!secondary.isEmpty()) {
			int temp = secondary.pop();
			System.out.print(temp+" ");
			primary.push(temp);
		}
		
	}
}
