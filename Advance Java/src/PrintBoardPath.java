
public class PrintBoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prin(4,"");
	}
	public static void prin(int n,String curr){
		if(n<0) {
			return;
		}
		if(n==0) {
			System.out.println(curr);
			return;
		}
		for(int i=1;i<6;i++) {
			prin(n-i,curr+i);
		}
	}

}
