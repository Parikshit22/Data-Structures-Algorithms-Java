
public class DynamicStack extends BuildStack {
	
	public DynamicStack() throws Exception{
		this(defaultCapacity);
	}

	public DynamicStack(int defaultcapacity) throws Exception {
		super(defaultcapacity);
	}
	
	@Override
	public void push(int val) throws Exception {
		if(this.size()==this.data.length) {
			int [] arr = new int[2*this.data.length];
			for(int i=0;i<this.size();i++) {
				arr[i] = this.data[i];
			}
			this.data = arr;
		}
		super.push(val);
	}
	

}
