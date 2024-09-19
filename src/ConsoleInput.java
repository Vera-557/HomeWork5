/*Допишите программу, которая возводит число в целочисленную степень.
Число и степень вводятся с клавиатуры. Использовать цикл для возведения в степень.
*/
import java.util.Scanner;

public class ConsoleInput {
    public static void main(String[] args) {
        System.out.println("Введите число и степень");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        double k = Math.pow(a, n);
        int k1 = (int) k;
        //так
        System.out.println("Вывод : " + (Math.pow(a, n)));
        //Или вот так
        System.out.println("Вывод : " + k1);
    }
}