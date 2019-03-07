package poly;

import java.util.ArrayList;

public abstract class Animal implements Movable, Life {
    public static void main(String[] args) {
        Movable movable = new Movable() {
            @Override
            public void move() {
                System.out.println("쿵쾅쿵쾅");
            }
        };

        Dog happy = new Dog();

        Car sonata = new Car();

        Cat kitty = new Cat();

        happy.follow(sonata);
        happy.follow(kitty);

        happy.follow(new Movable() {
            @Override
            public void move() {
                System.out.println("후다닥!!!");
            }
        });

        happy.follow(movable);

        Animal someAnimal = new Animal() {
            @Override
            public void move() {

            }
        };
    }
}
