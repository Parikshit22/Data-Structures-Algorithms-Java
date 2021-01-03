import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i=1;i<n;i++) {
			int val = arr[i];
			int j= i-1;
			for(;j>=0;j--) {
				if(arr[j]>val) {
					arr[j+1] = arr[j];
				}
				else {
					break;
				}
			}
			arr[j+1] = val;
			
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
