import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N <= 0) {
            System.out.println("Invalid Input!");
        }
        int product = 1;
        while (N != 0) {
            product = product * (N % 10);
            N = N / 10;
        }
        System.out.println(product);
    }
}
