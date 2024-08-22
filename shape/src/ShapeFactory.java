public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        switch (shapeType.toUpperCase()) {
            case "SQUARE":
                return new Square();
            case "CIRCLE":
                return new Circle(7); // Default radius for demonstration
            case "TRIANGLE":
                return new Triangle();
            case "RECTANGLE":
                return new Rectangle();
            default:
                System.out.println("Invalid shape type");
                return null;
        }
    }
}
