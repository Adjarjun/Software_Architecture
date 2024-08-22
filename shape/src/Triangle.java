public class Triangle implements Shape{
    @Override
    public void draw() {
        int rows = 5; // You can change this value to print a triangle of different size

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
