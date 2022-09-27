package HW3;
/*
Задача на WHILE (можно не решать, если циклы понятны)
Для введённого пользователем с клавиатуры целого положительного числа посчитайте сумму всех его цифр
 */

import java.util.Scanner;

public class Task3 {
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int newNumber = 0;
        while(number != 0){
            newNumber += number % 10;
            number /= 10;
            }
        System.out.println(newNumber); // в целом понятно берем остаток и целые числа, но все равно пришлось подумать логику
   }
}
