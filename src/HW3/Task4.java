package HW3;

/*
Задача на WHILE

Считать с консоли количество тарелок и моющего средства.
Моющее средство расходуется из расчета 0.5 на 1 тарелку (за один раз расходуется 0.5 средства и 1 тарелка).
В цикле выводить сколько моющего средства осталось после мытья каждой тарелки.
После цыкла вывести сколько тарелок и моющего средства осталось.
 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int plate = in.nextInt();
        double dish = in.nextDouble();
        int count = 0; //надо было цикл добавить на проверку ввода
        while (dish > 0 && plate >= 0.5){ // тут была ошибка надо было 0.5 на мыло, ведь может в минус пойти
            plate -= 1;
            dish -= 0.5;
            count++;
            //if (plate == 0) break; // по идеи эта строка не нужна
            System.out.println(dish) ;
        }
        System.out.println(count); // просто ввел счетчик для подсчета сколько он раз выполнил действия
        System.out.print(plate + " " + dish);
        //System.out.println(dish);
    }
}