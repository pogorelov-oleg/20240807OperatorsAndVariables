/**
 * 12. Ученикам первого класса дают 1 пирожок. Если вес первоклассника менее 30 кг, дополнительно дают 1 стакан молока и ещё 1 пирожок. В первых классах школы учится n
 * учеников. Стакан молока имеет емкость 200 мл, а упаковка
 * молока – 0,9 л.
 * Написать программу, которая определит количество пакетов молока и пирожков, необходимых каждый день для
 * условий:
 * ■ если в школе 100% всех учеников, у которых вес меньше
 * 30 кг;
 * ■ если в школе 60% учеников имеют вес меньше 30 кг.
 * ■ если в школе 1% учеников имеют вес меньше 30 кг.
 * (!!!) Учесть, что нельзя купить два с половиной пакета
 * молока; можно купить два или три
 */
public class Task12 {
    public static void main(String[] args) {
        final int n = 72; //количество учеников
        System.out.println("\u001B[33mРассчитываем для 100%:\u001B[0m");
        productsCalculation(n, 100);
        System.out.println("\n\u001B[33mРассчитываем для 60%:\u001B[0m");
        productsCalculation(n, 60);
        System.out.println("\n\u001B[33mРассчитываем для 1%:\u001B[0m");
        productsCalculation(n, 1);
        System.out.println("\n\u001B[33mРассчитываем для 1 ученика (1,38888..% от 72 учеников):\u001B[0m");
        productsCalculation(n, 1.39);
    }

    public static void productsCalculation(int n, double studentsPrecent) {
        double precent = studentsPrecent;
        double skinnyStudents = Math.floor(n * precent / 100); //количество худых учеников
        //т.к. % учеников не всгда ровное количество я округляю к меньшему значению (не может быть не целое значение)

        int pie = n + (int) skinnyStudents;
        double milk = Math.ceil(200 * skinnyStudents / 900); //количество упаковок молока я округляю к большему значению
        System.out.printf("Из %d учеников %d имеют вес менее 30кг - ", n, (int) skinnyStudents);
        System.out.printf("необходимо пирожков: %d, пакетов молока: %d\n", pie, (int) milk);
    }
}
