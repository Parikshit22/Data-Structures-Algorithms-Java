import java.util.Scanner;

public class NumberPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1
//		1*3
//		1*3*5
//		1*3*5*7
//		1*3*5*7*9
//		7*5*3*1
//		5*3*1
//		3*1
//		1
		
		int n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		int nst = 1;
		while(nst<2*n) {
			int cst;
			if(nst<=n) {
				cst = 2*nst-1;
				int i=1;
				while(i<=cst) {
					if(i%2==0) {
						System.out.print("*");
					}
					else {
						System.out.print(i);
					}
					i++;
				}
			}
			else {
				cst = 2*(2*n-nst)-1;
				int i=1;
				while(i<=cst) {
					if(i%2==0) {
						System.out.print("*");
					}
					else {
						System.out.print(cst-i+1);
					}
					i++;
				}
			}
			nst++;
			System.out.println();
			
		}
	}

}
