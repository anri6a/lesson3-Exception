package ru.geekbrains.exc.lesson3.HW;

import java.io.IOException;

public class NumberParametersException extends IOException {
    private final int length;

    public int getLength() {
        return length;
    }

    public NumberParametersException(String s, int length) {
        super(s);
        this.length = length;
    }
}
