/**
 * 5. Подсчитать площадь и длину окружности для круга с радиусом R.
 * Радиус должен быть задан константой в программе. Вывести результат на консоль.
 */
public class Task05 {
    public static void main(String[] args) {
        final double R = 3;

        System.out.println("Площадь круга = " + Math.PI * (R * R));
        System.out.println("Длина окружности = " + 2 * Math.PI * R);
    }
}
