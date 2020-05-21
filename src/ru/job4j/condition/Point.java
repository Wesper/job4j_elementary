package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double arg1 = x2 - x1;
        double arg2 = y2 - y1;
        arg1 = Math.pow(arg1, 2);
        arg2 = Math.pow(arg2, 2);
        double rsl = arg1 + arg2;
        rsl = Math.sqrt(rsl);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = Point.distance(131, 12, 0, 98);
        System.out.println("result (131, 12) to (0, 98) " + result);
    }
}
