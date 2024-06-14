
/*Particulate matters are the biggest contributors to Delhi pollution. The main reason behind the increase in the concentration of PMs include vehicle emission by applying Odd Even concept for all types of vehicles. The vehicles with the odd last digit in the registration number will be allowed on roads on odd dates and those with even last digit will on even dates.

Given an integer array a[], contains the last digit of the registration number of N vehicles traveling on date D(a positive integer). The task is to calculate the total fine collected by the traffic police department from the vehicles violating the rules.

Note : For violating the rule, vehicles would be fined as X Rs.

Example 1:

Input :

4 -> Value of N

{5,2,3,7} -> a[], Elements a[0] to a[N-1], during input each element is separated by a new line

12 -> Value of D, i.e. date 

200 -> Value of x i.e. fine

Output :

600  -> total fine collected */
import java.util.Scanner;

public class OddEvenNumberPlate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter vehicles count?");
        int N = sc.nextInt();
        System.out.println("Enter vehicles number");
        int[] arr = new int[N];
        for (int j = 0; j < N; j++) {
            arr[j] = sc.nextInt();
        }
        System.out.println("Enter the date");
        int date = sc.nextInt();
        System.out.println("Enter the fine");
        int fine = sc.nextInt();
        int odd = 0;
        int even = 0;

        for (int i = 0; i < N; i++) {
            if (arr[i] % 2 == 0) {
                even = even + 1;
            } else {
                odd = odd + 1;
            }
        }
        if (date % 2 == 0) {
            if (odd == 0) {
                System.out.println("All the vehicles are followed the  rules!");
            } else {
                System.out.println(odd * fine);
            }

        } else {
            if (even == 0) {
                System.out.println("All the vehicles are followed the rules!");
            } else {
                System.out.println(even * fine);
            }
        }
    }
}
