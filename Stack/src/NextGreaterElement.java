
public class NextGreaterElement {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int arr[] = {2,1,3,8,6,7,5};
		
		DynamicStack s = new DynamicStack();
		int i =0;
		while(i<arr.length) {
			while(!s.isEmpty() && arr[i]>=s.top()) {
				int rv = s.pop();
				System.out.println(rv+" -> "+arr[i]);
			}
			s.push(arr[i]);
			i++;
		}
		while(!s.isEmpty()) {
			System.out.println(s.pop()+" -> "+-1);
		}
	}

}
