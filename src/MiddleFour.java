/*Вычислить факториал числа, которое ввёл пользователь.
 Факториал числа представляет собой произведение всех натуральных чисел
 от 1 до этого числа включительно. Например, факториал числа 7 вычисляется
 так: 1 * 2 * 3 * 4 * 5 * 6 * 7
 */

import java.util.Scanner;

public class MiddleFour {
    public static void main(String[] args) {
        System.out.println("Введите число, из которого мы вычислим факториал");
        int num = new Scanner(System.in).nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
            System.out.println("Факториал = " + factorial);
        }

    }
}
