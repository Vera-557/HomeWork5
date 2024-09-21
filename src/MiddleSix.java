/*Написать программу для проверки знания таблицы умножения. Для этого необходимо сгенерировать числа А и В при помощи
new Random().nextInt() (смотри урок 4). Затем перемножить их и сохранить в переменную С.
Далее выведите на экран вопрос: “Сколько будет A * B?”. Пользователь вводит ответ.
Необходимо считать ответ пользователя и проверить, правильно ли он ответил. Выведите 5 примеров из таблицы умножения.
 */

import java.util.Random;
import java.util.Scanner;

public class MiddleSix {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Генерация двух случайных чисел");
            int a = new Random().nextInt(9) + 1;
            int b = new Random().nextInt(9) + 1;
            System.out.println(a + " * " + b);
            System.out.println("Введите ответ");
            int userAnsw = new Scanner(System.in).nextInt();
            int c = a * b;
            if (userAnsw == c) {
                System.out.println("Yes!");
            } else System.out.println("No! - " + c + ". Go back to school! ");
        }

    }

}

