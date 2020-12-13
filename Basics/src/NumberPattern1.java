import java.util.Scanner;

public class NumberPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	     1
//	    121
//	   12321
//	  1234321
//	 123454321
		int n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		int nr = 1;
		while(nr<=n) {
			int nsp = n-nr;
			int nc = 2*nr-1;
			while(nsp>0) {
				System.out.print(" ");
				nsp--;
			}
			int mnc = (nc/2)+1;
			for(int i=1;i<=nc;i++) {
				if(i<=mnc) {
					System.out.print(i);
				}
				else {
					System.out.print(nc-i+1);
				}
			}
			nr++;
			System.out.println();
			
		}
	}

}
