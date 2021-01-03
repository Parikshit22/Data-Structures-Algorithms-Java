import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			int min = arr[i];
			int index = i;
			for(int j=i;j<n;j++) {
				if(min>arr[j]) {
					min = arr[j];
					index = j;
				}
			}
			if(i!=index) {
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
