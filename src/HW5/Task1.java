package HW5;

/*
Заполните массив на N элементов случайным целыми числами и выведете максимальное,
минимальное и среднее арифметическое значение элементов массива
 */

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int len = 100;
        float[] randomYang = new float[len];
        System.out.println(Arrays.toString(randomYang)); //выведет пустой массив
        for (int i = 0; i < len; i++) {
            float random = (float) Math.random() * 101;
            randomYang[i] = random;
        }
        System.out.println(Arrays.toString(randomYang)); //вывод массива со значениями случайными

        Arrays.sort(randomYang);

        int number = randomYang.length -1; //99, потому что массив из 100 символов но индекс с 0 начинается
        float number1 = randomYang[number];
        System.out.println(number1); // выведет последнее значение массива, т.к. массив отсортирован и последнее значение точно максимум

        //поиск максимума
        //метов foreach, перебором в массиве
        float maxMax = randomYang[0];
        for (float max : randomYang) {
            if (max > maxMax) {
                maxMax = max;
            }
        }
        System.out.println(maxMax);

        //1 способ поиск минимума
        //массив уже отсортирован, а значит
        float minimum = randomYang[0];
        System.out.println(minimum);

        //поиск минимума с foreach
        float minMin = randomYang[0];
        for (float min : randomYang) {
            if (min < minMin) {
                minMin = min;
            }
        }
        System.out.println(minMin);

        //нахождение среднего значения
        float middle = randomYang[0];
        for (float mid: randomYang){
            middle += mid;
        }float finish = middle / randomYang.length;
        //return (float) middle / randomYang.length; //в статьях была такая запись но не понятно как это работает
        System.out.println(finish);


    }
}
