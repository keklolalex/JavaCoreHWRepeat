package HW2;

public class Task4 {
    public static void main(String[] args) {
        double random = 10 + (int) (Math.random() * 490);
        if (random > 25 && random < 200) System.out.println("Число" + " " + random + " " + " содержится в интервале (25;200)");
        else System.out.println("Число" + " " + random + " " + "не содержится в интервале (25;200)");
    }
}
