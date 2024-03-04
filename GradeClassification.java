import java.util.Scanner;

public class GradeClassification {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the students score:(1 - 100)");
        int score = scanner.nextInt();

        if (score >= 90 && score <=100){
            System.out.println("Grade A");
        } else if (score >= 80 && score < 90) {
            System.out.println("Grade B");
        } else if (score >=70 && score <80) {
            System.out.println("Grade C");
        } else if (score >=60 && score < 70) {
            System.out.println("D");
        } else if (score >=0 && score < 60) {
            System.out.println("F");
        }else {
            System.out.println("Invalid Score Entered");
        }
        scanner.close();

    }
}
