// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;
import java.util.Random;

public class Sem4Task1 {

    public static LinkedList<Integer> ReverseLinkedList (LinkedList<Integer> inputData){
        LinkedList <Integer> result = new LinkedList<Integer>();
        for (int i=inputData.size()-1; i>=0; i--){
            result.add(inputData.get(i));
        }
        return result;
    }

   public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<Integer>();
        Random rnd = new Random();

        for (int i=0; i<20; i++) {
            list.add(rnd.nextInt(100));
        }

        System.out.printf("Исходный LinkedList: %s",list);
        System.out.printf("\n\rРеверс: %s", ReverseLinkedList(list));
   } 
}
