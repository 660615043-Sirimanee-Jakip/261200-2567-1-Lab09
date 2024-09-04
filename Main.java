public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Attempt to create 2 Circles
        Shape shape1 = shapeFactory.getShape(ShapeFactory.TYPE_CIRCLE);
        if (shape1 != null) shape1.draw();

        Shape shape2 = shapeFactory.getShape(ShapeFactory.TYPE_CIRCLE);
        if (shape2 != null) shape2.draw();

        // Attempt to create 2 Squares
        Shape shape3 = shapeFactory.getShape(ShapeFactory.TYPE_SQUARE);
        if (shape3 != null) shape3.draw();

        Shape shape4 = shapeFactory.getShape(ShapeFactory.TYPE_SQUARE);
        if (shape4 != null) shape4.draw();

        // Attempt to create 2 Rectangles
        Shape shape5 = shapeFactory.getShape(ShapeFactory.TYPE_RECTANGLE);
        if (shape5 != null) shape5.draw();

        Shape shape6 = shapeFactory.getShape(ShapeFactory.TYPE_RECTANGLE);
        if (shape6 != null) shape6.draw(); // This will not create a shape, since the total limit is 5.
    }
}