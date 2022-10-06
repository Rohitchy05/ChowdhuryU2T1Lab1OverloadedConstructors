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

    public void setX(int newX) { x = newX;}

    public int getY() { return y; }

    public void setY(int newY) {y = newY;}

    public String coordinate() {
        return ("(" + x + ", " + y + ")"); }

    public String quadrant() {
        if (x > 0 && y > 0)
            System.out.println("I");
        else if (x < 0 && y > 0)
            System.out.println("II");
        else if (x < 0 && y < 0)
            System.out.println("III");
        else if (x > 0 && y < 0)
            System.out.println("IV");
        else if (x = 0 && y = 0)
            System.out.println("origin");
        else if (x = 0 || y = 0)
            System.out.println("on an axis");
    }
}
