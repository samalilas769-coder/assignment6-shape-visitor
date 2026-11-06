public class DescriptionVisitor implements ShapeVisitor {

    @Override
    public void visit(Circle circle) {
        System.out.println("Circle with radius: " + circle.getRadius());
    }

    @Override
    public void visit(Square square) {
        System.out.println("Square with side: " + square.getSide());
    }

    @Override
    public void visit(Triangle triangle) {
        System.out.println("Triangle with base: " + triangle.getBase()
                + " and height: " + triangle.getHeight());
    }
}