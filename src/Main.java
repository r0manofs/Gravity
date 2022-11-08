import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите где будут ящики(ящик будет там где будет 1): ");
        Scanner mainScanner = new Scanner(System.in);

        MatrixIn inputMatrix = new MatrixIn();
        Print(inputMatrix.enteredMatrix);

        System.out.println("Включить гравитацию?(д/н): ");

        String question = mainScanner.next();

        if (question.contains("д") || question.contains("y")) {

            Gravity normalGravity = new Gravity();
            Print(normalGravity.OutMatrix );


        } else if (question.contains("н") || question.contains("n")) {
            System.out.println("Fuck u asshole!");

        }
    }

    public static void Print(int[][] matrix) {

        String[][] BoxMatrix = new String[3][4];
        final String box = "■";
        final String empty = " ";

        for (int i = 0; i < 3; i++) {       //ввод матрицы и преобразование в квадратики
            for (int j = 0; j < 4; j++) {
                if (matrix[i][j] == 1) {
                    BoxMatrix[i][j] = box;

                } else {
                    BoxMatrix[i][j] = empty;
                }
            }
        }

        System.out.println(" ________ ");

        for (String row[] : BoxMatrix) {
            System.out.print("|");
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.print("|\n");
        }
        System.out.println(" ‾‾‾‾‾‾‾‾ ");

    }
}
