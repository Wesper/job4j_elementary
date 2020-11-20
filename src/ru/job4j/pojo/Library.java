package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book first = new Book("Clean code", 500);
        Book second = new Book("Alphabet", 26);
        Book third = new Book("Java", 100500);
        Book fourth = new Book("JavaScript 1+1", 11);
        Book[] books = new Book[4];
        books[0] = first;
        books[1] = second;
        books[2] = third;
        books[3] = fourth;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " - " + books[i].getPages());
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals("Clean code")) {
                System.out.println(books[i].getName() + " - " + books[i].getPages());
            }
        }
    }
}
