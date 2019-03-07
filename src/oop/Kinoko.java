package oop;

public class Kinoko {
    int hp = 50;
    final int LEVEL = 10;

    private char suffix;

    public Kinoko(char suffix) {
        this.suffix = suffix;
    }

    void runAway() {

    }

    void attack(Hero hero) {
        System.out.println("키노토 " + this.suffix + " 의 공격");
        System.out.println("10의 데미지");
        hero.setHp(hero.getHp() - 10);
        System.out.println("현재 HP : " + hero.getHp());
    }
}
