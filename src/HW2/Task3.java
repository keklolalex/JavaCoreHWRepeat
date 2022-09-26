package HW2;
/*
Задача на if

Дана целочисленная переменная count - количество верных ответов. В зависимости от значения этой
переменной вывести в консоль оценку: 100 - 90 правильных ответов - отлично 89 - 60 правильных ответов -
хорошо 59 - 40 правильных ответов - удовлетворительно 39 - 0 правильных ответов - попробуйте в следующий раз
 */
public class Task3 {
    public static void main(String[] args) {
        int count = 23;
        if (count > 100 || count < 40) System.out.println("попробуйте в следующий раз");
        else if (count <= 100 && count >= 90) System.out.println("отлично");
        else if (count <= 89 && count >= 60) System.out.println("хорошо");
        else if (count <= 59 && count >= 40) System.out.println("удовлетворительно");
    }
}
