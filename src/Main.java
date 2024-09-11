import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Choose task:");
        System.out.println("1 - Task 1");
        System.out.println("2 - Task 2");
        System.out.println("3 - Task 3");
        System.out.println("4 - Task 4");
        int choice = in.nextInt();
        in.nextLine();
        if (choice == 1) {
            LabFirst firstTask = new LabFirst();
            firstTask.run();
        } else if (choice == 2) {
            LabSecond secondTask = new LabSecond();
            secondTask.run();
        } else if (choice == 3) {
            LabThird.run(in);
        } else if (choice == 4) {
            LabFourth.run(in); 
        } else {
            System.out.println("Невірний вибір!");
        }

        in.close();
    }
}
