package abstract_factory_hf;

import abstract_factory_hf.pizza.ChicagoPizzaFactory;
import abstract_factory_hf.pizza.Pizza;
import abstract_factory_hf.store.ChicagoPizzaStore;
import abstract_factory_hf.store.NYPizzaStore;
import abstract_factory_hf.store.PizzaStore;
import org.junit.jupiter.api.Test;

class PizzaStoreTest {
    @Test
    void test(){
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan orderedr a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("veggie");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Joel ordered a " + pizza + "\n");
    }
}