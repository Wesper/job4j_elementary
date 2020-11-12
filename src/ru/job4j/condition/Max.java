package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean compare = left >= right;
        int result = compare ? left : right;
        return result;
    }

    public static int max(int one, int two, int three) {
        return max(one, max(two, three));
    }

    public static int max(int one, int two, int three, int four) {
        return max(one, two, max(three, four));
    }
}
