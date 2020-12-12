import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n==2) {
			System.out.println("Not Prime");
			return;
		}
		boolean flag =false ;
		for(int i = 2;i<n;i++) {
			if(n%i==0) {
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.println("Not Prime");
		}
		else {
			System.out.print("Prime");
		}
	}

}
