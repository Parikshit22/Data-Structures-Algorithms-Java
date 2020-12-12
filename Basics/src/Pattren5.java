import java.util.Scanner;

public class Pattren5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		*
//		**
//		***
//		****
//		*****
//		****
//		***
//		**
//		*
		int n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		int nst = 1;
		
		while(nst<2*n) {
			int cst;
			if(nst<=n) {
				cst = nst;
			}
			else {
				cst = 2*n-nst;
			}
			while(cst>0) {
				System.out.print("*");
				cst-=1;
			}
			
			System.out.println();
			nst+=1;
		}
	}

}
