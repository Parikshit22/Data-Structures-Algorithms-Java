import java.util.ArrayList;

public class MazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		System.out.println(prin(n,0,0));
	}
	
	public static ArrayList<String> prin(int n,int r,int c){
		if(r>n||c>n) {
			ArrayList<String> arr = new ArrayList<>();
			return arr;
		}
		if(r==n&&c==n) {
			ArrayList<String> arr = new ArrayList<>();
			arr.add("");
			return arr;
		}
		ArrayList<String> arr = new ArrayList<>();
		if(r<n) {
			ArrayList<String> ret = prin(n,r+1,c);
			for(String p : ret) {
				arr.add("V"+p);
			}
		}
		if(c<n) {
			ArrayList<String> ret = prin(n,r,c+1);
			for(String p : ret) {
				arr.add("H"+p);
			}
		}
		if(c<n && r<n) {
			ArrayList<String> ret = prin(n,r+1,c+1);
			for(String p : ret) {
				arr.add("D"+p);
			}
		}
		
		return arr;
	}

}
