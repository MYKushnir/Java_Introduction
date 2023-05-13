//Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди, 
//dequeue() - возвращает первый элемент из очереди и удаляет его, 
//first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Sem4Task2 {

    public static void Enqueue(LinkedList<Integer> inputData) {
        Scanner scn = new Scanner(System.in);
        //Integer addItem = null;        

        //while (addItem == null) {
            System.out.printf("Введите натуральное число: ");
            if (!scn.hasNextInt()) {
                System.out.println("Ошибка ввода! ");
                //scn.reset();
            } else {
                //addItem = scn.nextInt();
                //inputData.add(addItem);
                inputData.add(scn.nextInt());
            }
        //}
        scn.close();      
    }

    public static int Dequeue (LinkedList<Integer> inputData){
        return inputData.removeFirst();
    }

    public static int First (LinkedList<Integer> inputData){
        return inputData.getFirst();
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Random rnd = new Random();

        for (int i = 0; i < 20; i++) {
            list.add(rnd.nextInt(100));
        }

        System.out.printf("Исходный LinkedList: %s", list);
        System.out.printf("\n\r=====================================================\n\rДобавление элемента:\n\r");
        Enqueue(list);
        System.out.printf("Элемент успешно добавлен: %s", list);
        System.out.printf("\n\r=====================================================\n\rПервый элемент списка был: %d и он уже удален\n\rТеперь список выглядит так: %s", Dequeue(list), list);
        System.out.printf("\n\r=====================================================\n\rТеперь первый элемент списка: %d, но мы его не удаляем\n\rСписок выглядит так: %s", First(list), list);
    }
}
