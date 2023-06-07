// test class to verify it all works corredtly

public class TestMyRectangle {
    public static void main(String[] args) {
        // Create two points for the rectangle
        MyPoint point1 = new MyPoint(2, 4);
        MyPoint point2 = new MyPoint(7, 1);

        // Create a rectangle using the two points
        MyRectangle rectangle = new MyRectangle(point1, point2);

        // Display the rectangle information
        System.out.println("Rectangle:");
        System.out.println("Top-Left Corner: (" + rectangle.getTopLeft().getX() + ", " +
                rectangle.getTopLeft().getY() + ")");
        System.out.println("Bottom-Right Corner: (" + rectangle.getBottomRight().getX() + ", " +
                rectangle.getBottomRight().getY() + ")");
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Area: " + rectangle.getArea());
    }
}
