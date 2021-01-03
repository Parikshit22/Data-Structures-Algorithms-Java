
public class BuildStack {

	public int top = -1;
	public int[] data;
	
	public final static int defaultCapacity = 10;
	
	public BuildStack() throws Exception {
		this(defaultCapacity);
	}
	
	public BuildStack(int capacity) throws Exception {
		if(capacity <= 0) {
			throw new Exception("Enter valid capacity");
		}
		
		this.data = new int[capacity];
	}
	
	public int size() {
		return top+1;
	}
	
	public boolean isEmpty() {
		return this.size()==0;
	}
	
	public void push(int val) throws Exception {
		if(this.size()==this.data.length) {
			throw new Exception("Stack Full");
		}
		this.data[++this.top] = val;
	}
	
	public int pop() throws Exception {
		if(this.size()==0) {
			throw new Exception("No Element Present in Array");
		}
		
		int val = this.data[this.top];
		this.data[this.top]=0;
		this.top--;
		return val;
	}
	
	public int top() throws Exception {
		if(this.size()==0) {
			throw new Exception("No Element Present in Array");
		}
		
		int val = this.data[this.top];
		
		return val;
	}
	
	public void display() {
		for(int i=top; i>=0;i--) {
			System.out.print(this.data[i]+" ");
		}
	}
	
	
	

}
