import java.util.ArrayList;

public class PrintPermutaionString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		prin(str,"");
	}

public static void prin(String str, String rs){
		if(str.length()==0) {
			System.out.println(rs);
			return;
		}
		for(int i=0;i<=rs.length();i++) {
			String jk = (String)rs.subSequence(0, i) + str.charAt(0)+(String)rs.subSequence(i, rs.length());
			prin((String)str.subSequence(1, str.length()),jk);
		}
		
	}
}
