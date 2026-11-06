
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class VisitorTest {

    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Square(4),
                new Triangle(6, 3)
        };

        String descriptions = getOutput(
                shapes, new DescriptionVisitor()
        );

        check(descriptions.contains("Circle with radius: 5.0"),
                "Circle description");
        check(descriptions.contains("Square with side: 4.0"),
                "Square description");
        check(descriptions.contains(
                        "Triangle with base: 6.0 and height: 3.0"),
                "Triangle description");

        String areas = getOutput(
                shapes, new AreaCalculatorVisitor()
        );

        check(areas.contains("Circle area: " + (Math.PI * 25)),
                "Circle area");
        check(areas.contains("Square area: 16.0"),
                "Square area");
        check(areas.contains("Triangle area: 9.0"),
                "Triangle area");

        System.out.println("All 6 tests passed!");
    }

    private static String getOutput(Shape[] shapes,
                                    ShapeVisitor visitor) {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream original = System.out;

        try {
            System.setOut(new PrintStream(output));

            for (Shape shape : shapes) {
                shape.accept(visitor);
            }
        } finally {
            System.setOut(original);
        }

        return output.toString();
    }

    private static void check(boolean condition, String name) {
        if (!condition) {
            throw new AssertionError("FAIL: " + name);
        }
        System.out.println("PASS: " + name);
    }
}
