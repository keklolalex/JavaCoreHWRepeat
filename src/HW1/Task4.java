package HW1;

public class Task4 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = a % b; //взятие остатка
        System.out.println(c);

        int a1 = 87;
        int b1 = a1 % 10; // взяли остаток от 87 это 7
        int b2 = a1 / 10; // взяли целое число от 87 это 8
        System.out.println(b1 + b2); // сложили 2 числа
    }
}
