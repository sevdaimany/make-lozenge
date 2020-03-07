import java.util.Scanner;

public class Lozi {

    void printLozi(int k, int n) {

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            if (i < k) {
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }

            } else {
                for (int j = 0; j < k; j++) {
                    System.out.print("*");
                }

                for (int j = 0; j < 2 * (i - k) + 1; j++) {
                    System.out.print(" ");
                }

                for (int j = 0; j < k; j++) {
                    System.out.print("*");
                }
            }
            System.out.print("\r\n");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }

            if (i < n - k) {
                for (int j = 0; j < k; j++) {
                    System.out.print("*");
                }

                for (int j = 0; j < 2 * (n - i - k) - 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < k; j++) {
                    System.out.print("*");
                }

            } else {
                for (int j = 0; j < 2 * (n - i) - 1; j++) {
                    System.out.print("*");
                }

            }
            System.out.print("\r\n");

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        Lozi check = new Lozi();
        check.printLozi(k, n);
    }
}