package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 1;
        amount = (int) (amount + amount * percent / 100);
        while (amount - salary > 0) {
            amount = (int) ((amount - salary) * (1 + percent / 100));
            year++;
        }
        return year;
    }
}
