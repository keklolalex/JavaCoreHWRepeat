package HW3;
/*
Задачи на FOR (можно не решать, если циклы понятны)

Вывести все неотрицательные элементы последовательности 90 85 80 75 70 65 60 и тд

 */

public class Task1 {
    public static void main(String[] args) {
        for (int start = 90; start > 0; start -= 5){ // 0 нет в выводе т.к. оно ни положительное не отрицательное
            System.out.println(start);
        }
    }
}
