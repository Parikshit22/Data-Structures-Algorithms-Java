import java.util.Scanner;

public class DecimalToAnyBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		int b = scan.nextInt();
		int val = 0;
		int i = 0;
		while(n>0) {
			int rem = n%b;
			val+=rem*Math.pow(10, i);
			i++;
			n = n/b;
		}
		System.out.println(val);
	}

}
