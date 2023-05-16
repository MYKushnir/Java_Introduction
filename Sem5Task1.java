import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

//* Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов

public class Sem5Task1 {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> phoneBook = new HashMap<>();
        Scanner sc = new Scanner(System.in, "cp866");

        boolean flag = true;

        while (flag) {
            System.out.println();
            System.out.print(
                    "1 - Показать все записи в телефонной книге\n\r2 - Добавить номер\n\r0 - Выход\n\r Чего желаете:");

            String selection = sc.nextLine();

            switch (selection) {
                case "1":
                    showPhoneBook(phoneBook);
                    break;

                case "2":
                    addContact(phoneBook, sc);
                    break;

                case "0":                    
                    System.out.println("Закрываемся...");
                    sc.close();
                    flag = false;
                    break;

                default:
                    System.out.println("/n/rОшбка ввода!!!/n/r");
            }
        }

        
    }

    public static void addContact(Map<String, ArrayList<String>> map, Scanner scanner) { // метод добавляющий запись в книгу
        int index = 1;
        Object[] names = map.keySet().toArray();
        int selection=0; // изначально считаем, что книга пуста и поэтому сразу переходим к добавлению нового контакта
        
        if (names.length!=0) { // случай не пустой книги
            System.out.println("Какому контакту добавляем номер?:");

            for (Object el : names) {
                System.out.println("\n\r" + index + ". " + el);
                index++;
            }
            System.out.print("\n\r0. Добавить новый контакт\n\r Ваш выбор: ");
            selection = scanner.nextInt();
            scanner.nextLine();  
        }             
        
        if (selection <= names.length && selection > 0) {
            System.out.print("Введите номер телефона: ");
            String phoneNumber = scanner.nextLine();
            map.get(names[selection - 1]).add(phoneNumber);
        } else if (selection == 0) { // пользователь выбрал добавить новый контакт
            System.out.print("Введите ФИО нового контакта: ");
            String name = scanner.nextLine();

            System.out.print("Введите номер телефона: ");
            String phoneNumber = scanner.nextLine();

            ArrayList<String> numbers = new ArrayList<>();
            numbers.add(phoneNumber);
            map.put(name, numbers);
        } else
            System.out.println("/n/rОшбка ввода!!!/n/r");
    }

    public static void showPhoneBook(Map<String, ArrayList<String>> map) { // метод выводящий данные из книги
        System.out.println();

        for (var el : map.entrySet()) {
            System.out.println(el.getKey() + ":");

            for (String inner : el.getValue())
                System.out.println("\n\r" + inner);

            System.out.println();
        }
    }
}