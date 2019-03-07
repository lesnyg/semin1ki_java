package poly;

public class Dog extends Animal {
    @Override
    public void move() {

    }

    public void follow(Movable movable) {
        movable.move();
        System.out.println("따라간다!!!!");
    }
}
