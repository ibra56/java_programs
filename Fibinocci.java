public class Fibinocci {
    public static void main(String[] args){
//        Number of Fibinocci numbers to print
        int n = 12;
        int t1 = 0;
        int t2 = 1;
//        Keeping track on the numbers being printed
        int count = 1;

        System.out.print("First "+ n + " Fibonacci numbers " + t1  +"," + t2);

        while (count < n -2){
            int sum = t1 + t2;
            System.out.print(","+ sum);
            t1 = t2;
            t2 = sum;
            count++;
        }
    }
}
