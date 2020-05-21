package ru.job4j.condition;

public class SqArea {
    public static double area(int p, int k){
        double h = p / (2 * (k + 1));
        double l = h * k;
        double rsl = l * h;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = area(4, 1);
        System.out.println("p = 4, k = 1, s = 1, real = " + result1);
        result1 = area(6, 2);
        System.out.println("p = 6, k = 2, s = 2, real = " + result1);
    }
}
