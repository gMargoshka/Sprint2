package ru.yandex.praktikum.model;

public interface Discountable {
    default double getDiscount() {
        return 0.0;
    }

}
