import java.util.Scanner;

public class TrafficLightSystem {
    public  static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Traffic Light Color(Red,Green,Yellow)");
        String color = scanner.nextLine().trim().toLowerCase();

        switch (color){
            case "red":
                System.out.println("Stop");
                break;
            case "green":
                System.out.println("Go");
                break;
            case "yellow":
                System.out.println("Prepare to move");
            default:
                System.out.println("Invalid color entered");
        }
        scanner.close();

    }
}
