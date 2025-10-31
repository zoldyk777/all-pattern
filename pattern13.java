import java.util.Scanner;

public class pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j);
            }

            for (int j = 0; j < i * 2; j++) {
                System.out.print(" ");
            }

            for (int j = n - i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j);
            }

            for (int j = 0; j < i * 2; j++) {
                System.out.print(" ");
            }

            for (int j = n - i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
