package ru.job4j.array;

public class Turn {

    public static int[] back(int[] data) {
        int temp;
        for (int i = 0; i < data.length / 2; i++) {
            temp = data[i];
            data[i] = data[data.length - 1 - i];
            data[data.length - 1 - i] = temp;
        }
        return data;
    }
}
