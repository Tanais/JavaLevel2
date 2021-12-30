package ru.as.homeworks.lesson1;

public class Wall implements Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public String check(Runner runner) {
        runner.setSuccess(runner.getMaxHeight() >= height);
        if (runner.getSuccess()) {
            return "Бегун " + runner.getName() + " перепрыгнул стену высотой: " + height + " м";
        } else {
            return "Бегун " + runner.getName() + " не перепрыгнул стену высотой: " + height + " м";
        }
    }
}





