package ru.as.homeworks.lesson1;

public class RunTrack implements Obstacle{
    private int length;

    public RunTrack(int length) {
        this.length = length;
    }

    public String check(Runner runner) {
        runner.setSuccess(runner.getMaxLength() >= length);
        if (runner.getSuccess()) {
            return "Бегун " + runner.getName() + " пробегает: " + length + " км";
        } else {
            return "Бегун " + runner.getName() + " не может пробежать: " + length + " км";
        }
    }
}
