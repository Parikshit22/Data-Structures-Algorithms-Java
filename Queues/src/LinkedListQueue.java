
public class LinkedListQueue {
	Node front;
	Node rear;
	
	int length = 0;
	public LinkedListQueue() {
		front = null;
		rear = null;
	}
	
	public void enqueue(int val) {
		
		Node ll = new Node(val);
		
		if(front==null) {
			front = ll;
			rear = ll;
		}
		else {
			rear.next = ll;
			rear = rear.next;
		}
		length++;
	}
	
	public int deqeue() throws Exception {
		if(length==0) {
			throw new Exception("No element present in queue");
		}
		int val = this.rear.data;
		this.front = this.front.next;
		this.length--;
		return val;
	}
	
	public int peek() throws Exception {
		if(length==0) {
			throw new Exception("No element present in queue");
		}
		int val = this.rear.data;
		return val;
	}
	
	public boolean isEmpty() {
		if(this.length==0) {
			return true;
		}
		return false;
	}
	
	public void display() {
		Node temp = this.front;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
}
