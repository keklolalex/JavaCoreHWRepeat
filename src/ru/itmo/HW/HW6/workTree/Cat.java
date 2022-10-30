package ru.itmo.HW.HW6.workTree;

/*
Класс Кот: имя, скорость, вес, пойманные мыши;
Кот хранит информацию о пойманных мышах (максимум о 100).
Кот ловит мышь, только, если его скорость выше, чем у мыши.
Кот может напасть на другого кота и, если он больше противника (по весу),
    то может отобрать его мышей (если скорость мыши выше, чем скорость кота, она убежит).
 */

public class Cat {
    private String name;
    private double speedCat;
    private int massa;

    private int catBox = 0;

    public Cat(){}

    public Cat(String name, int speed, int massa){
        setName(name);
        setSpeedCat(speed);
        setMassa(massa);
    }

    public Cat(String name, int speed, int massa, int catBox){
        setName(name);
        setSpeedCat(speed);
        setMassa(massa);
        this.catBox = catBox;
    }


    public int catchMouse(Mouse speedMouse, Cat speedCat){ //ловить мышь
        if (catBox > 100){
            throw new IllegalArgumentException("Кот переел");
        }
        if (speedCat.getSpeedCat() > speedMouse.getSpeedMouse()){
            return catBox++;
        }
        return catBox;
    }

    public void attackCat (Cat massa, int massa2){
        if (){

        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null){
            throw new IllegalArgumentException("Не введено имя");
        }
        if (name.length() < 3){
            throw new IllegalArgumentException("Имя не может быть меньше 3 букв");
        }
        this.name = name;
    }

    public double getSpeedCat() {
        return speedCat;
    }

    public void setSpeedCat(int speedCat) {
        if (speedCat <= 0){
            throw new IllegalArgumentException("Скорость кота никакая");
        }
        if (speedCat > 100){
            throw new IllegalArgumentException("Скорость кота крайне высока");
        }
        this.speedCat = speedCat;
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        if (massa <= 0){
            throw new IllegalArgumentException("Вес кота такой что он хуже чем умер");
        }
        if (massa > 50){
            throw new IllegalArgumentException("Кот больше никого не поймает с таким весом");
        }
        this.massa = massa;
    }

    public int getCatBox() {
        return catBox;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", speedCat=" + speedCat +
                ", massa=" + massa +
                ", catBox=" + catBox +
                '}';
    }
}
