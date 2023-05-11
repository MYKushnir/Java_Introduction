//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Sem3Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 20 ; i++) {
            list.add(rand.nextInt(100));
        }
        System.out.println(list);

        int min = Collections.min(list);
        System.out.printf("Минимальное число в списке %d \n", min);

        int max = Collections.max(list);
        System.out.printf("Максимальное число в списке %d \n", max);

        double sum = list.stream().mapToInt(Integer::intValue).sum();
        double average = sum / list.size();
        System.out.printf("Среднее арифметическое в списке %f \n", average);
    }
}