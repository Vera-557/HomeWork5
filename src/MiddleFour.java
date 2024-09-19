/*Вычислить факториал числа, которое ввёл пользователь.
 Факториал числа представляет собой произведение всех натуральных чисел
 от 1 до этого числа включительно. Например, факториал числа 7 вычисляется
 так: 1 * 2 * 3 * 4 * 5 * 6 * 7
 */

import java.util.Scanner;

public class MiddleFour {
    public static void main(String[] args) {
        System.out.println("Введите необходимое количество ячеек массива");
        int size = new Scanner(System.in).nextInt();
        System.out.println("Введите числовые значения массива");
        int[] array = new int[size];
        for (int element = 0; element < size; element++) {
            array[element] = new Scanner(System.in).nextInt();

        }
        int num = 1;
        for (int element : array) {
            num *= element;

        }
        System.out.println("Факториал = " + num);

    }
}
