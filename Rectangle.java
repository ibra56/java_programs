public class Rectangle extends Shape{
    private final double length;
    private final double height;
    public Rectangle(double length, double height){
        this.height = height;
        this.length = length;
    }
    @Override
    public double calculateArea() {
        return length * height;
    }
}
