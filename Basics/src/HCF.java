import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		
		while(a%b!=0) {
			int rem = a%b;
			a = b;
			b = rem;
		}
		System.out.println(b);
	}

}
