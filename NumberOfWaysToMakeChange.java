class NumberOfWaysToMakeChange{
  public static int numberOfWaysToMakeChange(int n, int[] denoms) {
    // Write your code here.
		if (denoms.length == 0 ){
			return -1;
		}
		int [] ways = new int [n + 1];
		ways[0] = 1;
		for (int denom : denoms){
			for(int amount = 1 ; amount < n + 1; amount++){
				if (denom <= amount){
					ways[amount] += ways[amount - denom];
			}
			}
			
		}
		
		
    return ways[n];
  }
}
