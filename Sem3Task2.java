//Пусть дан произвольный список целых чисел. Удалить из него чётные числа.

import java.util.ArrayList;
import java.util.Random;

public class Sem3Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random rand = new Random();

        for (int i = 0; i < rand.nextInt(8)+2; i++) {
            list.add(rand.nextInt(20));
        }
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(list.get(i));
                i--;
            }
        }

        System.out.println(list);
    }
}