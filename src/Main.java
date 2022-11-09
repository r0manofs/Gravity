import java.util.Scanner;

public class Main extends Matrix{
    public static void main(String[] args) {
        System.out.println("Введите где будут ящики(ящик будет там где будет 1): ");

        MatrixIn matrix = new MatrixIn();
        print(matrix.enteredMatrix);


        System.out.print("Включить гравитацию?(д/н): ");

        Scanner mainScanner = new Scanner(System.in);
        String question = mainScanner.next();

        if (question.contains("д") || question.contains("y")) {
                    print(matrix.outMatrix);

        } else if (question.contains("н") || question.contains("n")) {
                    System.out.println("Fuck u asshole!");

        }
    }
}
