package ru.itmo.HW.HW6.workOne.mountain;

/*
Гора создаётся с названием (не менее 4 символов), страной (не менее 4 символов) и высотой (не менее 100 метров)
 */
public class Mountain { //гора

    private String name;

    private String country;

    private int high;

    public Mountain(String name, String country, int high){
        setName(name);
        setCountry(country);
        setHigh(high);
    }
    public void setName(String title){
        if (title.length() <= 4){
            throw new IllegalArgumentException("Введите длиннее имя");
        }
        name = title;
    }

    public void setCountry(String title){
        if (title.length() <= 4){
            throw new IllegalArgumentException("Введите длиннее имя");
        }
        country = title;
    }

    public void setHigh(int title){
        if (title < 100){
            throw new IllegalArgumentException("Введите длиннее имя");
        }
        high = title;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Mountain{" +
                "mountain='" + name + '\'' +
                ", country='" + country + '\'' +
                ", high=" + high +
                '}';
    }
}
