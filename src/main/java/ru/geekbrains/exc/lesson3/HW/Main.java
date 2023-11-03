package ru.geekbrains.exc.lesson3.HW;

import java.nio.file.FileSystemException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {

        ConsoleUI consoleUI = new ConsoleUI();

        try {
            consoleUI.addHuman(consoleUI.dataInput());
        } catch (NumberParametersException e){
            System.out.println(e.getMessage());
            System.out.println("Количество переданных параметров: " + e.getLength());
        }
        catch (WrongFormatDateException | WrongFormatNumberException | WrongFormatGenderException |
               FileSystemException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(Arrays.toString(e.getStackTrace()));
        }


    }
}

//        Ширяков Андрей Юрьевич 01.10.1983 80294569812 m
//        Рабчун Сергей Иванович 25.05.1995 80299871236 m
//        Петрова Светлана Алексеевна 11.01.1960 80291239874 f
//        Ширяков Давид Андреевич 22.08.2017 80293954700 m