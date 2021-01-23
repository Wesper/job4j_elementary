package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        String player;
        int matches;
        while (count > 0) {
            player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            matches = Integer.parseInt(input.nextLine());
            if (matches != 1 && matches != 2 && matches != 3) {
                System.out.println("Некорректное число. Введите число от 1 до 3");
                continue;
            }
            if (count - matches < 0) {
                System.out.println("Вы не можете забрать " + matches + " спичек, осталось спичек " + count
                        + " .Введите корректное число");
                continue;
            }
            count -= matches;
            System.out.println("Осталось спичек " + count);
            turn = !turn;
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }

}
