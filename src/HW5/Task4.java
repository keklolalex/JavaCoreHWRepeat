package HW5;

import java.util.Arrays;

/*
Найдите самое длинное слово в предложении, при условии, что в предложении все слова разной длины.
Предложение для поиска длинного слова: "в предложении все слова разной длины"
(самостоятельно найти метод преобразования строки в массив строк).
 */
public class Task4 {
    public static void main(String[] args) {
        String pool = "в предложении все слова разной длины";
        String[] words = pool.split(" "); //преобразование строки в массив
        System.out.println(Arrays.toString(words));
        Arrays.sort(words);
        //System.out.println(Arrays.toString(words));
        String bon = words[0];
        //System.out.println(bon);
        int maxMax = words[0].length();
        for (int i = 1; i < words.length; i++){
            if (maxMax < words[i].length()) {
                maxMax = words[i].length();
                bon = words[i];
            }
        }System.out.println(bon);
    }
}

