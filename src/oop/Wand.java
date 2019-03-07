package oop;

public class Wand {
    public static final double MINIMUM_POWER = 0.5;
    public static final int MAXIMUM_POWER = 100;
    private String name;
    private double power;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException("");
        }
        this.name = name;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        if (MINIMUM_POWER <= power && power <= MAXIMUM_POWER) {
            this.power = power;
        } else {
            throw new IllegalArgumentException("");
        }

    }
}
