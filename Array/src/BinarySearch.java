import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println(binarySearch(arr,5,0,n-1));
		
	}
	
	public static int binarySearch(int[] arr,int val,int s,int e) {
		int mid = (e+s)/2;
		if(arr[mid]==val) {
			return mid;
		}
		else if(arr[mid]>val) {
			return binarySearch(arr,val,s,mid-1);
		}
		else if(arr[mid]<val) {
			return binarySearch(arr,val,mid+1,e);
		}
		
		return -1;
		
	}

}
