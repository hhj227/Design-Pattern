package abstract_factory_hf.store;

import abstract_factory_hf.ingredient.ChicagoPizzaIngredientFactory;
import abstract_factory_hf.ingredient.PizzaIngredientFactory;
import abstract_factory_hf.pizza.CheesePizza;
import abstract_factory_hf.pizza.PepperoniPizza;
import abstract_factory_hf.pizza.Pizza;
import abstract_factory_hf.pizza.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore{
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new ChicagoPizzaIngredientFactory();

        if (item.equals("cheese")) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");

        } else if (item.equals("veggie")) {

            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");

        } else if (item.equals("pepperoni")) {

            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");

        }
        return pizza;
    }
}
