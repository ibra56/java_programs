public class Rectangle extends Shape implements ModifiableShape{
    private double width;
    private double height;

    private String color;
    public Rectangle(double width, double height,String color){
        this.height = height;
        this.width = width;
        this.color = color;
    }



    @Override
    public double calculateArea() {
        return width * height;
    }


    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle with dimensions " + width + "x" + height + " and color " + color);
    }

    @Override
    public void setSize(double width, double height) {
        this.width = width;
        this.height = height;

    }

    @Override
    public void setColor(String color) {
        this.color = color;

    }
}
