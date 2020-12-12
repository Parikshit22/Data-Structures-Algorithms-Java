import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		*** ***
//		**   **
//		*     *
//		       
//		*     *
//		**   **
//		*** ***
		int n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		int nst = 1;
		while(nst<=n) {
			int cst1;
			int csp;
			int cst2;
			if(nst<=n/2+1) {
				csp =  2*nst-1;
				cst1 = (n-csp)/2;
				cst2 = cst1;
			}
			else {
				csp = (n-nst)*2+1;
				cst1 = (n-csp)/2;
				cst2 = cst1;
			}
			while(cst1>0) {
				System.out.print("*");
				cst1-=1;
			}
			while(csp>0) {
				System.out.print(" ");
				csp-=1;
			}
			while(cst2>0) {
				System.out.print("*");
				cst2-=1;
			}
			nst+=1;
			System.out.println();
		}
		
	}

}
