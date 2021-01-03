import java.util.Scanner;

public class LowerBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		int val = scan.nextInt();
		for(int i=0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println(lowerBound(arr,0,n-1,val,-1));
		
	}
	
	static int lowerBound(int arr[],int s,int e,int val,int ans) {
		if(s>e) {
			return ans;
		}
		int mid = (s+e)/2;
		if(arr[mid]==val) {
			return lowerBound(arr,s,mid-1,val,mid);
		}
		else if(arr[mid]>val) {
			return lowerBound(arr,s,mid-1,val,ans);
		}
		else if(arr[mid]<val) {
			return lowerBound(arr,mid+1,e,val,ans);
		}
		return ans;
	}

}
