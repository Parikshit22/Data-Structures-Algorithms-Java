
public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,7,4,2,8,89,2,0};
		
		mergeSort(arr,0,arr.length-1);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void merge(int[] arr,int s,int mid,int e) {
		 int l = mid - s +1;
		 int r = e-mid;
		 
		 int[] left = new int[l];
		 int[] right = new int[r];
		 
		 for(int i=0;i<l;i++) {
			 left[i] = arr[i+s];
		 }
		 
		 for(int i=0;i<r;i++) {
			 right[i] = arr[i+mid+1];
		 }
		 
		 int i=0;
		 int j=0;
		 int k = s;
		 while(i<l && j<r) {
			 if(left[i]<right[j]) {
				 arr[k] = left[i];
				 i++;
			 }
			 else {
				 arr[k] = right[j];
				 j++;
			 }
			 k++;
		 }
		 while(i<l) {
			 arr[k] = left[i];
			 i++;
			 k++;
		 }
		 
		 while(j<r) {
			 arr[k] = right[j];
			 j++;
			 k++;
		 }
	}
	
	public static void mergeSort(int [] arr,int s, int e) {
		
		if(s<e) {
			
		
		
		int mid = (s+e)/2;
		
		mergeSort(arr,s,mid);
		mergeSort(arr,mid+1,e);
		merge(arr,s,mid,e);}
		
	}
	

}
