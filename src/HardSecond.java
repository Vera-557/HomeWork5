/*Создать программу, которая из заданного массива будет удалять
все повторяющиеся элементы (порядок не важен). С консоли вводится в первой
строке длина массива, а во второй строке — элементы массива. Длина массива
не более 1000 элементов, значение каждого элемента массива положительно и не превышает 1000. */

import java.util.Scanner;

public class HardSecond {
    public static void main(String[] args) {
        System.out.println("Введите количество ячеек в массиве");
        int kolichestvoYacheek = new Scanner(System.in).nextInt();
        System.out.println("Введите числа внутрь ячейки");
        int[] array = new int[kolichestvoYacheek];
        for (int i = 0; i < kolichestvoYacheek; i++) {
            array[i] = new Scanner(System.in).nextInt();
        }
        int[] novijMassiv = new int[kolichestvoYacheek];
        int Count = 0;
        for (int i = 0; i < kolichestvoYacheek; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < Count; j++) {
                if (array[i] == novijMassiv[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                novijMassiv[Count] = array[i];
                Count++;
            }
        }

        System.out.println("Массив без повторяющихся элементов:");
        for (int i = 0; i < Count; i++) {
            System.out.print(novijMassiv[i] + " ");


        }
    }
}