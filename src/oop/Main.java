package oop;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    static class Sheet {
        int x;
        int y;
        int p;

        public Sheet(int x, int y, int p) {
            this.x = x;
            this.y = y;
            this.p = p;
        }

        public double getArea() {
            return (double) p / (x * y);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Sheet sheet = (Sheet) o;
            return getArea() == sheet.getArea();
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y, p);
        }

        @Override
        public String toString() {
            return String.format("%d %d %d", x, y, p);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int p1 = sc.nextInt();

        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int p2 = sc.nextInt();

        Sheet sheet1 = new Sheet(x1, y1, p1);
        Sheet sheet2 = new Sheet(x2, y2, p2);

        if (sheet1.equals(sheet2)) {
            System.out.println("DRAW");
        } else {
            System.out.println(sheet1.getArea() > sheet2.getArea() ? sheet2 : sheet1);
        }
    }

}