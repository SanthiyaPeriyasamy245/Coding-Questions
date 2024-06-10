import java.util.Scanner;
import java.util.*;

public class SortZerosOnesTwos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int zeros = 0;
        int ones = 0;
        int twos = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0) {
                zeros += 1;
            } else if (arr[i] == 1) {
                ones += 1;
            } else {
                twos += 1;
            }
        }

        for (int i = 0; i < N; i++) {
            while (zeros > 0) {
                arr[i] = 0;
                i++;
                zeros--;
            }
            while (ones > 0) {
                arr[i] = 1;
                i++;
                ones--;
            }
            while (twos > 0) {
                arr[i] = 2;
                i++;
                twos--;
            }

        }
        System.out.println(Arrays.toString(arr));

    }

}
