package ru.job4j.loop;

public class Fitness {
    public static int calc(int user1, int user2) {
        int months = 0;
        while (user1 <= user2) {
            user1 *= 3;
            user2 *= 2;
            months++;
        }
        return months;
    }
}
