package ru.job4j.inheritance;

public class Doctor extends Profession {

    private Boolean telemedicine;
    private String degree;
    private Boolean privatePractice;

    public Boolean getTelemedicine() {
        return telemedicine;
    }

    public String getDegree() {
        return degree;
    }

    public Boolean getPrivatePractice() {
        return privatePractice;
    }
}
