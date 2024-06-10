
// Problem Statement –
// A chocolate factory is packing chocolates into the packets. The chocolate packets here represent an array  of N number of integer values. The task is to find the empty packets(0) of chocolate and push it to the end of the conveyor belt(array).
// Example 1 :
// N=8 and arr = [4,5,0,1,9,0,5,0].
// There are 3 empty packets in the given set. These 3 empty packets represented as O should be pushed towards the end of the array
// Input : 8  – Value of N
// [4,5,0,1,9,0,5,0] – Element of arr[O] to arr[N-1],While input each element is separated by newline
// Output: 4 5 1 9 5 0 0 0
import java.util.Arrays;
import java.util.Scanner;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.println("Enter the size of an array");
        N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0; // it's used to add non-zeros to the array first and count non-zeros.
        for (int k = 0; k < N; k++) {
            if (arr[k] != 0) {
                arr[count++] = arr[k];
            }
        }
        for (int c = count; c < N; c++) {
            arr[c] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }

}