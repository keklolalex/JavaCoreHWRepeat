package ru.itmo.HW.HW6.workTwo.product;
import java.util.Arrays;

/*
Класс МоиПродукты:
Свойства: максимальное количество белков / жиров / углеводов / калорий / список продуктов (массив)
Реализовать метод, который принимает на Продукт и добавляет его в список, если характеристики
    продукта полностью соответствуют заявленным разрешениям, в противном случае сообщить,
    по какой причине продукт не может быть добавлен в список (например, слишком большое содержание калорий)
Реализовать метод, который выводит названия всех продуктов из списка
При выполнении задания необходимо обращать внимание на модификаторы доступа и выполнять все необходимые проверки.
 */

public class MyProducts {
    private int maxProteins = 300;
    private int maxFats = 500;
    private int maxCarbohydrates = 400;
    private int maxCalories = 800;
    private Product name;
    private Product[] myProducts;

    public Product getName(Product name) {
        return this.name;
    }
    public void setName(Product name) {
        if (name == null) {
            throw new IllegalArgumentException("author  не м.б null");
        }
        this.name = name;
    }
    public MyProducts(){}

    public MyProducts(Product name, int protein, int carbohydrates, int fats, int calories){
        setName(name);
    }
    public MyProducts (Product name, int protein, int Carbohydrates, int calories){

    }

    public MyProducts(int myProductsCount){
        if(myProductsCount <= 0){
            throw new IllegalArgumentException("Нужно ввести число больше 0, иначе ты не пойдешь в магазин");
        }
        myProducts = new Product[myProductsCount];
    }

    public void addProduct(Product product){
        if (maxCalories < product.getCalories()){
            System.out.println("Каллорий очень много");
            return;
        }
        if (maxFats < product.getFats()){
            System.out.println("Жиров очень много");
            return;
        }
        if (maxProteins < product.getProteins()){
            System.out.println("Белков очень много");
            return;
        }
        if (maxCarbohydrates < product.getCarbohydrates()){
            System.out.println("Углеводов очень много");
            return;
        }

        for (int i = 0; i < myProducts.length; i++) {
            if(myProducts[i] == null){
                myProducts[i] = product;
                return;
            }
        }
        System.out.println("Продукт " + getName(name) + " не по бюджету");
    }

    public int getMaxProteins() {
        return maxProteins;
    }
    public int getMaxFats() {
        return maxFats;
    }
    public int getMaxCarbohydrates() {
        return maxCarbohydrates;
    }
    public int getMaxCalories() {
        return maxCalories;
    }

    public void setMaxProteins(int maxProteins) {
        this.maxProteins = maxProteins;
    }

    public void setMaxFats(int maxFats) {
        this.maxFats = maxFats;
    }

    public void setMaxCarbohydrates(int maxCarbohydrates) {
        this.maxCarbohydrates = maxCarbohydrates;
    }

    public void setMaxCalories(int maxCalories) {
        this.maxCalories = maxCalories;
    }

    public Product[] getMyProducts() {
        return myProducts;
    }

    @Override
    public String toString() {
        return "MyProducts{" +
                "maxProteins=" + maxProteins +
                ", maxFats=" + maxFats +
                ", maxCarbohydrates=" + maxCarbohydrates +
                ", maxCalories=" + maxCalories +
                ", name=" + name +
                ", myProducts=" + Arrays.toString(myProducts) +
                '}';
    }
}
