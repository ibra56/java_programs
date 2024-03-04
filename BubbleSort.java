public class BubbleSort {
    public static void main(String[] args){
        int[] numbers = {22,60,31,42,80};
        int n = numbers.length;
        for (int i=0; i<n; i++){
            for (int j=0; j < n-i-1; j++){
                if (numbers[j] > numbers[j+1]){
//                  Swap the numbers
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                    
                }

            }
            System.out.println(numbers[i]);
        }
    }
}
