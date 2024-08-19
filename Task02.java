import java.util.Scanner;

/**
 * 2. В переменной n хранится натуральное (целое) трехзначное число.
 * Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
 */
public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите трехзначное число: ");
        int n = sc.nextInt();

        int a = n / 100; //вычисляем значение первого числа
        int b = n / 10 % 10; //вычисляем значение второго числа
        int c = n % 10; //вычисляем значение третьего числа

        System.out.println("Сумма цифр числа " + n + " = " + (a + b + c));
    }
}
