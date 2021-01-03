
public class CoinChange {

	public static void coinChange(int[] coinType,int curr,int idx,int sum,String coins) {
		if(curr>sum) {
			return;
		}
		if(curr==sum) {
			System.out.println(coins);
		}
		
		for(int i=0;i<4;i++) {
			if(i>=idx) {
			coinChange(coinType,curr+coinType[i],i,sum,coins+coinType[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coinType = {2,3,5,6};
		
		coinChange(coinType,0,0,10,"");
		
	}

}
