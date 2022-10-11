package ru.itmo.HW.HW6.workTwo.product;

/*
Свойства: название продукта / белки / жиры / углеводы / калории TODO: Done
Минимум 4 конструктора TODO: Done
Реализовать необходимые проверки входящих данных TODO: Done
Создать не менее 4 экземпляров данного класса (объектов) TODO: Done
 */
public class Product {

    private int proteins; //белки
    private int fats; //жиры
    private int carbohydrates; //углеводы
    private int calories; //калории

    public void sport(int proteins, int calories){ //для спорта
        this.setProteins(proteins);
        this.setCalories(calories);
    }

    public void vegan(int proteins, int carbohydrates, int calories){ //для веганов
        this.setProteins(proteins);
        this.setCalories(calories);
        this.setCarbohydrates(carbohydrates);
    }

    public void homeStress(int fats, int carbohydrates, int calories){ //для стресса
        this.setFats(fats);
        this.setCalories(calories);
        this.setCarbohydrates(carbohydrates);
    }

    public void product(int proteins, int fats, int carbohydrates, int calories) {
        this.setProteins(proteins);
        this.setFats(fats);
        this.setCarbohydrates(carbohydrates);
        this.setCalories(calories);
    }

    public int getProteins() {
        return proteins;
    }

    public void setProteins(int proteins) {
        if (proteins < 0){
            throw new IllegalArgumentException("Ну хоть чуть то надо за собой следить");
        }
        this.proteins = proteins;
    }

    public int getFats() {
        return fats;
    }

    public void setFats(int fats) {
        if (fats < 0){
            throw new IllegalArgumentException("Звучит как полезный продукт, но нет");
        }
        this.fats = fats;
    }

    public int getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(int carbohydrates) {
        if (carbohydrates < 0){
            throw new IllegalArgumentException("Самый вредный продукт");
        }
        this.carbohydrates = carbohydrates;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        if (calories < 0){
            throw new IllegalArgumentException("Это не возможно, ты умрешь, должно быть больше 0");
        }
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Product{" +
                "proteins=" + proteins +
                ", fats=" + fats +
                ", carbohydrates=" + carbohydrates +
                ", calories=" + calories +
                '}';
    }
}
