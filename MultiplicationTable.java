import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the multiplication table: ");
        int maxNum = scanner.nextInt();

        int[][] table = new int[maxNum + 1][maxNum + 1];

        for (int i = 1; i <= maxNum; i++) {
            for (int j = 1; j <= maxNum; j++) {
                table[i][j] = i * j;
            }
        }

        System.out.println("Multiplication Table:");
        for (int i = 1; i <= maxNum; i++) {
            for (int j = 1; j <= maxNum; j++) {
                System.out.printf("%4d", table[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}
