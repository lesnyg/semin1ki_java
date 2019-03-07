package oop;

import java.util.Random;

public class Cleric {
    final int MAX_HP = 50;
    final int MAX_MP = 10;

    int hp = MAX_HP;
    int mp = MAX_MP;

    void selfAid() {
        mp -= 5;
        hp = MAX_HP;
    }

    int pray(int prayTime) {
        int point = new Random().nextInt(3);
        mp += point;
        if (mp > MAX_MP) {
            mp = MAX_MP;
        }
        return point;
    }

}
