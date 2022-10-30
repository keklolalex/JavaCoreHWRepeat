package ru.itmo.HW.HW6.workTree;

/*
Задача 3. Коты и мыши

Класс Мышь: скорость.
Класс Кот: имя, скорость, вес, пойманные мыши;
Кот хранит информацию о пойманных мышах (максимум о 100).
Кот ловит мышь, только, если его скорость выше, чем у мыши.
Кот может напасть на другого кота и, если он больше противника (по весу),
    то может отобрать его мышей (если скорость мыши выше, чем скорость кота, она убежит).
 */

public class Application {
    public static void main(String[] args) {

        //Random random = new Random();
        //int randomCountMouse = random.nextInt(101);

        Mouse mouse01 = new Mouse(14);
        System.out.println(mouse01);

        Mouse mouse02 = new Mouse(25);
        System.out.println(mouse02);

        Mouse mouse03 = new Mouse(50);
        System.out.println(mouse03);

        Cat cat01 = new Cat();
        cat01.setName("Bart");
        cat01.setSpeedCat(50);
        cat01.setMassa(13);
        System.out.println(cat01);

        Cat cat02 = new Cat("Tip", 55, 10);
        System.out.println(cat02);

        cat02.catchMouse(mouse01, cat02);
        System.out.println(cat02);
        cat01.catchMouse(mouse03, cat01);
        System.out.println(cat02);
        cat02.catchMouse(mouse02, cat02);
        System.out.println(cat02);









    }
}
