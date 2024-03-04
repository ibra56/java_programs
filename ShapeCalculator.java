import java.util.List;

public class ShapeCalculator {
    public  static double calculateTotalArea(List<Shape> shapes){
        double totalArea = 0.0;
        for (Shape shape : shapes){
            totalArea+= shape.calculateArea();
        }
        return totalArea;
    }
}
