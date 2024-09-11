import java.util.Scanner;

public class LabSecond {
    static Scanner in = new Scanner(System.in);

    // Метод для введення масиву
    static int[] InputArray() {
        System.out.println("Dimension of the array (even number not more than 200):");
        int n = in.nextInt();
        if (n > 200 || n % 2 != 0) {
            System.out.println("Wrong array size! n must be even and not more than 200.");
            return null;
        }
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            System.out.print("a[" + i + "]= ");
            a[i] = in.nextInt();
        }
        return a;
    }

    // Метод для виведення масиву
    static void PrintArray(int[] a) {
        for (int i = 0; i < a.length; ++i)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    // Метод для підрахунку точок, що належать колу
    static int CountPointsInCircle(int[] a, double r) {
        int count = 0;
        for (int i = 0; i < a.length; i += 2) {
            double distance = Math.sqrt(Math.pow(a[i], 2) + Math.pow(a[i + 1], 2));
            if (distance <= r) {
                count++;
            }
        }
        return count;
    }

    public void run() {
        // Введення радіусу кола
        System.out.print("Enter the radius of the circle r: ");
        double r = in.nextDouble();

        // Введення масиву
        int[] myArray = InputArray();
        if (myArray == null) {
            return; // Якщо масив некоректний, завершити програму
        }

        // Виведення початкового масиву
        System.out.println("Initial Array:");
        PrintArray(myArray);

        // Підрахунок кількості точок, що належать колу
        int pointsInCircle = CountPointsInCircle(myArray, r);
        System.out.println("Number of points belonging to a radius circle " + r + ": " + pointsInCircle);

    }
}
