package HW2;

public class Task3 {
    public static void main(String[] args) {
        int count = 1000;
        if (count <= 100 && count >= 90) System.out.println("отлично");
        else if (count <= 89 && count >= 60) System.out.println("хорошо");
        else if (count <= 59 && count >= 40) System.out.println("удовлетворительно");
        else System.out.println("попробуйте в следующий раз");
    }
}
