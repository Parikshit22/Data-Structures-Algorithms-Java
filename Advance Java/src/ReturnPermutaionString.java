import java.util.ArrayList;

public class ReturnPermutaionString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		System.out.println(prin(str));
	}
	
	public static ArrayList<String> prin(String str){
		
		if(str.length()==0) {
			ArrayList<String> arr = new ArrayList<>();
			arr.add("");
			return arr;
		}
		ArrayList<String> arr = new ArrayList<>();
		String ak = (String)str.subSequence(1, str.length());
		ArrayList<String> ret = prin(ak);
		for(String p: ret) {
			for(int i=0;i<=p.length();i++) {
				String jk = (String)p.subSequence(0, i) + str.charAt(0)+(String)p.subSequence(i, p.length());
				arr.add(jk);
			}
		}
		return arr;
	}

}
