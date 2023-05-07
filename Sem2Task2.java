// Реализуйте алгоритм сортировки пузырьком числового массива, результат после
// каждой итерации запишите в лог-файл.

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Sem2Task2 {

    public static void main(String[] args) throws IOException {
        // инициализируем логгер
        Logger logger = Logger.getLogger(Sem2Task2.class.getName());
        FileHandler fileHandler = new FileHandler("Sem2Task2.log", true);
        logger.addHandler(fileHandler);

        //создаем массив и заполняем его случайными числами
        int[] array = new int[27];
        for (int i = 0; i < array.length; i++) {
            Random rand = new Random();
            array[i] = rand.nextInt(99);
        }
        System.out.printf("Неотсортированный массив: %s\n", Arrays.toString(array));
        
        //Сортировка пузырьком
        int i = 0;
        boolean flag = true;
        while (i < array.length - 1) {
            flag = false;
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    logger.log(Level.INFO, "Array = {0}",  Arrays.toString(array));
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
            i++;
        }

        System.out.printf("\n\rОтсортированный массив: %s\n", Arrays.toString(array));
    }
}