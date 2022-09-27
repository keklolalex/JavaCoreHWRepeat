package HW3;
/*
Вывести на экран первые 10 элементов последовательности 2 4 6 8 10 и тд
 */
public class Task2 {
    public static void main(String[] args) {
        for (int i = 0, start = 2; i < 10; i++, start += 2){
        /*
        наверное можно start перенести внутрь цикла так будет наверное правильно?
        но он все равно изменится же в след итерации
        */
            // i - это счетчик
            System.out.println(start);
        }
    }
}
