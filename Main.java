import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args){
//        System.out.println("Hello World");
        Cat myCat = new Cat("black","sleepy","kitty",3);
        System.out.println("This is a "+ myCat.getColor() + " and feels " + myCat.getMood());
        myCat.makeHappy();
        myCat.displayInfo();

        Cat tooby = new Cat("red","unhappy","taddy",4);
        tooby.meow();
        tooby.scratch();

        tooby.displayBehaviour();
        tooby.displayInfo();

        int[] values = {3,5,6,7};
        for (int value : values){
            System.out.println(value);
        }

        // Create instances of Circle and Rectangle
        ModifiableShape circle = new Circle(5.0);
        ModifiableShape rectangle = new Rectangle(4.0, 6.0, "Blue");

        // Modify and draw shapes without knowing their specific implementations
        circle.setSize(8.0, 8.0);
        circle.setColor("Green");
        circle.draw();

        rectangle.setSize(5.0, 7.0);
        rectangle.setColor("Yellow");
        rectangle.draw();


        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5.0));
        shapes.add(new Rectangle(4.0, 6.0,"blue"));

        // Calculate and print the total area using dynamic polymorphism
        double totalArea = ShapeCalculator.calculateTotalArea(shapes);
        System.out.println("Total Area of Shapes: " + totalArea);
    }



    }

