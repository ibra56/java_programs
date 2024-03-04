public class Circle extends Shape implements ModifiableShape{
    private  double  radius;
    public String color;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }


    @Override
    public void draw() {
        System.out.println("Drawing a Circle with radius " + radius + " and color " + color);
    }

    @Override
    public void setSize(double width, double height) {
        this.radius =Math.max(width,height)/2;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}
