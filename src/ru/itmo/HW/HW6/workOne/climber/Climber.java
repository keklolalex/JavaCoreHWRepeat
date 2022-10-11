package ru.itmo.HW.HW6.workOne.climber;

/*
Альпинист создаётся с именем (не менее 3 символов) и адресом проживания (не менее 5 символов).
 */
public class Climber { //альпинист

    //сделать проверку на null

    private String name;

    private String address;

    public Climber(String name, String address){ //делает 2 проверки и инициализирует обьекты
        setName(name);
        setAddress(address);
    }

    public void setName(String name){
        if (name.length() < 3){
            throw new IllegalArgumentException("Введите длиннее имя >3 символов");
        }
        this.name = name;
    }

    public void setAddress(String address){
        if (address.length() < 5){
            throw new IllegalArgumentException("Введите длиннее имя >5 символов");
        }
        this.address = address;
    }

    @Override
    public String toString() {
        return "Climber{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
