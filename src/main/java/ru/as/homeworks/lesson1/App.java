package ru.as.homeworks.lesson1;

public class App {
    public static void main(String[] args) {

        Runner barsik = new Cat("Барсик", 10, 50);
        Runner baton = new Cat("Батон", 10, 50);

        Runner r2d2 = new Robot("R2D2", 500, 0);
        Runner terminator = new Robot("Терминатор", 500, 5);

        Runner vasya = new Human("Вася", 8, 5);
        Runner anton = new Human("Антон", 15, 7);

        Runner[] runners = {barsik, baton, r2d2, terminator, vasya, anton};

        Obstacle wall1 = new Wall(50);
        Obstacle wall2 = new Wall(5);

        Obstacle runTrack1 = new RunTrack(100);
        Obstacle runTrack2 = new RunTrack(200);

        Obstacle[] obstacles = {wall1, runTrack1, wall2, runTrack2};

        for (int i = 0; i < obstacles.length; i++) {
            for (Runner runner : runners) {
                System.out.println(obstacles[i].check(runner));
            }
        }
    }
}
