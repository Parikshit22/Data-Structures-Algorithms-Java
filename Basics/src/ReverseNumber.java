import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int r = 0;
		while(n>0) {
			r = r*10;
			r += n%10;
			n = n/10;
		}
		System.out.println(r);
	}
}
