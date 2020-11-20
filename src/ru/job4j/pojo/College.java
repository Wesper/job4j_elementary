package ru.job4j.pojo;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setLastName("Иванов");
        student.setFirstName("Иван");
        student.setMiddleName("Иванович");
        student.setGroup("112");
        student.setDateAdmission("12.02.2012");
        System.out.println(student.getLastName() + " " + student.getFirstName() + " " + student.getMiddleName()
        + ", группа " + student.getGroup() + ", дата приема " + student.getDateAdmission());
    }
}
