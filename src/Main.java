public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {8, 1, 6},
                {3, 5, 7},
                {4, 9, 2}
        };

        if (isMagicSquare(matrix)) {
            System.out.println("Матрица является магическим квадратом");
        } else {
            System.out.println("Матрица не является магическим квадратом");
        }
    }

    public static boolean isMagicSquare(int[][] matrix) {
        int[] rowSums = new int[3];
        int[] colSums = new int[3];
        int diagSum1 = 0;
        int diagSum2 = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                rowSums[i] += matrix[i][j];
                colSums[j] += matrix[i][j];
            }
            diagSum1 += matrix[i][i];
            diagSum2 += matrix[i][2 - i];
        }

        int targetSum = rowSums[0];

        for (int i = 1; i < 3; i++) {
            if (rowSums[i] != targetSum || colSums[i] != targetSum) {
                return false;
            }
        }

        return diagSum1 == targetSum && diagSum2 == targetSum;
    }

        }








