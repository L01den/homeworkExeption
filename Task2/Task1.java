package Task2;
//        Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//        и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
//        вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        show();
    }

    public static void show() {

        boolean done = false;
        while (!done) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите дробное число");
            try {
                float num = sc.nextFloat();
                System.out.println("Ваше число " + num);
                done = true;
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели не дробное число");
            }
        }

    }
}
