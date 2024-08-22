public class Rectangle implements Shape{
    @Override
    public void draw() {
        int rows = 4;
        int columns = 6;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
