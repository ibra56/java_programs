public class LinearSearch {
    public static void main(String[] args){
        int[] numbers = {10,20,30,40};
        int valueToFind = 30;
        boolean found = false;

        for (int num : numbers){
           if (num == valueToFind){
               found = true;
           }
        }
        if (found){
            System.out.println(valueToFind + " was found");
        }else {
            System.out.println(valueToFind + " was not found in array");
        }
    }
}
