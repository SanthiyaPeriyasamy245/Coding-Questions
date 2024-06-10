
// Problem Statement –
// Joseph is learning digital logic subject which will be for his next semester. He usually tries to solve unit assignment problems before the lecture. Today he got one tricky question. The problem statement is “A positive integer has been given as an input. Convert decimal value to binary representation. Toggle all bits of it after the most significant bit including the most significant bit. Print the positive integer value after toggling all bits”.
// Constrains-1<=N<=100
//  Example 1:Input : 10  -> Integer
//  Output : 5    -> result- Integer
import java.util.Scanner;

public class ToggleBinValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        int ans = 0;
        int base = 2;
        int pow = 0;
        N = sc.nextInt();
        while (N != 0) {
            ans = ans + (((N & 1)) ^ 1) * (int) Math.pow(base, pow);
            pow++;
            N = N >> 1;
        }
        System.out.println(ans);

    }
}
