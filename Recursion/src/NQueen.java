
public class NQueen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] arr = new char[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				arr[i][j] = '0';
			}
		}
		 prin(arr,5,0);
	}
	
	public static boolean isPossible(char [][] arr,int n,int r,int c) {
		
		for(int i=r;i>=0;i--) {
			if(arr[i][c]=='Q') {
				return false;
			}
		}
		
		for(int i=r,j=c; i>=0&&j<n;i--,j++) {
			if(arr[i][j]=='Q') {
				return false;
			}
		}
		for(int i=r,j=c; i>=0&&j>=0;i--,j--) {
			if(arr[i][j]=='Q') {
				return false;
			}
		}
		return true;
	}
	
	public static void prin(char[][] arr,int n,int r) {
		
		if(r==n) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println();
			return;
		}
		
		for(int i=0;i<n;i++) {
			if(isPossible(arr,n,r,i)) {
				arr[r][i] = 'Q';
				prin(arr,n,r+1);
				arr[r][i] = '0';
			}
		}
		
		return;
	}

}
