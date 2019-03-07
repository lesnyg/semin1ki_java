package oop;

import java.util.Objects;

public class Sword {
    private String name;
    private int damage;

    public Sword(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public Sword(String name) {
        this.name = name;
    }

    public Sword(int damage) {
        this.damage = damage;
    }

    public Sword() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Sword{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sword sword = (Sword) o;
        return damage == sword.damage &&
                Objects.equals(name, sword.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, damage);
    }
}
