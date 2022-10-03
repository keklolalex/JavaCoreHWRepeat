package HW5;

import java.util.Arrays;

/*
Задать массив. Отрицательные элементы массива перенести в новый массив.
Размер массива должен быть равен количеству отрицательных элементов.
 */
public class Task5 {
    public static void main(String[] args) {
        int[] otr = {-1, 32, 12, 93, -5, 0, 43, -54, -654, 23, -8}; //нули не считает только
        int minusCount = 0;
        for (int i : otr) {
            if (i < 0) minusCount++;
        }

        int[] minus = new int[minusCount];
        System.out.println(Arrays.toString(minus));
        int minusCount1 = 0;

        for (int element : otr) {
           if (element < 0) {
                minus[minusCount1] = element;
                minusCount1++;
            }
        }
        System.out.println(Arrays.toString(minus));
        }
    }
