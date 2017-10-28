package dk.cngroup.university;

public class RoverPosition {
    private int x;
    private int y;

    public RoverPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int setX(int x) {
        this.x = x;
        return x;
    }

    public int setY(int y) {
        this.y = y;
        return y;
    }
}
