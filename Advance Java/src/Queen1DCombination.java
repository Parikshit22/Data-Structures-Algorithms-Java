
public class Queen1DCombination {
	public static void queen1DCombination(String[] arr,int lastQueen,int num) {
		
		if(num==0) {
			for(int i=0;i<4;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			return;
		}
		for(int i=0;i<4;i++) {
			if(arr[i].equals("-") && i>lastQueen) {
			arr[i] = "Q";
			queen1DCombination(arr,i,num-1);
			arr[i] = "-";}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = new String[4];
		int nQueen = -1;
		int num = 3;
		for(int i=0;i<4;i++) {
			arr[i] = "-";
		}
		queen1DCombination(arr,nQueen,num);
	}

}
