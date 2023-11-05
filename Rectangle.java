public class Rectangle {
    private final Point bottomLeft;
    private final Point topRight;

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public Rectangle(int bottomRightX, int bottomRightY, int topLeftX, int topLeftY){
        this.bottomLeft = new Point(bottomRightX, bottomRightY);
        this.topRight = new Point(topLeftX, topLeftY);
    }
    public boolean contains(Point point){
        return point.getX() >= bottomLeft.getX() && point.getX() <=topRight.getX()
        && point.getY() >= bottomLeft.getY() && point.getY() <= topRight.getY();
    }
}
