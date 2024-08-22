//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ShapeTest {
    public static void main(String[] args) {
     ShapeFactory shapeFactory = new ShapeFactory();

     Shape square = shapeFactory.getShape("SQUARE");
     if(square != null){
         System.out.println("Square: ");
         square.draw();
         System.out.println();
     }

     Shape circle = shapeFactory.getShape("CIRCLE");
        if(circle != null) {
            System.out.println("Circle: ");
            circle.draw();
            System.out.println();
        }

        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        if(rectangle != null) {
            System.out.println("Rectangle: ");
            rectangle.draw();
            System.out.println();
        }

        Shape invalidShape = shapeFactory.getShape("PENTAGON");
        if(invalidShape != null) {
            invalidShape.draw();
        }

    }
}