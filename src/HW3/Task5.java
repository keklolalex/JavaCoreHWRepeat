package HW3;

import java.util.Scanner;

/*
Задача на использование любого цикла (выберите сами)

Программа загадывает число в диапазоне [1;9]
Пользователь вводит число с клавиатуры
Программа в зависимости от введенного числа выводит в консоль следующее:
"загаданное число больше"
"загаданное число меньше"
"Вы угадали" (программа завершает работу)
Если введен 0, выввести "выход из программы" (программа завершает работу)
 */
public class Task5 {
    public static void main(String[] args) {
        int random = (int) (1 + Math.random() * 9);
        Scanner in = new Scanner(System.in);
        while (true){
            int game = in.nextInt();
            if (game == 0) {
                System.out.println("выход из программы ");
                break;
            }
            else if (random > game) {
                System.out.println("загаданное число больше");
            }
            else if (random < game) {
                System.out.println("загаданное число меньше");
            }
            else {
                System.out.println("Вы угадали " + random);
                break;
            }
            /* не понятен 1 момент почему не проходит такая запись break на каждое условие, можно ли break записывать с командой в одной строке
            if (random > game) System.out.println("загаданное число больше");
            else if (random < game) System.out.println("загаданное число меньше"); break;
            ...
            */
        }
    }
}
