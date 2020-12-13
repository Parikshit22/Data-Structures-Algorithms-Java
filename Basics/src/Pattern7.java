import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		   *   
//		   ***  
//		  ***** 
//		 *******
//		  ***** 
//		   ***  
//		    *
		int n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		int nst = 1;
		while(nst<=n) {
			int cst;
			int csp1;
			int csp2;
			if(nst<=n/2+1) {
				cst =  2*nst-1;
				csp1 = (n-cst)/2;
				csp2 = csp1;
			}
			else {
				cst = (n-nst)*2+1;
				csp1 = (n-cst)/2;
				csp2 = csp1;
			}
			while(csp1>0) {
				System.out.print(" ");
				csp1-=1;
			}
			while(cst>0) {
				System.out.print("*");
				cst-=1;
			}
			while(csp2>0) {
				System.out.print(" ");
				csp2-=1;
			}
			nst+=1;
			System.out.println();
		}
		
		
	}

}
