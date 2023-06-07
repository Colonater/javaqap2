// Myrectangle class represents a rectyangle using two mypoint instances as its corners
//in this class we define two instances topKeft and bottom right of thwe type MyPoint
// also include width and height to get area of the rectangle
public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight){
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public MyPoint getTopLeft() {
        return topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public int getWidth(){
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    public int getHeight(){
        return Math.abs(bottomRight.getY() - topLeft.getY());
    }

    public int getArea(){
        return getWidth() * getHeight();
    }

}