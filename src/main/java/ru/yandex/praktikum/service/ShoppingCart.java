package ru.yandex.praktikum.service;

import ru.yandex.praktikum.model.Food;

public class ShoppingCart {

    private final Food[] items; //создала массив типа Food

    public ShoppingCart(Food[] items) { // создала конструктор с входным праметром массив Food
        this.items = items;
    }

    // метод, считающий общую сумму товаров в корзине без скидки:
    public double getTotalAmountWithoutDiscount() {

        double sum = 0;

        for (Food food : items) { // [1,2,3,4]
            sum = sum + food.getCost();
        }

//        if (items == null || items.length == 0) {
//            return sum;
//        }
//
//        for (int i = 0; i < items.length; i++) {
//            Food food = items[i];
//        }

        return sum;
    }
// метод, считающий общую сумму товаров в корзине без скидки:

    public double getTotalAmountWithDiscount() {
        double sum = 0;

        for (Food food : items) {
            double discountCoeff = 1 - food.getDiscount() / 100.0;
            sum = sum + (food.getCost() * discountCoeff);
        }

        return sum;
    }


    public double getVeganTotal() {
        double sum = 0;

        for (Food food : items) {
            if (food.isVegetarian()) {
                sum = sum + food.getCost();
            }
        }

        return sum;
    }
}

