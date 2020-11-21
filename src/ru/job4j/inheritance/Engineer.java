package ru.job4j.inheritance;

public class Engineer extends Profession {

    private String iq;
    private String grade;

    public Engineer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public String getIq() {
        return iq;
    }

    public String getGrade() {
        return grade;
    }
}
