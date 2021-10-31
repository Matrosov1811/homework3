package pav.matrosov;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Выберите действие:\n1 - Калькулятор \n2 - Поиск максимального элемента в массиве");
        Scanner s = new Scanner(System.in);
        switch (s.nextInt()) {
            case 1:
                System.out.println("Введите два числа");
                double a = s.nextDouble();
                double b = s.nextDouble();
                System.out.println("Введите арифметиское действие (‘+’, ‘-’, ‘*’ или ‘/’)");
                switch (s.next().charAt(0)) {
                    case '+':
                        System.out.printf("a + b = %.4f", (a + b));
                        break;
                    case '-':
                        System.out.printf("a - b = %.4f", (a - b));
                        break;
                    case '*':
                        System.out.printf("a * b = %.4f", (a * b));
                        break;
                    case '/':
                        if (b == 0) {
                            System.out.println("На ноль делить нельзя!");
                            break;
                        }
                        System.out.printf("a / b = %.4f", (a / b));
                        break;
                    default:
                        System.out.println("Вы ввели некорректный оператор");
                        break;
                }
                break;
            case 2:
                System.out.println("Задайте размерность массива");
                String[] arr = new String[s.nextInt()];
                for (int i = 0; i < arr.length; i++) {
                    System.out.printf("Введите слово №%d\n", i + 1);
                    arr[i] = s.next();
                }
                String max = arr[0];
                for (String value : arr) {
                    if (value.length() > max.length()) {
                        max = value;
                    }
                }
                System.out.println(max);
                break;
        }
        s.close();
    }
}