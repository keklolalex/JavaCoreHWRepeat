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
        for (int i = 0; i < n; i++){
            System.out.println("Ведите слово или текст");
            String newWord = new Scanner(System.in).nextLine(); //записал какое то число
            if (newWord.equals("exit")){
                break;
            }
            /*
            String[] cloneArr = mass.clone(); // склонировал массив
            mass[i] = newWord; //присвоил значению в старом массиве новое значение
            if (Arrays.equals(mass, cloneArr) == true){
                break;
            }
            */

            }
            for (int j = 0; j <= i; j++){
                boolean pool = mass[j].equals(newWord);
                if (pool == true){
                    break;
                }
            }

            mass[i] = newWord;
        }
        System.out.println(Arrays.toString(mass));
    }
}
