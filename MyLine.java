// my line class modea line segment witha beginning point and an end point.
// it uses two MyPoint instances to represent the line segment.
// begin and end
//
public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    //constructors
    public MyLine(int x1, int y1, int x2, int y2){
        begin = new MyPoint(x1, y1);
        end = new MyPoint(x2, y2);
    }

    public MyLine(MyPoint begin, MyPoint end){
        this.begin = begin;
        this.end = end;
    }

    //getters and setters for begin and end

    public MyPoint getBegin() {
        return begin;

    }


    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }


    public MyPoint getEnd() {
        return end;
    }


    public void setEnd(MyPoint end) {
        this.end = end;
    }

    //getter and setter for individual x and y
    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        begin.setX(x);

    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int y) {
            begin.setY(y);
    }

    public int getEndX() {
        return end.getX();
    }


    public void setEndX(int x) {
        end.setX(x);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int y) {
        end.setY(y);
    }
    public int[] getBeginXY() {
        return new int[] {begin.getX(), begin.getY()};
    }

    public void setBeginXY(int x, int y) {
        begin.setX(x);
        begin.setY(y);
    }

    //calulates the lenth of the line segment using thr distance formula
    //getLenggth meathed calls the distance method of the MyPoint class
    public double getLength() {
        return begin.distance(end);
    }

    //calculates the gradient of the line segment in radians
    // getGradient method calls the atan2 method of the Math class
    public double getGradient() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.atan2(yDiff, xDiff);
    }

    //returns a string representation of the line segment
    public String toString() {
        return "MyLine[begin=" + begin + ",end=" + end + "]";
    }

}