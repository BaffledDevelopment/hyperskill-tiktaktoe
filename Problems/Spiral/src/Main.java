import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int currentNumber = 1;

        int[][] matrix = new int[n][n];

        int rowCount = 0;
        int rowCountEndPoint = n;
        int columnCountStartPoint = 0;
        int columnCountEndPoint = n;

        while (rowCount < rowCountEndPoint && columnCountStartPoint < columnCountEndPoint) {

            for (int i = columnCountStartPoint; i < columnCountEndPoint; ++i) {
                matrix[rowCount][i] = currentNumber;
                currentNumber += 1;
            }
            rowCount += 1;

            for (int i = rowCount; i < rowCountEndPoint; ++i) {
                matrix[i][columnCountEndPoint - 1] = currentNumber;
                currentNumber += 1;
            }
            columnCountEndPoint -= 1;

            if (rowCount < rowCountEndPoint) {
                for (int i = columnCountEndPoint - 1; i >= columnCountStartPoint; --i) {
                    matrix[rowCountEndPoint - 1][i] = currentNumber;
                    currentNumber += 1;
                }
                rowCountEndPoint -= 1;
            }
            if (columnCountStartPoint < columnCountEndPoint) {
                for (int i = rowCountEndPoint - 1; i >= rowCount; --i) {
                    matrix[i][columnCountStartPoint] = currentNumber;
                    currentNumber += 1;
                }
                columnCountStartPoint += 1;
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