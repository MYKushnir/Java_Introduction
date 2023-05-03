// Реализовать простой калькулятор

import java.util.Scanner;

public class Sem1Task3 {

    static int Sum(int a, int b) {
        return a + b;
    }

    static int Difference(int a, int b) {
        return a - b;
    }

    static int Product(int a, int b) {
        return a * b;
    }

    static double Division(int a, int b) {
        return (double) a / (double) b;
    }

    static void PrintResult(int a, int b, String signOperation) {
        switch (signOperation) {
        case "+":
            System.out.printf("%d %s %d = %d \n", a, signOperation, b, Sum(a, b));
            break;
        case "-":
            System.out.printf("%d %s %d = %d \n", a, signOperation, b, Difference(a, b));
            break;
        case "*":
            System.out.printf("%d %s %d = %d \n", a, signOperation, b, Product(a, b));
            break;
        case "/":
            if (b != 0) {
                System.out.printf("%d %s %d = %.4f \n", a, signOperation, b, Division(a, b));
            } else {
                System.out.println("Деление на ноль!");
            }
            break;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int a = 0;
        if (!scn.hasNextInt()) {
            System.out.println("Ошибка ввода!");
        } else {
            a = scn.nextInt();
            Scanner sc = new Scanner(System.in);
            System.out.printf("Введите оператор (+, -, *, /): ");
            String signOperation = "";
            if (sc.hasNextLine()) {
                signOperation = sc.nextLine();
            }
            if (signOperation.equals("+") || signOperation.equals("-") || signOperation.equals("*")
                    || signOperation.equals("/")) {
                int b = 0;
                System.out.printf("Введите второе число: ");
                if (!scn.hasNextInt()) {
                    System.out.println("Ошибка ввода!");
                } else {
                    b = scn.nextInt();
                    PrintResult(a, b, signOperation);
                }
            } else {
                System.out.println("Ошибка ввода оператора!");
            }
            scn.close();
            sc.close();
        }
    }
    
}
