public class Triangle extends Shape{
    private final double base;
    private final double height;

    public  Triangle(double base, double height){
        this.height = height;
        this.base = base;
    }
    @Override
    public double calculateArea() {
        return base * height * 0.5;
    }
}
