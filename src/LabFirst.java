import java.util.Scanner;

public class LabFirst {
    public void run() {
        Scanner in = new Scanner(System.in);

        // Варіант 1: Вхідні дані дійсного типу, результат — дійсного типу
        System.out.println("Option 1: Enter the values of n and m (real numbers):");
        double n1 = in.nextDouble();
        double m1 = in.nextDouble();
        double result1 = ((n1 + 1) * (n1 - 4) + n1 * m1 - Math.pow(n1, 4) + Math.pow(m1, 3)) / Math.pow((m1 + 2), 2);
        System.out.println("Result (real numbers): " + result1);

        // Варіант 2: Вхідні дані цілого типу, результат — дійсного типу
        System.out.println("Option 2: Enter the values of n and m (integers):");
        int n2 = in.nextInt();
        int m2 = in.nextInt();
        double result2 = ((n2 + 1) * (n2 - 4) + n2 * m2 - Math.pow(n2, 4) + Math.pow(m2, 3)) / Math.pow((m2 + 2), 2);
        System.out.println("Result (real numbers): " + result2);

        // Варіант 3: Вхідні дані дійсного типу, результат — цілого типу
        System.out.println("Option 3: Enter the values of n and m (real numbers):");
        double n3 = in.nextDouble();
        double m3 = in.nextDouble();
        int result3 = (int) (((n3 + 1) * (n3 - 4) + n3 * m3 - Math.pow(n3, 4) + Math.pow(m3, 3)) / Math.pow((m3 + 2), 2));
        System.out.println("Result (integer): " + result3);

        in.close();
    }
}
