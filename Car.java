public class Car extends Vehicle{
    public Car(String make, String model){
        super(model, make);
    }
    @Override
    public void start() {
        System.out.println("Car started.");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped.");
    }

    @Override
    void description() {
        super.description();
        System.out.println("More specifically, this is a car.");
    }
}
