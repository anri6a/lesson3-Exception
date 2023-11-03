package ru.geekbrains.exc.lesson3.HW;


import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ConsoleUI {
    private final Scanner scanner;
    private final DateTimeFormatter formatter;
    private final FileHandler fileHandler;

    public ConsoleUI() throws IOException {
        scanner = new Scanner(System.in);
        formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        fileHandler = new FileHandler();
    }

    public String[] dataInput() {
        System.out.println("Укажите ФИО, дату рождения (dd.mm.yyyy), номер телефона, пол (m , f): ");
        String data = scanner.nextLine();
        return data.split(" ");
    }

    public void addHuman(String[] array) throws Exception {

        dataCheck(array);

        String firstName = array[0];
        String secondName = array[1];
        String surname = array[2];
        LocalDate localDate = localDataCheck(array, 3);
        long number = numberCheck(array, 4);
        String gender = genderCheck(array, 5);

        Human human = new Human(firstName, secondName, surname, localDate, number, gender);

        fileHandler.writeFile(fileName(firstName), human);
    }

    public void dataCheck(String[] array) throws NumberParametersException {
        if (array.length != 6)
            if (array.length < 6) {
                throw new NumberParametersException("Параметров меньше нужного количества",
                        array.length);
            } else {
                throw new NumberParametersException("Параметров больше нужного количества",
                        array.length);
            }
    }

    public LocalDate localDataCheck(String[] array, int i) throws WrongFormatDateException {
        try {
            return LocalDate.parse(array[i], formatter);
        } catch (DateTimeParseException e) {
            throw new WrongFormatDateException("Дата введена неверно!");
        }
    }

    public Long numberCheck(String[] date, int i) throws WrongFormatNumberException {
        try {
            return Long.parseLong(date[i]);
        } catch (NumberFormatException e) {
            throw new WrongFormatNumberException("Номер введен неверно!");
        }
    }

    public String genderCheck(String[] array, int i) throws WrongFormatGenderException {
        if (!array[i].equals("f") && !array[i].equals("m"))
            throw new WrongFormatGenderException("Пол введен неверно!");
        return array[i];
    }

    public String fileName(String name) {
        return name.toLowerCase() + ".txt";
    }
}
