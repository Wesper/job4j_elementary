package ru.job4j.condition;

public class StringEq {
    public static boolean check(String login) {
        String root = new String("root");
        boolean access = root.equals(login);
        return access;
    }

    public static void main(String[] args) {
        String your = "Artem";
        boolean access = StringEq.check(your);
        System.out.println(access);
    }
}
