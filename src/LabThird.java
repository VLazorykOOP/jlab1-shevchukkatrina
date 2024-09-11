import java.util.Scanner;

public class LabThird {

    // Метод для введення матриці
    static int[][] inputMatrix(int n, Scanner scanner) {
        int[][] matrix = new int[n][n];
        System.out.println("Input array " + n + "x" + n + ":");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Please enter an integer.");
                    scanner.next(); // Очистити невірний ввід
                }
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    // Метод для перевірки, чи рядок збігається зі стовпчиком
    static boolean isRowEqualToColumn(int[][] A, int[][] B, int rowIndex, int colIndex) {
        for (int i = 0; i < A.length; i++) {
            if (A[rowIndex][i] != B[i][colIndex]) {
                return false;
            }
        }
        return true;
    }

    // Метод для створення вектора X
    static int[] createVectorX(int[][] A, int[][] B) {
        int n = A.length;
        int[] X = new int[n];
        for (int i = 0; i < n; i++) {
            if (isRowEqualToColumn(A, B, i, i)) {
                X[i] = 1;
            } else {
                X[i] = 0;
            }
        }
        return X;
    }

    // Метод для виведення вектора
    static void printVector(int[] vector) {
        System.out.print("Vector X: ");
        for (int value : vector) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void run(Scanner scanner) {
        // Введення розміру матриць
        System.out.print("Enter the dimension of the matrix (n <= 15): ");
        int n = scanner.nextInt();
        if (n > 15) {
            System.out.println("The dimension should not exceed 15.");
            return;
        }

        // Введення матриць
        System.out.println("Input array A:");
        int[][] A = inputMatrix(n, scanner);
        System.out.println("Input array B:");
        int[][] B = inputMatrix(n, scanner);

        // Створення та виведення вектора X
        int[] X = createVectorX(A, B);
        printVector(X);
    }
}
