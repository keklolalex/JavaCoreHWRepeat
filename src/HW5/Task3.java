package HW5;

import java.util.Arrays;
import java.util.Scanner;

/*
Задать массив на N слов. В цикле считывать с консоли слова (scanner.nextLine()),
и добавлять их в массив (добавлять новое слово в массив можно только, если в нем его еще нет).
В итоге в массиве будут только уникальные слова.

Выход из программы по слову exit (слово 'exit' в массив не добавлять) или если массив заполнен.
Перед завершением программы, вывести получившийся массив в консоль
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ведите длину массива");
        int n = in.nextInt();
        String[] mass = new String[n];
        for (int i = 0; i < mass.length; i++){
            System.out.println("Ведите слово или текст");
            String newWord = new Scanner(System.in).nextLine(); //записал какое-то слово
            mass[i] = newWord;
            for (int g = i + 1; g < mass.length; g++){
                if (newWord != null /*true*/ || newWord.equalsIgnoreCase(mass[g]) /*но здесь то всегда false почти*/) { //если try надо выйти из цикла
                    System.out.println(mass[g]);
                    break;
                }
            }
            if (newWord.equals("exit")){ //если try надо выйти из цикла
                break;
            }
        }
        System.out.println(Arrays.toString(mass));
    }
}
