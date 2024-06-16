/*Given an array nums of positive integers of size N. Find all distinct digits present in nums.
 
Example 1:
Input: nums = [131, 11, 48]
Output: 1 3 4 8
Explanation: 1, 3, 4, and 8 are only distinct
digits that can be extracted from the numbers
of the array. */

import java.util.ArrayList;
import java.util.Arrays;

public class DistinctElements {
    public static void main(String[] args) {
        int[] arr = { 131, 11, 48 };
        // To store a value only once without repeating elements we use arraylist.
        ArrayList<Integer> ans = new ArrayList<>();
        for (int n : arr) {
            while (n > 0) {
                int rem = n % 10;
                if (!ans.contains(rem)) {
                    ans.add(rem);
                }
                n = n / 10;
            }
        }
        int[] a = new int[ans.size()];
        for (int i = 0; i < a.length; i++) {
            a[i] = ans.get(i);
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

    }
}