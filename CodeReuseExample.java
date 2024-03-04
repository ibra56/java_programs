public class CodeReuseExample {
    public static void main(String[] args){
        Vehicle motorcycle = new Motorcycle("Toyota","2020");
        Vehicle car = new Car("2023","Subaru");

        motorcycle.start();
        motorcycle.stop();



        car.start();
        car.stop();
    }
}
