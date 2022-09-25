package HW2;

public class Task5 {
    public static void main(String[] args) {
        int age = (int) (Math.random() * 150);
        int exp = (int) (Math.random() * 11);
        if (age > 100) {
            System.out.println(age + " " + exp);
            System.out.println("Мы Вам перезвоним");
        }
        else if (exp < 5 && age <= 100) {
            System.out.println(age + " " + exp);
            System.out.println("Вы подходите на должность стажера");
        }
        else if (exp >= 5 && age <= 100){
            System.out.println(age + " " + exp);
            System.out.println("Вы подходите на должность разработчика");
        }

    }
}

