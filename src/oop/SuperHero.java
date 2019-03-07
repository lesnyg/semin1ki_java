package oop;

public class SuperHero extends Hero {

    private boolean flying;

    SuperHero(String name) {
        super(name);

        System.out.println("SuperHero 생성자");
    }

    public void fly() {
        flying = true;
    }

    public void land() {
        flying = false;
    }

    @Override
    public void run() {
        super.run();
        System.out.println("SuperHero run");
    }
}
