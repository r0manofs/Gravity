import java.util.Scanner;

public class MatrixIn extends Matrix {
    int[][] enteredMatrix = matrixIn(x, y);
    int[][] outMatrix = gravity(x, y);

    public static int[][] matrixIn(int x, int y) {

        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[x][y];

        int min = 0;
        int max = 1;        // для рандома/временно

        for (int i = 0; i < x; i++) {       //ввод матрицы
            for (int j = 0; j < y; j++) {

                matrix[i][j] = min + (int) (Math.random() * ((max - min) + 1));

            }
        }
        return matrix;
    }

    public int[][] gravity(int x, int y) {

        int[][] gravityMatrix = enteredMatrix;
        for (int a = 0; a < x; a++) {

            for (int i = x - 1; i > 0; i--) {
                for (int j = 0; j < y; j++) {
                    if (enteredMatrix[i][j] == 0 && enteredMatrix[i - 1][j] == 1) {         // правила гравитации

                        gravityMatrix[i][j] = 1;
                        gravityMatrix[i - 1][j] = 0;
                    }
                }
            }
        }//переход к следующему столбцу
        return gravityMatrix;
    }
}