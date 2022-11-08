import java.util.Scanner;

public class MatrixIn extends Matrix {
    int[][] enteredMatrix = MatrixIn(x, y);

    public static int[][] MatrixIn(int x, int y) {

        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[x][y];

        for (int i = 0; i < x; i++) {       //ввод матрицы и преобразование в квадратики
            for (int j = 0; j < y; j++) {

                matrix[i][j] = scanner.nextInt();

            }
        }
        return matrix;
    }
}