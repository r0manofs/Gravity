public class Gravity extends MatrixIn {
    int[][] OutMatrix = gravity(x, y);

    private int[][] gravity(int x, int y) {

        int[][] gravityMatrix = new int[x][y];

        for (int i = 1; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (enteredMatrix[i][j] == 0 && enteredMatrix[i - 1][j] == 1) {         // правила гравитации

                    gravityMatrix[i][j] = 1;
                    gravityMatrix[i - 1][j] = 0;
                }
            }
        }
        return gravityMatrix;
    }
}
