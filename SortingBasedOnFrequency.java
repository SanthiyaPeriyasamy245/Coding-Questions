import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class SortingBasedOnFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Test = sc.nextInt(); // No of test cases.
        int size = sc.nextInt(); // Size of Array.
        for (int i = 0; i < Test; i++) {
            int[] arr = new int[size];
            for (int j = 0; j < size; j++) {
                // Array elements.
                // sample : [5,5,4,6,4]
                arr[j] = sc.nextInt();
            }
            HashMap<Integer, Integer> map = new HashMap<>(); // to store key as a value and value as a frequency.
            for (int k = 0; k < size; k++) {
                map.put(arr[k], map.getOrDefault(arr[k], 0) + 1); // {5,2} {4,2} {6,1}
            }
            int max = Integer.MIN_VALUE;
            for (int x : map.keySet()) { // finding the maximum frequency.
                if (map.get(x) > max) {
                    max = map.get(x); // get the key check the values of it kety is like a index so the max
                                      // frequency would be 2.for our sample array.
                }
            }

            ArrayList<Integer> list = new ArrayList<>();
            while (max > 0) {
                ArrayList<Integer> list2 = new ArrayList<>(); // it will hold the result.
                for (int l : map.keySet()) {
                    if (map.get(l) == max) {
                        for (int k = 0; k < max; k++) {
                            list2.add(l); // it will hold the data which all are in the max frequncy and so on and
                                          // stored in list2.
                        }
                    }
                }
                Collections.sort(list2); // if there are more than one number which has same frequency smallest value
                                         // should be at first so it's shorted.
                list.addAll(list2);
                max--;

            }
            System.out.println(list);
        }

    }
}