package HW5;

import java.util.Arrays;

/*
Задать массив. Отрицательные элементы массива перенести в новый массив.
Размер массива должен быть равен количеству отрицательных элементов.
 */
public class Task5 {
    public static void main(String[] args) {
        int[] otr = {-1, 32, 12, 93, -5, 0, 43, -54, -654, 23, -8}; //нули не считает только
        int plusCount = 0;
        int minusCount = 0;
        for (int i : otr) {
            if (i > 0) plusCount++;
            else if (i < 0) minusCount++;
        }

        int[] plus = new int[plusCount];
        System.out.println(Arrays.toString(plus));
        int[] minus = new int[minusCount];
        System.out.println(Arrays.toString(minus));
        int plusCount1 = 0;
        int minusCount1 = 0;

        for (int element : otr) {
            if (element > 0) {
                plus[plusCount1] = element;
                plusCount1++;
            }
            else if (element < 0) {
                minus[minusCount1] = element;
                minusCount1++;
            }
        }
        System.out.println(Arrays.toString(plus));
        System.out.println(Arrays.toString(minus));

        }
    }
