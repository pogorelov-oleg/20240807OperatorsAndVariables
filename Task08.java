/**
 * 8. Зная скорость распространения звука в воздушной среде, можно вычислить расстояние до места удара молнии по
 * времени между вспышкой и раскатом грома. Зная время в
 * секундах между вспышкой и раскатом грома (константа в
 * программе), вычислите расстояния до места удара молнии и
 * выведите его на экран.
 */
public class Task08 {
    public static void main(String[] args) {
        final int SPEED_OF_SOUND = 331; //метров в секунду
        final int TIME = 5;

        System.out.println("Расстояние до места удара молнии = " + SPEED_OF_SOUND * TIME + " метров");
    }
}
