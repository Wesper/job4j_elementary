package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean compare = left >= right;
        int result = compare ? left : right;
        return result;
    }
}
