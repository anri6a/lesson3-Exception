package ru.geekbrains.exc.lesson3.HW;

import java.time.LocalDate;

public class Human {
    private String firstName;
    private String secondName;
    private String surname;
    private LocalDate localDate;
    private long number;
    private String gender;

    public Human(String firstName, String secondName, String surname, LocalDate localDate,
                 long number, String gender) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.surname = surname;
        this.localDate = localDate;
        this.number = number;
        this.gender = gender;
    }

    public Human() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getdate() {
        return localDate;
    }

    public long getNumber() {
        return number;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "[" + firstName + "]" +
                "[" + secondName + "]" +
                "[" + surname + "]" +
                "[" + localDate + "]" +
                "[" + number + "]" +
                "[" + gender + "]";
    }
}
