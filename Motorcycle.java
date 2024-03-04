public class Motorcycle extends Vehicle{
    public Motorcycle(String model, String make){
        super(model, make);
    }
    @Override
    public void start() {
        System.out.println("Motorcycle started.");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stopped.");
    }
}
