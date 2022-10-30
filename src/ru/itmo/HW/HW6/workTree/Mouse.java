package ru.itmo.HW.HW6.workTree;

/*
Класс Мышь: скорость.
 */
public class Mouse {
    private double speedMouse;

    public Mouse(){}

    public Mouse(double speed){
        setSpeedMouse(speed);
    }

    public double getSpeedMouse() {
        return speedMouse;
    }

    public void setSpeedMouse(double speedMouse) {
        if (speedMouse < 0.0){
            throw new IllegalArgumentException("Мышь должна бежать");
        }
        if (speedMouse > 100.0){
            throw new IllegalArgumentException("Мышь стала иллюзией дб меньше 100 скорость");
        }
        this.speedMouse = speedMouse;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "speed=" + speedMouse +
                '}';
    }
}
