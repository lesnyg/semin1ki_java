package oop;

import java.util.Objects;

public class Hero {
    static int MONEY = 100;

    private String name;
    private int hp;
    private Sword sword;

    Hero(String name) {
        // 초기화
        hp = 100;
        this.name = name;
    }

    public void attack() {}
    public void run() {
        System.out.println("Hero run");
    }
    public void sit(int sec) {}
    public void slip() {}
    public void sleep() {
        this.hp = 100;
        System.out.println(this.name + "은 잠을 자고 회복했다.");
    }

    public void buy() {
        Hero.MONEY -= 5;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Sword getSword() {
        return sword;
    }

    public void setSword(Sword sword) {
        this.sword = sword;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", sword=" + sword +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Hero) {
            Hero hero = (Hero) o;
            if (this.name.equals(hero.name) &&
            this.sword.equals(hero.sword)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
