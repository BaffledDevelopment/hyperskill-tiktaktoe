import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String[][] matrix = new String[n][n];


        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {

                matrix[i][j] = ".";

                if (i == j) {
                    matrix[i][j] = "*";
                } else if (i == n-j-1) {
                    matrix[i][j] = "*";
                } else if (j == n / 2) {
                    matrix[i][j] = "*";
                } else if (i == n / 2) {
                    matrix[i][j] = "*";
                }

            }
        }

        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}