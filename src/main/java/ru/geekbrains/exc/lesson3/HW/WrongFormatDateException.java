package ru.geekbrains.exc.lesson3.HW;

public class WrongFormatDateException extends RuntimeException {
    public WrongFormatDateException(String s) {
        super(s);
    }
}
