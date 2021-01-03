import java.util.ArrayList;

public class ReturnSubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		System.out.println(prin(str,0));
	}
	
	public static ArrayList<String> prin(String str,int s){
		if(s>=str.length()) {
			ArrayList<String> arr = new ArrayList<>();
			arr.add("");
			return arr;
		}
		ArrayList<String> ret = prin(str,s+1);
		ArrayList<String> arr = new ArrayList<>();
		
		for(String p: ret) {
			arr.add(p);
			arr.add(str.charAt(s)+p);
		}
		
		return arr;
		
		
		
		
		
	}

}
