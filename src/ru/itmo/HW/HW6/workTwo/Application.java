package ru.itmo.HW.HW6.workTwo;


import ru.itmo.HW.HW6.workTwo.product.MyProducts;
import ru.itmo.HW.HW6.workTwo.product.Product;

public class Application {
    public static void main(String[] args) {

        Product vegan = new Product();
        Product name = new Product();
        System.out.println(name);

        vegan.sport(100,150);
        System.out.println(vegan.getProteins());

        Product vegan01 = new Product();
        vegan01.sport(100, 200);
        vegan01.name = "Батончик для спорта";
        Product vegan02 = new Product();
        vegan02.vegan(200,320,180);
        vegan02.name = "Булочка без мяса";
        Product sport01 = new Product();
        sport01.product(250, 100, 200, 300);
        sport01.name = "Спорт";
        //vegan01.homeStress(500,320,600);
        MyProducts packet01 = new MyProducts(3);
        packet01.addProduct(vegan01);
        packet01.addProduct(vegan02);
        packet01.addProduct(sport01);
        System.out.println(packet01);

        Product yumy = new Product(230,100, 200);
        System.out.println(yumy);

        MyProducts packet02 = new MyProducts(5);









    }
}
