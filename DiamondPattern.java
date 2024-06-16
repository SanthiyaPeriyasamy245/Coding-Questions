public class DiamondPattern {
    public static void main(String[] args) {
        int N = 4;
        int space = 3;
        for (int i = 0; i < N; i++) {
            for (int k = i; k < space; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= N - i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}