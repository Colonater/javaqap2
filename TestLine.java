public class TestLine {
    public static void main(String[] args) {
        // Create a MyLine object using individual coordinates
        MyLine line1 = new MyLine(0, 0, 3, 4);
        System.out.println(line1); // Line[(0, 0), (3, 4)]

        // Create a MyLine object using MyPoint objects
        MyPoint begin = new MyPoint(1, 1);
        MyPoint end = new MyPoint(5, 6);
        MyLine line2 = new MyLine(begin, end);
        System.out.println(line2); // Line[(1, 1), (5, 6)]

        // Test getters and setters
        line1.setBeginX(2);
        line1.setEndY(5);
        System.out.println(line1.getBeginX()); // 2
        System.out.println(line1.getEndY()); // 5

        // Test getLength() and getGradient()
        System.out.println(line2.getLength()); // 7.810249675906654
        System.out.println(line2.getGradient()); // 1.0121970114513341
    }
}
