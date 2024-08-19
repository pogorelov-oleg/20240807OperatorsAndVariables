/**
 * 10. Написать программу расчета идеального веса к росту. В
 * константах хранятся рост (height) и вес (weight). Вывести на
 * консоль сообщение, сколько килограмм нужно набрать или
 * сбросить (идеальный вес = рост - 110).
 */
public class Task10 {
    public static void main(String[] args) {
        final double HEIGHT = 158;
        final double WEIGHT = 51.5;

        double idealWeight = HEIGHT -110;
        System.out.println("Ваш идеальный вес: " + idealWeight);

        if (WEIGHT > idealWeight) {
            System.out.println("Для идеального веса Вам следует похудеть на " + (WEIGHT - idealWeight) + "кг");
        } else if (WEIGHT < idealWeight) {
            System.out.println("Для идеального веса Вам следует набрать " + (idealWeight - WEIGHT) + "кг");
        } else System.out.println("У Вас идеальный вес");
    }
}
