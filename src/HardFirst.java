/*Вывести на экран ряд чисел Фибоначчи, состоящий из N элементов.
Значение N вводится с клавиатуры. Числа Фибоначчи – это элементы
числовой последовательности 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, …,
в которой каждое последующее число равно сумме двух предыдущих.*/

import java.util.Scanner;

public class HardFirst {
    public static void main(String[] args) {
        System.out.println("Введите значение N");
        int n = new Scanner(System.in).nextInt();
        if (n <= 0) {
        } else {
            int[] fibonacci = new int[n];
            fibonacci[0] = 0;
            if (n > 1) {
                fibonacci[1] = 1;
                for (int i = 2; i < n; i++) {
                    fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
                }
            }
            System.out.println("Числа Фибоначчи:");
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci[i] + " ");
            }
        }



}
}
