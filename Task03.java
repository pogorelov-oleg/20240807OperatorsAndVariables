import java.util.Scanner;

/**
 * 3. В переменной n хранится вещественное число, с ненулевой дробной частью. Создайте программу, округляющую
 * число n до ближайшего целого и выводящую результат
 * округления на экран.
 */
public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите вещественное число, с ненулевой дробной частью: ");
        double n = sc.nextDouble();

        System.out.println("Результат округления: " + Math.round(n));
    }
}
