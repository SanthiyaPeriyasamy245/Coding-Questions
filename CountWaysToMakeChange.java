public class CountWaysToMakeChange {

	public static long countWaysToMakeChange(int denominations[], int value){
		long[] change = new long[value + 1];
		change[0] = 1;  // base case

		for(int coin : denominations) {
			for(int i = coin; i <= value; i++) {
				change[i] += change[i - coin];
			}
		}

		return change[value];		
	}
}
