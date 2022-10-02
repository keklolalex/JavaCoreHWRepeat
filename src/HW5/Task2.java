package HW5;

/*
Создайте массив из чётных чисел [2;20] и выведите элементы массива в консоль в обратном порядке (20 18 16 ... 4 2)
 */

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int len = 2;
        int len1 = 20;
        int[] poly = new int[len1 / len]; //создали массив из 10 чисел
        System.out.println(Arrays.toString(poly));
        for (int element = 0; element < poly.length; element++) {
            poly[element] = len;
            //System.out.println(Arrays.toString(poly));
            len += 2;
        }
        System.out.println(Arrays.toString(poly));


        //не лучший наверное способ создать новый массив чтобы его перезаписать
        int[] array = new int[poly.length]; // 10
        for (int i = (poly.length - 1), k = 0; i >= 0; i--, k++) {
            array[k] = poly[i];
        }
        System.out.println(Arrays.toString(array));

        //ну это замена последнего с первым, по середине элемент не участвует
        for (int i = 0; i < poly.length / 2; i++) {
            int last = poly[i];
            poly[i] = poly[poly.length - i - 1];
            poly[poly.length - i - 1] = last;
        }
        System.out.println(Arrays.toString(poly));
    }
}
