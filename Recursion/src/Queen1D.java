
public class Queen1D {
	
	public static void queen1D(String[] arr,int nQueen,int num) {
		
		if(nQueen>num) {
			for(int i=0;i<4;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			return;
		}
		for(int i=0;i<4;i++) {
			if(arr[i].equals("-")) {
			arr[i] = "Q"+nQueen;
			queen1D(arr,nQueen+1,num);
			arr[i] = "-";}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = new String[4];
		int nQueen = 1;
		int num = 2;
		for(int i=0;i<4;i++) {
			arr[i] = "-";
		}
		queen1D(arr,nQueen,num);
		
	}

}
