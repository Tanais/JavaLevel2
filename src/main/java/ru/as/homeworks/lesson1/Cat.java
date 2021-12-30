package ru.as.homeworks.lesson1;

public class Cat implements  Runner{
    private String name;
    private int maxLength;
    private int maxHeight;
    private boolean success = true;

    public Cat(String name, int maxLength, int maxHeight) {
        this.name = name;
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
    }

    public void run() {
        System.out.println(name + " может пробежать: " + maxLength + " км");
    }
    public void jump() {
        System.out.println(name + " может прыгнуть на высоту: " + maxHeight + " м");
    }

    public String getName() {
        return name;
    }
    public int getMaxLength() {
        return maxLength;
    }
    public int getMaxHeight() {
        return maxHeight;
    }
    public boolean getSuccess() {
        return success;
    }
    public void setSuccess(boolean success) {
        this.success = success;
    }

}


//    public void jump(Wall wall) {
//        if (wall.getHeight() <= getMaxHeight()){
//            System.out.println(getName() + " перепрыгнул через стену " + wall.getName() + " высотой " + wall.getHeight() +"m");
//        } else {
//            System.out.println(getName() + " не смог перепрыгнул через стену " + wall.getName() + " высотой " + wall.getHeight() +"m");
//        }
//    }
