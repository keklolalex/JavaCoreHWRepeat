package HW1;

public class Task3 {
    public static void main(String[] args) {
        double time  = 9.15;
        time = time * 60 * 60; //перевод в секунды
        double distance = 7.321;
        distance *= 1000; //перевод в метры
        double speed = time * distance;
        System.out.println(speed);
    }
}
