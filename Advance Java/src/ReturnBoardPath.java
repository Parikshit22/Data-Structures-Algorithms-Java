import java.util.ArrayList;

public class ReturnBoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(prin(5,0));
	}
	
	public static ArrayList<String> prin(int n,int curr){
		if(curr>n) {
			ArrayList<String> arr = new ArrayList<>();
			return arr;
		}
		if(curr==n) {
			ArrayList<String> arr = new ArrayList<>();
			arr.add("");
			return arr;
		}
		ArrayList<String> arr = new ArrayList<>();
		for(int i=1;i<=6;i++) {
			ArrayList<String> ret = prin(n,curr+i);
			for(String p :ret) {
				arr.add(i+p);
			}
		}
		return arr;
	}

}
