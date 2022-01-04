package ru.as.homeworks.lesson2;

public class App {
    public static void main(String[] args) {

        String[][] goodArray = new String[][]{{"1", "2", "3", "4"}, {"2", "2", "2", "3"}, {"1", "2", "2", "2"}, {"2", "2", "4", "2"}};
//        String[][] wrongSizeArray = new String[][]{{"1", "2", "3", "4"}, {"2", "2", "2", "3"}, {"1", "2", "2", "2"}, {"2", "2", "3", "2"}, {"2", "2", "3", "2"}};
//        String[][] wrongDataArray = new String[][]{{"1", "2", "3", "4"}, {"2", "2", "2", "3"}, {"1", "2", "2", "2"}, {"2", "2", "T", "2"}};
        try {
            try {
                int result = sumArray(goodArray);
                System.out.println(result);
            } catch (MySizeArrayException e) {
                System.out.println("Массив неверного размера!");
            }
        }
        catch (MyArrayDataException e) {
            System.out.println("Неправильное значение массива в ячейке: "+ e.i + ":" + e.j);
        }

    }

    public static int sumArray(String [][] array) throws MySizeArrayException, MyArrayDataException {
        int count = 0;

        if (array.length !=4){
            throw new MySizeArrayException();
        }
        for (int i=0; i < array.length; i++){
            if (array[i].length != 4){
                throw new MySizeArrayException();
            }
            for (int j = 0; j < array[i].length; j++) {
                try {
                    count = count + Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException(i, j);
                }

            }
        }
        return count;
    }

}
//1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4, при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
//Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
//должно быть брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
//3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException, и вывести результат расчета.
