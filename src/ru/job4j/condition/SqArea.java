package ru.job4j.condition;

public class SqArea {
    public static double area(int p, int k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double result = l * h;
        return result;
    }

    public static void main(String[] args) {
        double result = area(4, 1);
        System.out.println("p = 4, k = 1, s = 1, real = " + result);
        result = area(6, 2);
        System.out.println("p = 6, k = 2, s = 2, real = " + result);
    }
}
