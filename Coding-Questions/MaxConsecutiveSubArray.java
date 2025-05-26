

/*
 Maximum Consecutive Subarray

Given a binary array (containing only 0s and 1s), find the length of the longest consecutive subarray of the same digit. If no such subarray exists, print "No subarray found".

Example Input: [1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1]
Example Output: 4

 */


public class MaxConsecutiveSubArray {

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1};

        if (arr.length == 0) {
            System.out.println("No subarray found");
            return;
        }

        int maxLen = 1;
        int currLen = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                currLen++;
                maxLen = Math.max(maxLen, currLen);
            } else {
                currLen = 1;
            }
        }

        System.out.println(maxLen);
    }
}

