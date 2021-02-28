package abstract_factory_hf;

import abstract_factory_hf.pizza.Pizza;

public interface PizzaFactory {
    Pizza createPizza(String type);
}
