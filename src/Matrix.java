public abstract class Matrix {
    final static int x = 10;
    final static int y = 40;

    public static void print(int[][] matrix) {

        String[][] boxMatrix = new String[x][y];
        final String box = "■";
        final String empty = " ";

        for (int i = 0; i < x; i++) {       //ввод матрицы и преобразование в квадратики
            for (int j = 0; j < y; j++) {
                if (matrix[i][j] == 1) {
                    boxMatrix[i][j] = box;

                } else {
                    boxMatrix[i][j] = empty;
                }
            }
        }

        System.out.print(" ");
        for (int i = 0; i < y; i++) {       //верхняя рамка
            System.out.print("__");
        }
        System.out.println();

        for (String row[] : boxMatrix) {     //вывод элементов и боковые рамки
            System.out.print("|");
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.print("|\n");
        }

        System.out.print(" ");
        for (int i = 0; i < y; i++) {       //нижняя рамка
            System.out.print("‾‾");
        }
        System.out.println();

    }
}

