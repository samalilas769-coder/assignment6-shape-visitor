public class Main {
    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(5),
                new Square(4),
                new Triangle(6, 3)
        };

        ShapeVisitor areaVisitor = new AreaCalculatorVisitor();
        ShapeVisitor descriptionVisitor = new DescriptionVisitor();

        System.out.println("=== Shape Descriptions ===");
        for (Shape shape : shapes) {
            shape.accept(descriptionVisitor);
        }

        System.out.println("\n=== Shape Areas ===");
        for (Shape shape : shapes) {
            shape.accept(areaVisitor);
        }
    }
}