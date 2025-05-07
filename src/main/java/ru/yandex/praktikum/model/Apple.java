package ru.yandex.praktikum.model;

import ru.yandex.praktikum.model.constants.Colour;
import ru.yandex.praktikum.model.constants.Discount;

public class Apple extends Food {

    private final String colour; // final, чтобы дальше нельзя было изменить цвет созданного яблока

    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public double getDiscount() {

        if (Colour.RED.equals(colour)) {
            return Discount.DISCOUNT_60;
        }

        return 0.0;

//        return Colour.RED.equals(colour) ? Discount.DISCOUNT_60 : 0.0;
    }

}
