import java.util.Scanner;

public class UpperBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		int val = scan.nextInt();
		for(int i=0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println(upperBound(arr,0,n-1,val,-1));
		
	}
	
	static int upperBound(int arr[],int s,int e,int val,int ans) {
		if(s>e) {
			return ans;
		}
		int mid = (s+e)/2;
		if(arr[mid]==val) {
			return upperBound(arr,mid+1,e,val,mid);
		}
		else if(arr[mid]>val) {
			return upperBound(arr,s,mid-1,val,ans);
		}
		else if(arr[mid]<val) {
			return upperBound(arr,mid+1,e,val,ans);
		}
		return ans;
	}

}
