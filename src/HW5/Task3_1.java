package HW5;

/*
Задать массив на N слов. В цикле считывать с консоли слова (scanner.nextLine()),
и добавлять их в массив (добавлять новое слово в массив можно только, если в нем его еще нет).
В итоге в массиве будут только уникальные слова.

Выход из программы по слову exit (слово 'exit' в массив не добавлять) или если массив заполнен.
Перед завершением программы, вывести получившийся массив в консоль
 */

import java.util.Arrays;
import java.util.Scanner;

public class Task3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] priss = new String[n];
        in.nextLine();
        for (int i = 0; i < priss.length; i++) {
            boolean getTrueWord = false;
            System.out.println("Ведите слово или текст");
            String word = in.nextLine();
            if (word.equals("exit")) { //если true надо выйти из цикла
                break;
            }
            if (word.trim().isBlank()) { //удаляем пробелы и если true то возвращаемся в цикл заново слово вводить
                i--;
                continue;
            }
            for (String wordPriss: priss){ //проверка на null чтобы их не было в цикле
                if (wordPriss == null){
                    continue;
                }
                if (wordPriss.equalsIgnoreCase(word)){
                    getTrueWord = true;
                }
            }
            if (getTrueWord){
                i--;
                continue;
            }
            priss[i] = word;
        }
        System.out.println(Arrays.toString(priss));
    }
}
