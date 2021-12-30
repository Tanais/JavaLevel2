package ru.as.homeworks.lesson1;

public interface Runner {

    String getName();

    int getMaxLength();

    int getMaxHeight();

    boolean getSuccess();

    void setSuccess(boolean success);

    void run();

    void jump();

}
