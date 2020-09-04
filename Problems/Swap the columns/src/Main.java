
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];
        // int[][] newMatrix = new int [n][m];

        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int indexToSwap = scanner.nextInt();
        int indexSwapSecond = scanner.nextInt();

        for (int i = 0; i < matrix.length; ++i) {
            int tempSwap = matrix[i][indexToSwap];
            matrix[i][indexToSwap] = matrix[i][indexSwapSecond];
            matrix[i][indexSwapSecond] = tempSwap;

        }

        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}