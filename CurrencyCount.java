/*Given an amount, find the minimum number of notes of different denominations that sum up to the given amount. Starting from the highest denomination note, try to accommodate as many notes as possible for a given amount.
We may assume that we have infinite supply of notes of values {2000, 500, 200, 100, 50, 20, 10, 5, 1} 
Examples: 
 

Input : 800
Output : Currency  Count 
         500 : 1
         200 : 1
         100 : 1 */
public class CurrencyCount {
    public static void main(String[] args) {
        int N = 5000;
        int[] arr = { 2000, 500, 200, 100, 50, 20, 10, 5, 1 };
        int[] ans = new int[9];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (N <= 0) {
                break;
            }
            if (N >= arr[i]) {
                int count = N / arr[i];
                ans[index] = count;
                N = N % arr[i];
                index++;
            }

        }
        for (int j = 0; j < ans.length; j++) {
            if (ans[j] != 0) {
                System.out.println(arr[j] + " : " + ans[j]);
            }
        }

    }
}