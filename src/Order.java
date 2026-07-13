import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public class Order {
    private final String customer;
    private final Product[] basket;

    public Order(String customer, Product[] basket){
        this.customer = customer;
        this.basket = basket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;
        if (!Objects.equals(customer, order.customer)) return false;
        if (basket.length != order.basket.length) return false;
        for (int i = 0; i < basket.length; i++) {
            if (!Objects.equals(basket[i], order.basket[i])) {
                return false;
            }
        }
        return true;
    }
}
