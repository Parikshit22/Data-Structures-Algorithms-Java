import java.util.Scanner;

public class Pattren3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	       *
//	       **
//	      ***
//	     ****
//	    *****
//	   ******
//	  *******
//	 ********
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int nst = 1;
		while(nst<=n) {
			int cst = nst;
			while(n-cst>0) {
				System.out.print(" ");
				cst+=1;
			}
			cst = nst;
			while(cst>0) {
				System.out.print("*");
				cst-=1;
			}
			System.out.println();
			nst+=1;
		}
	}

}
