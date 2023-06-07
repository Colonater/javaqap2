// mypoint class represents a point in a coordinate system each point takes in a x and a y cooridnate
// 2 private insance varibles x and y
//x and y also double as getter meathods to fetch the coordss
public class MyPoint {
    private int x;
    private int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}