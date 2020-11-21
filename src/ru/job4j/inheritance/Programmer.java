package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private String language;
    private String sertification;

    public Programmer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public String getLanguage() {
        return language;
    }

    public String getSertification() {
        return sertification;
    }
}
