//Для каждого натурального числа в промежутке от N вывести все делители, кроме единицы и самого числа.
// Значение N вводятся с клавиатуры. N может принимать значение от 1 до 100.

import java.util.Scanner;

public class MiddleThird {
    public static void main(String[] args) {
        System.out.println("Задайте необходимое количество значений");
        int n = new Scanner(System.in).nextInt();
        if (n >= 1 && n <= 100) {
            System.out.println("Введите ряд натуральных чисел, согласно заданному количеству");
            double[] nums = new double[n];
            for (int element = 0; element < n; element++) {
                nums[element] = new Scanner(System.in).nextDouble();

            }
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] % 2 == 1) {
                    System.out.println("Result " + i);
                } else System.out.println("j");
            }
            //Я не могу решить эту задачу
        } else System.out.println("Вы ввели неверное значение, код не может быть выполнен.");


    }
}
