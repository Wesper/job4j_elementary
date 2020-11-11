package ru.job4j.oop;

public class Battery {

    private int load;

    public Battery(int size) {
        this.load = size;
    }

    public void exchange(Battery another) {
        another.load = another.load + this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(50);
        Battery second = new Battery(10);
        System.out.println("first size " + first.load + ", second size " + second.load);
        first.exchange(second);
        System.out.println("first size " + first.load + ", second size " + second.load);
    }
}
