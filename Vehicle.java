abstract class Vehicle {
    private String model;
    private String make;

    public Vehicle(String model, String make){
        this.make = make;
        this.model = model;
    }
    public  abstract void start();
    public  abstract  void stop();

    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    void description(){
        System.out.println("This is a generic vehicle.");
    }
}
