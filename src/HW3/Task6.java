package HW3;

import java.util.Scanner;

/*
Задача на использование любого цикла (выберите сами) ***

Пользователь загадывает число в диапазоне от [2 до 100]
Программа пытается его угадать (используйте метод бинарного поиска, т.е деление отрезка на 2).
Программа может задавать пользователю вопросы: Число равно ...?, Число больше ...? и в зависимоти от ответа пользователя принимать решения.
Вместо текстовых ответов ДА/НЕТ, используйте числа 0 - НЕТ и 1 - ДА
 */
public class Task6 {
    public static void main(String[] args) {
        //int random = (int) (2 + Math.random() * 99);
        Scanner in = new Scanner(System.in);
        int game = in.nextInt(); //вводим число что загадывает пользователь
        int left = 2;
        int right = 100;
        int mid = (left + right) / 2;
        for (; game != mid; mid = (left + right) / 2) {
            System.out.println("число равно " + mid + " ?");
            int choice = in.nextInt(); //0 нет
            if (choice == 0) {
                System.out.println("число больше " + mid + " ?");
                int choiceOne = in.nextInt(); //0 нет
                if (choiceOne == 0) right = mid;
                else left = mid; // это же не обязательно писать без квадратных скобок?
            } else System.out.println("угадал число " + game); // на эту строку программе все равно почему? если при числе 1 она должна вполниться
        }System.out.println("угадал число " + game);
    }
}
