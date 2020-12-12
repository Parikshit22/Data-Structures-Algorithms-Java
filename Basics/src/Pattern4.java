import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		*****
//		 ****
//		  ***
//		   **
//		    *
		int n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		int nst = 1;
		while(nst<=n) {
			int cst = n-nst+1;
			int csp = nst-1;
			while(csp>0) {
				System.out.print(" ");
				csp-=1;
			}
			while(cst>0) {
				System.out.print("*");
				cst-=1;
			}
			nst+=1;
			System.out.println();
		}
	}

}
