package paiza.c010;

public class Gongsa {
    private int x;
    private int y;
    private int radius;

    public Gongsa(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getNoisy(Tree tree) {
        String result = "noisy";

        if ((tree.getX() - x) * (tree.getX() - x) +
                (tree.getY() - y) * (tree.getY() - y) >=
                radius * radius) {
            result = "silent";
        }

        return result;
    }
}
