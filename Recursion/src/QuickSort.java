
public class QuickSort {

	public static int findPivot(int[] arr,int s,int e) {
		
		int ptval = arr[e];
		
		int i = s-1;
		for(int j = s;j<e;j++) {
			if(arr[j]<ptval) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[e];
		arr[e] = temp;
		return i+1;
		
	}
	
	public static void sort(int[] arr,int s,int e) {
		if(s<e) {
			int pivot = findPivot(arr,s,e);
			
			sort(arr,s,pivot-1);
			sort(arr,pivot+1,e);
			
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,2,9,3,7,1,8,6,5};
		sort(arr,0,8);
		for(int i=0;i<=8;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	

}
