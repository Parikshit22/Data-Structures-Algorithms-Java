
public class PrintSubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		prin(str,"",0);
	}
	public static void prin(String str,String ret,int s) {
		if(s==str.length()) {
			System.out.println(ret);
			return;
		}
		prin(str,ret,s+1);
		prin(str,ret+str.charAt(s),s+1);
		return;
	}

}
