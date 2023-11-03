package ru.geekbrains.exc.lesson3.task3;

public abstract class Animal {

    protected final String name;

    public String getName() {
        return name;
    }

    /**
     * Создать новое животное
     * @param name имя животного
     * @throws AnimalNameException некорректное имя животного
     */
    protected Animal(String name) {
        this.name = name;
    }

    abstract void swim(int distance) throws AnimalSwimException;

    abstract void run(int distance) throws AnimalRunException;

}
