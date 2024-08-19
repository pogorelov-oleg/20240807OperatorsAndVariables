import java.util.Scanner;

/**
 * 9. Проверить, имеет ли число вещественную часть. Например, числа 3.14 и 2.5 – имеют вещественную часть, а числа 5.0
 * и 10.0 – нет.
 */
public class Task09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        double n = sc.nextDouble();

        if (n % 1 == 0) {
            System.out.println("Вещественная часть - нет");
        } else System.out.println("Вещественная часть - есть");
    }
}
