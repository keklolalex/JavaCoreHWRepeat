package ru.itmo.HW.HW6.workTwo.product;

/*
Класс МоиПродукты:
Свойства: максимальное количество белков / жиров / углеводов / калорий / список продуктов (массив)
Реализовать метод, который принимает на Продукт и добавляет его в список, если характеристики
    продукта полностью соответствуют заявленным разрешениям, в противном случае сообщить,
    по какой причине продукт не может быть добавлен в список (например, слишком большое содержание калорий)
Реализовать метод, который выводит названия всех продуктов из списка
При выполнении задания необходимо обращать внимание на модификаторы доступа и выполнять все необходимые проверки.
 */

import java.util.Arrays;

public class MyProduct {
    private int maxProteins;
    private int maxFats;
    private int maxCarbohydrates;
    private int maxCalories;
    private String[] listProduct;






    @Override
    public String toString() {
        return "MyProduct{" +
                "maxProteins=" + maxProteins +
                ", maxFats=" + maxFats +
                ", maxCarbohydrates=" + maxCarbohydrates +
                ", maxCalories=" + maxCalories +
                ", listProduct=" + Arrays.toString(listProduct) +
                '}';
    }
}
