
/*Given an array A of positive integers. Your task is to sort them in such a way that the first part of the array contains odd numbers sorted in descending order, rest portion contains even numbers sorted in ascending order.

Example 1:Input:N = 7
Arr = {1, 2, 3, 5, 4, 7, 10}
Output:7 5 3 1 2 4 10
Explanation:Array elements 7 5 3 1 are oddand sorted in descending order,whereas 2 4 10 are even numbers and sorted in ascending order. */
import java.util.*;

public class SortOddEven {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1, 8, 3, 6 };
        ArrayList<Integer> odd = new ArrayList<>(); // store odd values.
        ArrayList<Integer> even = new ArrayList<>(); // store even values.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                odd.add(arr[i]);
            } else {
                even.add(arr[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd, Collections.reverseOrder());
        int index = 0;
        for (int n : odd) {
            arr[index] = n;
            index++;
        }
        for (int x : even) {
            arr[index] = x;
            index++;
        }
        System.out.println(Arrays.toString(arr));

    }
}
