import java.util.Scanner;

public class SummingOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int R = sc.nextInt();
        if (R == 0) {
            System.out.println(0);
        }
        int sum = add(N);
        sum = sum * R;
        while (sum >= 10) {
            sum = add(sum);
        }
        System.out.println(sum);
    }

    public static int add(int N) {
        int sum = 0;
        while (N != 0) {
            sum = sum + (N % 10);
            N = N / 10;
        }
        return sum;
    }

}
