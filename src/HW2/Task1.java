package HW2;

/*
Задача на IF

Дан номер месяца, например int month = 5. В зависимости от данного значения вывести в консоль время года
 */
public class Task1 {
    public static void main(String[] args) {
        byte mounth = -1;
        if (mounth <= 0 || mounth > 12) System.out.println("Введите верный параметр");
        else if (mounth == 12 || mounth == 1 || mounth == 2) System.out.println("Зима");
        else if (mounth == 3 || mounth == 4 || mounth == 5) System.out.println("Весна");
        else if (mounth == 6 || mounth == 7 || mounth == 8) System.out.println("Лето");
        else  System.out.println("Осень");
    }
}
