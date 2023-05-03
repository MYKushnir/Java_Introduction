// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class Sem1Task1 {
    static int TriangleNumber(int n) {
        int sum = 0;
        for (int index = 0; index < n; index++) {
            sum += index + 1;
        }
        return sum;
    }

    static int Factorial(int n) {
        int result = 1;
        for (int index = 0; index < n; index++) {
            result *= index + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = 0;
        System.out.printf("Введите натуральное число: ");
        if (!scn.hasNextInt()) {
            System.out.println("Ошибка ввода");
        } else {
            n = scn.nextInt();
            if (n < 1)
                System.out.println("Введенное число должно быть больше 0");
            else {
                System.out.printf("Треугольное число %d равно: %s ", n, TriangleNumber(n));
                System.out.println();
                System.out.printf("Факториал %d равен: %s ", n, Factorial(n));
            }
        }
        scn.close();
    }
}
