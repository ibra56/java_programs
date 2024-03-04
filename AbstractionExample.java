public class AbstractionExample {
    public static void main(String[] args){
        Shape rectangle = new Rectangle(3,10);
        Shape circle = new Circle(4);
        Shape triangle = new Triangle(4,5);
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}
