package ShapesUtils;

import ShapesUtils.entities.Circle;
import ShapesUtils.entities.Square;

public class ShapeUtils {
    public static void main(String[] args) {

        Circle circle = new Circle(2.3);
        Square square = new Square(1.1,3.6);

        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());
        System.out.println(square.calculateArea());
        System.out.println(square.calculatePerimeter());

    }
}
