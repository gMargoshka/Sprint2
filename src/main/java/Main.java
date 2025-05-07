import ru.yandex.praktikum.model.Apple;
import ru.yandex.praktikum.model.Food;
import ru.yandex.praktikum.model.Meat;
import ru.yandex.praktikum.service.ShoppingCart;


public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5,100.00);
        Food redApple = new Apple(10,50.00, "red");
        Food greenApple = new Apple(8,60.00, "green");

        Food[] food = {meat,redApple,greenApple};

        ShoppingCart shoppingCart = new ShoppingCart(food);

        System.out.println("Общая сумма товаров без скидки: " + shoppingCart.getTotalAmountWithoutDiscount());
        System.out.println("Общая сумма товаров со скидкой: " + shoppingCart.getTotalAmountWithDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + shoppingCart.getVeganTotal());
    }
}
