import java.util.Scanner;

/**
 * 1. В переменных х и y хранятся два натуральных числа. Создайте программу, выводящую на консоль:
 * ■ результат целочисленного деления x на y;
 * ■ остаток от деления x на y;
 * ■ квадратный корень x.
 */
public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение переменной x: ");
        int x = sc.nextInt();
        System.out.print("Введите значение переменной y: ");
        int y = sc.nextInt();

        System.out.println("\nx / y (целоцисленное деление) = " + x / y);
        System.out.println("x % y (остаток от деления) = " + x % y);
        System.out.println("x^2 (квадратный корень) = " + x * x);
    }
}
