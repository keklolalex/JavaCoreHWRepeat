package ru.itmo.HW.HW6.workTwo;


import ru.itmo.HW.HW6.workTwo.product.Product;

public class Application {
    public static void main(String[] args) {

        Product vegan = new Product();
        vegan.sport(100,150);
        System.out.println(vegan.getProteins());


    }
}
