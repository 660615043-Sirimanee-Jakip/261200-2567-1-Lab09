public class ShapeFactory {
    public static final int TYPE_CIRCLE = 0;
    public static final int TYPE_RECTANGLE = 1;
    public static final int TYPE_SQUARE = 2;

    private static final int MAX_SHAPES = 5;
    private static final int MAX_EACH_SHAPE = 2;

    private int circleCount = 0;
    private int rectangleCount = 0;
    private int squareCount = 0;
    private int totalShapes = 0;

    public Shape getShape(int shapeType) {
        if (totalShapes >= MAX_SHAPES) {
            System.out.println("Cannot create more shapes. Limit of " + MAX_SHAPES + " reached.");
            return null;
        }

        switch (shapeType) {
            case TYPE_CIRCLE:
                if (circleCount < MAX_EACH_SHAPE) {
                    circleCount++;
                    totalShapes++;
                    return new Circle();
                } else {
                    System.out.println("Cannot create more Circles. Limit of " + MAX_EACH_SHAPE + " reached.");
                    return null;
                }
            case TYPE_RECTANGLE:
                if (rectangleCount < MAX_EACH_SHAPE) {
                    rectangleCount++;
                    totalShapes++;
                    return new Rectangle();
                } else {
                    System.out.println("Cannot create more Rectangles. Limit of " + MAX_EACH_SHAPE + " reached.");
                    return null;
                }
            case TYPE_SQUARE:
                if (squareCount < MAX_EACH_SHAPE) {
                    squareCount++;
                    totalShapes++;
                    return new Square();
                } else {
                    System.out.println("Cannot create more Squares. Limit of " + MAX_EACH_SHAPE + " reached.");
                    return null;
                }
            default:
                System.out.println("Invalid shape type.");
                return null;
        }
    }
}