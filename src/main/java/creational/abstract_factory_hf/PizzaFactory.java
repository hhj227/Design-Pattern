package creational.abstract_factory_hf;

import creational.abstract_factory_hf.pizza.Pizza;

public interface PizzaFactory {
    Pizza createPizza(String type);
}
