import java.util.Scanner;

public class AnyBaseToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		int b = scan.nextInt();
		int val = 0;
		int i = 0;
		while(n>0) {
			int rem = n%10;
			val+=rem*Math.pow(b, i);
			i++;
			n = n/10;
		}
		System.out.println(val);
	}

}
