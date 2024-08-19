import java.util.Scanner;

/**
 * Разработать программу, которая позволит при известном
 * годовом проценте вычислить сумму вклада в банке через
 * два года, если задана исходная величина вклада.
 */
public class Task07 {
    public static void main(String[] args) {
        final double ANNUAL_PRECENTAGE = 14.5; //годовой %
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сумму вклада: ");
        double deposit = sc.nextDouble(); //сумма вклада
        System.out.print("Введите срок вклада (количество лет): ");
        int term = sc.nextInt(); //срок вклада

        while (term > 0) {
            deposit = deposit + deposit / 100 * ANNUAL_PRECENTAGE;
            term--;
        }

        System.out.println(deposit);
    }
}
