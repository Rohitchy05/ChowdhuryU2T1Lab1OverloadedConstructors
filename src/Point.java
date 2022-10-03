public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int both) {
        x = both;
        y = both;
    }

    public Point() {
        x = 0;
        y = 0;
    }

    public int getX() {
        return x;
    }


}
