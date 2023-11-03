package ru.geekbrains.exc.lesson3.HW;

public class WrongFormatNumberException extends RuntimeException{
    public WrongFormatNumberException(String s){
        super(s);
    }
}
