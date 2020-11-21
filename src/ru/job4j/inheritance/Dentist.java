package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private String typeDentist;

    public Dentist(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public String getTypeDentist() {
        return typeDentist;
    }
}
