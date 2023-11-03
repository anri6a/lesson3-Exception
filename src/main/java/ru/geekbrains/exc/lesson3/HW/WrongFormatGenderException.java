package ru.geekbrains.exc.lesson3.HW;

public class WrongFormatGenderException extends RuntimeException {
    public WrongFormatGenderException(String s) {
        super(s);
    }
}
