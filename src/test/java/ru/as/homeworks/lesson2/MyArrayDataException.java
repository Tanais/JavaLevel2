package ru.as.homeworks.lesson2;

public class MyArrayDataException extends Exception{
    private int i;
    private int j;

    MyArrayDataException(int i, int j) {
        setI(i);
        setJ(j);
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }
}
