package ru.job4j.array;

public class SwitchArray {

    public static int[] swap(int[] data, int source, int dest) {
        int temp = data[source];
        data[source] = data[dest];
        data[dest] = temp;
        return data;
    }

    public static int[] swapBorder(int[] data) {
        int temp = data[0];
        data[0] = data[data.length - 1];
        data[data.length - 1] = temp;
        return data;
    }

    public static void main(String[] args) {
        int[] numbers = new int[] {1, 2, 3, 4, 5, 6};
        int[] result = swapBorder(numbers);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }
}
