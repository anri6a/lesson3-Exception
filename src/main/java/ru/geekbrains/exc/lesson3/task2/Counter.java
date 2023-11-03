package ru.geekbrains.exc.lesson3.task2;

public class Counter implements AutoCloseable {

    private int counter;
    private boolean isOpen;

    public int getCounter() {
        return counter;
    }

    public int add() throws CloseCounterException{
        if (!isOpen){
            throw new CloseCounterException("Счетчик закрыт");
        }
        return ++counter;
    }

    public Counter() {
        isOpen= true;
    }

    public Counter(int counter) {
        isOpen = true;
        this.counter = counter;
    }

    /*public void closeCounter(){
        isOpen = false;
    }*/

    @Override
    public void close() throws Exception {
        isOpen = false;

        throw new Exception("...");

        //closeCounter();
    }
}
