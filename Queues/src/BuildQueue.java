
public class BuildQueue {
	
	public static final int defaultLength = 10;
	int front=-1;
	int rear = -1;
	int length;
	int data[];
	public BuildQueue() throws Exception {
		this(defaultLength);
	}
	public BuildQueue(int len) throws Exception {
		if(len<=0) {
			throw new Exception("Length should be greater than 0");
		}
		this.length = len;
		
		data = new int[len];
		
	}
	
	public void add(int val) throws Exception {
		int idx = (rear+1)%this.length;
		if(idx==front) {
			throw new Exception("Queue is full");
		}
		if(front==-1) {
			front++;
		}
		System.out.println(idx);
		this.data[idx] = val;
		rear = idx;
	}
	
	public boolean isEmpty(){
		if(this.rear==this.front) {
			return true;
		}
		return false;
	}
	
	public int remove() throws Exception {
		if(this.isEmpty()) {
			throw new Exception("Queue is empty");
		}
		int val = this.data[front];
		front = (front+1)%this.length;
		System.out.println(front);
		return val;
	}
	
	public int peek() throws Exception {
		if(this.isEmpty()) {
			throw new Exception("Queue is empty");
		}
		int val = this.data[front];
		return val;
	}
	
	public void display() {
		int i = this.front;
		while(this.front!=this.rear) {
			i = (i)%this.length;
			if(i==this.rear) {
				System.out.print(this.data[i]+" ");
				break;
			}
			System.out.print(this.data[i]+" ");
			i++;
		}
	}
	
}
