public class Point {

    private int x;
    private int y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt((this.x * this.x) + (this.y * this.y));
    }

    public double distance(int x, int y) {
        return Math.sqrt((this.x - x)*(this.x - x) + (this.y - y)*(this.y - y));
    }

    public double distance(Point point) {
        int x = point.getX();
        int y = point.getY();

        return Math.sqrt((this.x - x)*(this.x - x) + (this.y - y)*(this.y - y));
    }
}
