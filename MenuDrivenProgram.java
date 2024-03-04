import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        int choice;

            // Print out the menu
            System.out.println("\\nMenu:");
            System.out.println("1. Calculator");
            System.out.println("2. Conversion Tools");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

        switch (choice) {
            case 1 -> System.out.println("Calculator chosen!");

            case 2 -> System.out.println("Conversion tools chosen!");

            case 3 -> System.out.println("Exiting the program. Goodbye!");
            default -> System.out.println("Invalid choice! Please select from the menu.");
        }

        scanner.close();
    }
}
