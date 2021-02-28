package abstract_factory_hf.store;

import abstract_factory_hf.ingredient.NYPizzaIngredientFactory;
import abstract_factory_hf.ingredient.PizzaIngredientFactory;
import abstract_factory_hf.pizza.CheesePizza;
import abstract_factory_hf.pizza.PepperoniPizza;
import abstract_factory_hf.pizza.Pizza;
import abstract_factory_hf.pizza.VeggiePizza;

public class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");

        } else if (item.equals("veggie")) {

            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");

        } else if (item.equals("pepperoni")) {

            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");

        }
        return pizza;
    }
}
